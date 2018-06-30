package sirius.event.impl;

import sirius.event.EventListener;

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
