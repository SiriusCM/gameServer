package event.impl;

import event.EventListener;

public class LoginEventListener implements EventListener {

    @Override
    public boolean trigger() {
        return false;
    }

    @Override
    public boolean end() {
        return false;
    }
}
