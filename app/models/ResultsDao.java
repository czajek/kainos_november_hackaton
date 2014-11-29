package models;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class ResultsDao {

	public void saveResult() throws Exception {
		// To connect to mongodb server
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        // Now connect to your databases
        com.mongodb.DB db = mongoClient.getDB( "test" );
        System.out.println("Connect to databasdbe successfully");
        boolean auth = db.authenticate("","".toCharArray());
        System.out.println("Authentication: "+auth);
        DBCollection coll = db.createCollection("mycol", null);
        System.out.println("Collection created successfully");

        
	}

	
}
