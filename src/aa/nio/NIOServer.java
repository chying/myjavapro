package aa.nio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

public class NIOServer extends Thread {

//	private ServerSocket server;

	@Override
	public void run() {
		try (Selector selector = Selector.open(); ServerSocketChannel serverSocket = ServerSocketChannel.open();) {
			serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), 8888));
			serverSocket.configureBlocking(false);
			serverSocket.register(selector, SelectionKey.OP_ACCEPT);
			while (true) {
				selector.select();
				Set<SelectionKey> selectedKeys = selector.selectedKeys();
				Iterator<SelectionKey> iter = selectedKeys.iterator();
				while (iter.hasNext()) {
					SelectionKey key = iter.next(); // 生产系统中一般会额外进行就绪状态检查
					sayHelloWorld((ServerSocketChannel) key.channel());
					iter.remove();
				}
			}
		} catch (IOException e) {

		}

	}

	private void sayHelloWorld(ServerSocketChannel server) {
		try (SocketChannel client = server.accept();) {
			client.write(Charset.defaultCharset().encode("Hello world!"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
