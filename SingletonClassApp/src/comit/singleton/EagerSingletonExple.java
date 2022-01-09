package comit.singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EagerSingletonExple {
	
	static Logger logger=Logger.getLogger("EagerSingletonExple");
	
	static EagerSingletonExple eagerSingletonExple=new EagerSingletonExple();
	
	private EagerSingletonExple() {
		logger.info("Private Constructor");
	}
	
	public static EagerSingletonExple getSingleObject() {
		if(null ==eagerSingletonExple) {
			return eagerSingletonExple;
		}else {
			eagerSingletonExple=new EagerSingletonExple();
		}
		return eagerSingletonExple;
	}
	
	public static void main(String[] args) {
		logger.log(Level.SEVERE,"Something went wrong: {0} ", "HashCode-->"+eagerSingletonExple.hashCode());
		logger.log(Level.SEVERE,"Something went wrong: {0} ","HashCode-->"+eagerSingletonExple.hashCode());
	}

}
