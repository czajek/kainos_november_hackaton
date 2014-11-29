package models;

import org.json.JSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class ResultsDao {
	
	public void saveResult(JSONObject json) throws Exception {
		MongoClient client = getMongoClient();
        DBCollection coll = getResultsCollection(client);
        
		DBObject dbObject = (DBObject) JSON
				.parse(json.toString());
        
        coll.insert(dbObject);
        client.close();
	}
	
	private MongoClient getMongoClient() throws Exception {
		MongoClient	client = new MongoClient( "localhost" , 27017 );

		return client;
	}

	private DBCollection getResultsCollection(MongoClient client) throws Exception {
		
        com.mongodb.DB db = client.getDB( "test" );
        boolean auth = db.authenticate("","".toCharArray());
        System.out.println("Authentication: "+auth);
        
        DBCollection coll = db.getCollection("results");

        return coll;
		
	}
	
	public JSONObject getResults(String obwodId) throws Exception {
		
		MongoClient client = new MongoClient();
		
		BasicDBObject field = new BasicDBObject();
		field.put("gmina.okrag_wyborczy.uid", obwodId);
		
		DBObject object = getResultsCollection(client).findOne(field);
		
		if (object == null) {
			return null;
		}
		String strJson = object.toString();
		JSONObject jsonObject = new JSONObject(strJson);
		
		client.close();
		return jsonObject;
		
	}

	
}
