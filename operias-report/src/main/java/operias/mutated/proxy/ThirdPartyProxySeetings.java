package operias.mutated.proxy;

import java.io.File;

public class ThirdPartyProxySeetings {
	
	public  String REMOTE_URL;
	public  String MAVEN_PATH;
	public  File pomFile;
	public  String headID;
	
	public ThirdPartyProxySeetings(String REMOTE_URL, String MAVEN_PATH){
		this.REMOTE_URL = REMOTE_URL;
		this.MAVEN_PATH = MAVEN_PATH;
		pomFile = null;
		headID=null;
	}
	
}
