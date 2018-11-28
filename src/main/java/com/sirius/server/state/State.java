package com.sirius.server.state;

import com.sirius.server.sprite.Sprite;

public interface State {
	
	boolean inState(Sprite sprite);
}
