package sirius;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sirius.channer.tcp.ClientTcpInit;
import sirius.channer.tcp.TcpInit;
import sirius.channer.udp.ClientUdpInHandler;
import sirius.channer.udp.UdpInHandler;
import sirius.factory.ServerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.net.InetSocketAddress;

public class Start implements ServletContextListener, Runnable {

	public static final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		new Thread(this).start();
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {

	}

	@Override
	public void run() {
		bootTcpServer();
	}

	public static void main(String[] args) {
		//bootTcpServer();
		bootUdpServer();
	}

	public static void bootTcpServer() {
		ServerFactory factory = applicationContext.getBean(ServerFactory.class);
		EventLoopGroup bossGroup = new NioEventLoopGroup(1);
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		try {
			Channel channel0 = factory.createTcpServer(new TcpInit(), bossGroup, workerGroup, 8888);
			Channel channel1 = factory.createTcpClient(new ClientTcpInit(), workerGroup, "127.0.0.1", 8888);
			//channel0.closeFuture().sync();
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			workerGroup.shutdownGracefully();
			bossGroup.shutdownGracefully();
		}
	}

	public static void bootUdpServer() {
		ServerFactory factory = applicationContext.getBean(ServerFactory.class);
		EventLoopGroup group = new NioEventLoopGroup();
		try {
			Channel channel0 = factory.createUdpServer(new UdpInHandler(), group, 9999);
			Channel channel1 = factory.createUdpClient(new ClientUdpInHandler(), group);
			//channel0.closeFuture().await();

			channel1.writeAndFlush(new DatagramPacket(Unpooled.copiedBuffer("hello!!!", CharsetUtil.UTF_8),
					new InetSocketAddress("127.0.0.1", 9999))).sync();
			//channel1.closeFuture().await(15000);
			channel0.closeFuture().await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			group.shutdownGracefully();
		}
	}
}
