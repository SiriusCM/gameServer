package sirius.factory;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.CharsetUtil;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

@Component
public class ServerFactory {

	public Channel createTcpServer(ChannelInboundHandlerAdapter adapter, EventLoopGroup bossGroup, EventLoopGroup workerGroup, int port) throws InterruptedException {
		ServerBootstrap bootstrap = new ServerBootstrap();
		bootstrap.group(bossGroup, workerGroup)
				.channel(NioServerSocketChannel.class)
				.childHandler(adapter)
				.option(ChannelOption.SO_BACKLOG, 128)
				.childOption(ChannelOption.SO_KEEPALIVE, true);
		Channel channel = bootstrap.bind(port).sync().channel();
		return channel;
	}

	public Channel createTcpClient(ChannelInboundHandlerAdapter adapter, EventLoopGroup group, String host, int port) throws InterruptedException {
		Bootstrap bootstrap = new Bootstrap();
		bootstrap.group(group)
				.channel(NioSocketChannel.class)
				.handler(adapter);
		Channel channel = bootstrap.connect(host, port).sync().channel();
		return channel;
	}

	public Channel createUdpServer(ChannelInboundHandlerAdapter adapter, EventLoopGroup group, int port) throws InterruptedException {
		Bootstrap bootstrap = new Bootstrap();
		bootstrap.group(group)
				.channel(NioDatagramChannel.class)
				.option(ChannelOption.SO_BROADCAST, true)
				.handler(adapter);
		Channel channel = bootstrap.bind(port).sync().channel();
		return channel;
	}

	public Channel createUdpClient(ChannelInboundHandlerAdapter adapter, EventLoopGroup group) throws InterruptedException {
		Bootstrap bootstrap = new Bootstrap();
		bootstrap.group(group)
				.channel(NioDatagramChannel.class)
				.option(ChannelOption.SO_BROADCAST, true)
				.handler(adapter);
		Channel channel = bootstrap.bind(0).sync().channel();
		return channel;
	}
}
