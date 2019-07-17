package com.sirius.server.state.impl;

import com.sirius.server.sprite.Sprite;
import com.sirius.server.state.IState;

/**
 * @Date:2019/7/17 16:29
 * @Author:gaoliandi
 */
public enum PlayerState implements IState {
    Offline(0),
    Online(1),
    Battle(2),
    ;

    private int id;

    PlayerState(int id) {
        this.id = id;
    }

    @Override
    public boolean inState(Sprite sprite) {
        return false;
    }
}