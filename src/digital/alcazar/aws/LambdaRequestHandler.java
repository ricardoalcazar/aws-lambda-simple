package digital.alcazar.aws;



import org.slf4j.*;
import java.util.*;
import com.amazonaws.services.lambda.runtime.*;
import com.google.gson.*;




public class LambdaRequestHandler implements RequestHandler<Map<String,String>, String>{
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Tester.class);
	
	public String handleRequest(Map<String,String> event, Context context){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    LambdaLogger logger = context.getLogger();
	    String response = new String("200 OK");
	    
	    
	    // log execution details
	    logger.log("ENVIRONMENT VARIABLES: " + gson.toJson(System.getenv()));
	    logger.log("CONTEXT: " + gson.toJson(context));
	    // process event
	    logger.log("EVENT: " + gson.toJson(event));
	    logger.log("EVENT TYPE: " + event.getClass().toString());
	    return response;
	  }
	

}
