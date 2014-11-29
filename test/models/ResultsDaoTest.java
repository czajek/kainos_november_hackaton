package models;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.mongodb.MongoClient;

public class ResultsDaoTest {

	@Test
	public void testSaveResult() throws Exception {
		ResultsDao resultsDao = new ResultsDao();

		String json = FileUtils.readFileToString(new File(
				"test/models/results.json"));

		JSONObject jsonObject = new JSONObject(json);
		resultsDao.saveResult(jsonObject);
	}
	
	@Test
	public void testGetResult() throws Exception {
		ResultsDao resultsDao = new ResultsDao();

		String json = FileUtils.readFileToString(new File(
				"test/models/results.json"));

		JSONObject jsonObject = new JSONObject(json);
		resultsDao.saveResult(jsonObject);
		
		JSONObject res = resultsDao.getResults("qweqwe");
		Assert.assertNull(res);
		
		
		res = resultsDao.getResults("01938914983214981");
		Assert.assertNotNull(res);
	}	
	

	@After
	public void tearDown() throws Exception {
		MongoClient client = new MongoClient("localhost", 27017);

		com.mongodb.DB db = client.getDB("test");
		boolean auth = db.authenticate("", "".toCharArray());
		System.out.println("Authentication: " + auth);

		db.getCollection("results").drop();

		client.close();
	}
}
