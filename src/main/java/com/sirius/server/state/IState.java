package com.sirius.server.state;

import com.sirius.server.sprite.Sprite;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public interface IState {
	
	boolean inState(Sprite sprite);
}
