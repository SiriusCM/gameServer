package com.sirius.server.channer.tcp;

import com.sirius.server.proto.ProtoBuf;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientTcpInit extends ChannelInitializer<SocketChannel> {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientTcpInit.class);
	
	@Autowired
	private ClientTcpInHandler clientTcpInHandler;
	
	@Override
	public void initChannel(SocketChannel ch) {
		ChannelPipeline pipeline = ch.pipeline();
		//出口
		//pipeline.addLast("frameEncoder", new ProtobufVarint32LengthFieldPrepender());
		pipeline.addLast("encoder", new ProtobufEncoder());
		pipeline.addLast("wrap", new TcpOutHandler());
		//入口
		//pipeline.addLast("frameDecoder", new ProtobufVarint32FrameDecoder());
		pipeline.addLast("decoder", new ProtobufDecoder(ProtoBuf.Message.getDefaultInstance()));
		pipeline.addLast("handler", clientTcpInHandler);
	}
}
