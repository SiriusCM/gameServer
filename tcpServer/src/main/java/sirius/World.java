package sirius;

import sirius.handler.Handler;
import sirius.proto.MessageEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class World {

	public static final Map<MessageEnum, Handler> map = new HashMap<>();

	public static final void init() throws Exception {
		List<Class> list = ClassUtil.getAllClassByInterface(Handler.class);
		list.forEach(e -> {
			try {
				Handler handler = (Handler) e.newInstance();
				map.put(handler.getProto(), handler);
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		});
	}

	public static void main(String[] args) throws Exception {
		init();
	}
}
