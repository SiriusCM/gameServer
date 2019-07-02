package com.sirius.server.state.impl;


import com.sirius.server.sprite.Sprite;
import com.sirius.server.state.IState;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class BattleIState implements IState {

	@Override
	public boolean inState(Sprite sprite) {
		return false;
	}
}
