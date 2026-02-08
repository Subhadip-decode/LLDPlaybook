package model.command.impl;

import model.button.impl.LightButton;
import model.command.ICommand;

public class LightCommand implements ICommand {
    LightButton lightButton;
    @Override
    public void execute() {
        lightButton.on();
    }

    @Override
    public void undo() {
        lightButton.off();
    }
}
