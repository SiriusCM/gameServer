package sirius;

import io.netty.channel.ChannelHandlerContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sirius.handler.Handler;
import sirius.proto.MsgProto;
import sirius.sprite.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class World {
	
	private static final World instance = new World();
	
	private final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	private final Map<ChannelHandlerContext, Player> playerMap = new HashMap<>();
	
	private final Map<Integer, MsgProto> idMsgMap = new HashMap<>();
	
	private final Map<Class, MsgProto> clazzMsgMap = new HashMap<>();
	
	private final Map<MsgProto, Handler> handlerMap = new HashMap<>();
	
	private World() {
		List<Class> list = ClassUtil.getAllClassByInterface(Handler.class);
		list.forEach(e -> {
			try {
				Handler handler = (Handler) e.newInstance();
				handlerMap.put(handler.getProto(), handler);
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		});
		for (MsgProto m : MsgProto.values()) {
			idMsgMap.put(m.getId(), m);
			clazzMsgMap.put(m.getClazz(), m);
		}
	}
	
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	public Map<ChannelHandlerContext, Player> getPlayerMap() {
		return playerMap;
	}
	
	public MsgProto getMsgProto(int msgId) {
		if (idMsgMap.containsKey(msgId)) {
			return idMsgMap.get(msgId);
		}
		return null;
	}
	
	public MsgProto getMsgProto(Class clazz) {
		if (clazzMsgMap.containsKey(clazz)) {
			return clazzMsgMap.get(clazz);
		}
		return null;
	}
	
	public Handler getHandler(MsgProto msgProto) {
		if (handlerMap.containsKey(msgProto)) {
			return handlerMap.get(msgProto);
		}
		return null;
	}
	
	public static World getInstance() {
		return instance;
	}
}
