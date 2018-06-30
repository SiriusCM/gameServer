package sirius.channer;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirius.proto.protobuf.Message;

public class ChannelInit extends ChannelInitializer<SocketChannel> {

	private static final Logger logger = LoggerFactory.getLogger(ChannelInit.class);

	@Override
	public void initChannel(SocketChannel ch) {
		ChannelPipeline pipeline = ch.pipeline();
		//pipeline.addLast(new ProtobufVarint32FrameDecoder());
		//pipeline.addLast("frameEncoder", new ProtobufVarint32LengthFieldPrepender());
		pipeline.addLast("encoder", new ProtobufEncoder());
		pipeline.addLast("decoder", new ProtobufDecoder(Message.Position.getDefaultInstance()));
		pipeline.addLast("sirius/handler", new ChannelHandler());
		logger.info("Client:" + ch.remoteAddress() + "连接上");
	}
}
