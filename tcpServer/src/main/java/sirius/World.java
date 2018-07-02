package sirius;

import org.springframework.stereotype.Component;
import sirius.handler.Handler;
import sirius.proto.Message;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public final class World {

	private final Map<Integer, Message> msgMap = new HashMap<>();

	private final Map<Message, Handler> handlerMap = new HashMap<>();

	private World() {
		try {
			init();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public final void init() throws IOException, ClassNotFoundException {
		for (Message m : Message.values()) {
			msgMap.put(m.getId(), m);
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

	public Message getMessage(int msgId) {
		if (msgMap.containsKey(msgId)) {
			return msgMap.get(msgId);
		}
		return null;
	}

	public Handler getHandler(int msgId) {
		if (msgMap.containsKey(msgId)) {
			Message m = msgMap.get(msgId);
			if (handlerMap.containsKey(m)) {
				return handlerMap.get(m);
			}
		}
		return null;
	}
}
