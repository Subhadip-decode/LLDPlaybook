package model.button.impl;

import model.button.IButton;

public class LightButton implements IButton {

    @Override
    public void on() {
        System.out.println("Switching ON Light");
    }

    @Override
    public void off() {
        System.out.println("Switching OFF Light");
    }
}
