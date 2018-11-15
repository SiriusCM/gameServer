package sirius.channer.udp;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import sirius.Start;
import sirius.World;
import sirius.proto.MsgRequest;
import sirius.proto.ProtoBuf;
import sirius.proto.protobuf.Match;

public class ClientUdpInHandler extends SimpleChannelInboundHandler<DatagramPacket> {
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
		World world = Start.applicationContext.getBean(World.class);
		byte[] data = new byte[msg.content().readableBytes()];
		msg.content().readBytes(data);
		ProtoBuf.Message message = ProtoBuf.Message.parseFrom(data);
		MsgRequest msgRequest = MsgRequest.getMsgRequest(message.getId());
		Match.Position position = Match.Position.parseFrom(message.getData());
		System.out.println("(" + position.getX() + "," + position.getY() + "," + position.getZ() + ")");
		ctx.close();
	}
}
