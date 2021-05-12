package jutils.facebook;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.types.GraphResponse;

import jutils.log.Log;
import jutils.log.LogLevel;
import jutils.strings.Strings;

public class Facebook {

	private static final Class<? extends LogLevel> logLevelClass = FacebookLogLevel.class;
	private static Facebook instance;
	
	protected FacebookClient fbClient;
	protected String token;
	protected String pageId;
	
	
	private Facebook(String token, String pageId) {
		this.token = token;
		this.pageId = pageId;

		Log.println(logLevelClass, "Initializing Facebook client");
		Log.println(logLevelClass, "Token: " + token.substring(0, 3) + Strings.patternRepeating("*", token.length()-6) + token.substring(token.length()-3));
		Log.println(logLevelClass, "PageId: " + pageId);
		fbClient = new DefaultFacebookClient(token, Version.LATEST);
	}
	
	
	public static Facebook getInstance() {
		if(instance == null) {
			Log.println(logLevelClass, "Initializing Facebook client with empty arguments");
			instance = new Facebook("", "");
		}
		return instance;
	}
	
	public static Facebook build(String token, String pageId) {
		instance = new Facebook(token, pageId);
		return getInstance();
	}
	
	
	public GraphResponse publishPost(String text) {
		Log.println(logLevelClass, "Publishing feed post with message: '" + text + "'");
		return fbClient.publish(
				pageId + "/feed",
				GraphResponse.class,
				Parameter.with("message", text));
	}
}
