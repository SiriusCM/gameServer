package sirius;

import com.google.protobuf.Parser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sirius.handler.Handler;
import sirius.proto.MsgProto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class World {
	
	private static final World instance = new World();
	
	private final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	private final Map<Integer, MsgProto> msgProtoMap = new HashMap<>();
	
	private final Map<Parser, Integer> msgIdMap = new HashMap<>();
	
	private final Map<MsgProto, Handler> handlerMap = new HashMap<>();
	
	public World() {
		for (MsgProto m : MsgProto.values()) {
			msgProtoMap.put(m.getId(), m);
			msgIdMap.put(m.getParser(), m.getId());
		}
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
	}
	
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	public MsgProto getMsgProto(int msgId) {
		if (msgProtoMap.containsKey(msgId)) {
			return msgProtoMap.get(msgId);
		}
		return null;
	}
	
	public Integer getMsgId(Parser parser) {
		if (msgIdMap.containsKey(parser)) {
			return msgIdMap.get(parser);
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
