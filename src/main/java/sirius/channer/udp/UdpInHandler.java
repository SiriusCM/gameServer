package sirius.channer.udp;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import sirius.World;
import sirius.proto.MsgProto;
import sirius.proto.ProtoBuf;
import sirius.proto.protobuf.Match;

public class UdpInHandler extends SimpleChannelInboundHandler<DatagramPacket> {
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
		World world = World.getInstance();
		byte[] data = new byte[msg.content().readableBytes()];
		msg.content().readBytes(data);
		ProtoBuf.Message message = ProtoBuf.Message.parseFrom(data);
		MsgProto msgProto = world.getMsgProto(message.getId());
		Match.Position position = Match.Position.parseFrom(message.getData());
		System.out.println("(" + position.getX() + "," + position.getY() + "," + position.getZ() + ")");
		//world.getHandler(msgProto).handler(world.getPlayerMap().get(ctx), msgProto.getParser().parseFrom(message.getData()));
		ctx.writeAndFlush(new DatagramPacket(Unpooled.copiedBuffer(message.toByteArray()), msg.sender()));
	}
}