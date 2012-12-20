import java.io.IOException;
import java.net.UnknownHostException;


public class ClientMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Client client = new Client();
		client.startProgram();
		
		try {
			client.connect("localhost", 5000);
			client.chatting();
		} catch (UnknownHostException e) {
			System.err.println("Unknown host exception: " + e.getMessage());
			System.exit(2);
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
			System.exit(1);
		}
	}

}
