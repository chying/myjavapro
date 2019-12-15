package aa.nio;

import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;

public class AIOServer extends Thread {
	@Override
	public void run() {
//		AsynchronousServerSocketChannel serverSock = AsynchronousServerSocketChannel.open().bind(InetAddress.getLocalHost());
//		serverSock.accept(serverSock, new CompletionHandler() { // 为异步操作指定CompletionHandler回调函数
//			@Override
//			public void completed(AsynchronousSocketChannel sockChannel, AsynchronousServerSocketChannel serverSock) {
//				serverSock.accept(serverSock, this);
//				// 另外一个 write（sock，CompletionHandler{}）
//				sayHelloWorld(sockChannel, Charset.defaultCharset().encode("Hello World!"));
//			}
//			// 省略其他路径处理方法...
//
////			@Override
////			public void completed(Object result, Object attachment) {
////				// TODO Auto-generated method stub
////				
////			}
//
//			@Override
//			public void failed(Throwable exc, Object attachment) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
	}

	protected void sayHelloWorld(AsynchronousSocketChannel sockChannel, ByteBuffer encode) {
		// TODO Auto-generated method stub
		
	}

}
