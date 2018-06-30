package sirius.proto.map;

import sirius.handler.Handler;
import sirius.handler.LoginHandle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 高连棣
 * @date 2018/6/30 18:47
 */
public enum ReceiveEnum {
	Login(1, LoginHandle.getInstance()),
	Match(2, LoginHandle.getInstance()),
	Play(4, LoginHandle.getInstance());

	private Map<Integer, Handler> map = new HashMap<>();

	ReceiveEnum(int id, Handler handler) {
		map.put(id, handler);
	}

	public Handler getHandler(int id) {
		if (map.containsKey(id)) {
			return map.get(id);
		}
		return null;
	}
}
