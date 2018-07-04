package sirius;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TCPFactory {
    private static final Logger logger = LoggerFactory.getLogger(TCPFactory.class);
    private static final TCPFactory factory = new TCPFactory();

    private TCPFactory() {
    }

    public static TCPFactory getInstance() {
        return TCPFactory.factory;
    }

    public ChannelFuture createAccept(ChannelInboundHandlerAdapter adapter, EventLoopGroup bossGroup, EventLoopGroup workerGroup, int port) throws InterruptedException {
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(adapter)
                .option(ChannelOption.SO_BACKLOG, 128)
                .childOption(ChannelOption.SO_KEEPALIVE, true);
        ChannelFuture channelFuture = bootstrap.bind(port).sync();
        return channelFuture;
    }

    public ChannelFuture createConnect(ChannelInboundHandlerAdapter adapter, EventLoopGroup group, String host, int port) throws InterruptedException {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(adapter);
        ChannelFuture channelFuture = bootstrap.connect(host, port).sync();
        return channelFuture;
    }
}
