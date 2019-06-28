package com.sirius.server;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.springframework.stereotype.Component;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
@Component
public class ServerFactory {

    public Channel createTcpServer(ChannelInboundHandlerAdapter adapter, EventLoopGroup bossGroup, EventLoopGroup workerGroup, int port, int so_backlog) throws InterruptedException {
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(adapter)
                .option(ChannelOption.SO_BACKLOG, so_backlog)
                .childOption(ChannelOption.SO_KEEPALIVE, true);
        Channel channel = bootstrap.bind(port).sync().channel();
        return channel;
    }

    public Channel createUdpServer(ChannelInboundHandlerAdapter adapter, EventLoopGroup group, int port, boolean so_broadcast) throws InterruptedException {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioDatagramChannel.class)
                .option(ChannelOption.SO_BROADCAST, so_broadcast)
                .handler(adapter);
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

    public Channel createUdpClient(ChannelInboundHandlerAdapter adapter, EventLoopGroup group, boolean so_broadcast) throws InterruptedException {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioDatagramChannel.class)
                .option(ChannelOption.SO_BROADCAST, so_broadcast)
                .handler(adapter);
        Channel channel = bootstrap.bind(0).sync().channel();
        return channel;
    }
}
