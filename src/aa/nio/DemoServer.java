package aa.nio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoServer extends Thread {
	private ServerSocket serverSocket;

	public int getPort() {
		return serverSocket.getLocalPort();
	}

//	@Override
//	public void run() {
//		try {
//			//�Զ���һ�����ж˿�
//			serverSocket=new ServerSocket(0);
//			while(true) {
//				Socket socket=serverSocket.accept();
//				RequestHandler requestHandler=new RequestHandler(socket);
//				requestHandler.start();
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(serverSocket!=null) {
//				try {
//					serverSocket.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}

	// ʹ���̳߳ؽ��иĽ�,֧�ְ�λ������
	@Override
	public void run() {
		try {
			// �Զ���һ�����ж˿�
			serverSocket = new ServerSocket(0);
			ExecutorService executor = Executors.newFixedThreadPool(8);
			while (true) {
				Socket socket = serverSocket.accept();
				RequestHandler requestHandler = new RequestHandler(socket);
				executor.execute(requestHandler);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (serverSocket != null) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//NIO IO��·���û���
}
