import java.util.logging.*;

public class HelloWorld {

	private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());
	
	public static void main(String[] args) {
		//print hello world!
		LOGGER.info("Hello World!");
		//print how are you?
		LOGGER.info("How are you?");
		//print i am good!
		LOGGER.info("I am good!");
	}

}
