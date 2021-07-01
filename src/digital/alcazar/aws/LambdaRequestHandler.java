package digital.alcazar.aws;

import java.util.*;
import com.amazonaws.services.lambda.runtime.*;
import com.google.gson.*;


public class LambdaRequestHandler implements RequestHandler<Map<String,String>, String>{
	
	public String handleRequest(Map<String,String> event, Context context){
		
		
		// Google JSON parser
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		// Access CloudWatch logger object
	    LambdaLogger logger = context.getLogger();
	    String response = new String("200 OK");
	    
	    
	    // Log execution details to CloudWatch logs
	    logger.log("ENVIRONMENT VARIABLES: " + gson.toJson(System.getenv()));
	    
	    
	    logger.log("TestEnvironmentVar: " + System.getenv("TestEnvironmentVar") + "\n\n");
	    logger.log("Modify the environment value: \n\n");
	    System.setProperty("TestEnvironmentVar","hochimunsit");
	    
	    logger.log("CONTEXT: " + gson.toJson(context));
	    
	    // Log process event details
	    logger.log("EVENT: " + gson.toJson(event));
	    logger.log("EVENT TYPE: " + event.getClass().toString());
	    return response;
	    
	    
	}
	

}
