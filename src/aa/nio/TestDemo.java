package aa.nio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class TestDemo {
	public static void main(String[] args) {
		DemoServer server = new DemoServer();
		server.start();
		try (Socket client = new Socket(InetAddress.getLocalHost(), server.getPort())) {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			bufferedReader.lines().forEach(s -> {
				System.out.println(s);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
