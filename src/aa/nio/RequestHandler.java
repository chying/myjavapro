package aa.nio;

import java.io.PrintWriter;
import java.net.Socket;

public class RequestHandler extends Thread {
	private Socket socket;

	RequestHandler(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (PrintWriter out = new PrintWriter(socket.getOutputStream());) {
			out.println();
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
