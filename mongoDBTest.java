package mongotest;

import com.mongodb.BasicDBObject;

public class MongoDBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("process initiated....\n");
	
		MongoDB dbOperations = new MongoDB();
		
		//creating document
		BasicDBObject doc = new BasicDBObject("name", "sanjay")
		.append("pin", 50)
		.append("info", new BasicDBObject("result", "pass").append("marks", 98));
		dbOperations.addDocument("test", doc);
		
		//get list of collections from DB
		dbOperations.listCollections();
		
		//get Document from Collection
		dbOperations.getDocument("test");
		
		//list of all Documents from collections
		dbOperations.getAllDocuments("test");

	}

}
