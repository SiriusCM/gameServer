import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

public class UDPClientFactory {
    private static final Logger logger = LoggerFactory.getLogger(UDPClientFactory.class);
    private static final UDPClientFactory factory = new UDPClientFactory();

    public static UDPClientFactory getInstance() {
        return UDPClientFactory.factory;
    }

    public void createConnect(ChannelInboundHandlerAdapter adapter, String host, int port) {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .channel(NioDatagramChannel.class)
                    .option(ChannelOption.SO_BROADCAST, true)
                    .handler(adapter);

            Channel channel = bootstrap.bind(0).sync().channel();

            channel.writeAndFlush(new DatagramPacket(Unpooled.copiedBuffer("hello!!!", CharsetUtil.UTF_8),
                    new InetSocketAddress(host, port))).sync();

            logger.info("Search, sendPackage()");
            if (!channel.closeFuture().await(15000)) {
                logger.info("Search request timed out.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully();
        }
    }
}