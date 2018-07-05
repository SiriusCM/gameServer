package sirius;

import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import sirius.channer.ChannelInit;
import sirius.channer.ClientChannelInit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Start implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		boot();
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
	
	}
	
	public static void boot() {
		TCPFactory factory = TCPFactory.getInstance();
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
