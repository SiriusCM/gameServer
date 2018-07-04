package sirius;

import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirius.channer.ChannelInit;
import sirius.channer.ClientChannelInit;

public class Start {
	
	private static final Logger logger = LoggerFactory.getLogger(Start.class);
	private static final TCPFactory factory = TCPFactory.getInstance();
	
	public static void main(String[] args) {
		EventLoopGroup bossGroup = new NioEventLoopGroup(1);
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		try {
			ChannelFuture f1 = factory.createAccept(new ChannelInit(), bossGroup, workerGroup, 8080);
			ChannelFuture f2 = factory.createConnect(new ClientChannelInit(), workerGroup, "127.0.0.1", 8080);
//			f1.channel().closeFuture().sync();
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			workerGroup.shutdownGracefully();
			bossGroup.shutdownGracefully();
		}
	}
}
