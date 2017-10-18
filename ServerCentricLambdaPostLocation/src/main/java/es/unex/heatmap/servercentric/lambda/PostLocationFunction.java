package es.unex.heatmap.servercentric.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import es.unex.heatmap.servercentric.messages.PostLocationMessage;

public class PostLocationFunction  implements RequestHandler<PostLocationMessage, String>{

	public String handleRequest(PostLocationMessage location, Context context) {
		context.getLogger().log("Location received: "+location.getLatitude()+" - "+location.getLongitude());
		return "OK";
	}

}
