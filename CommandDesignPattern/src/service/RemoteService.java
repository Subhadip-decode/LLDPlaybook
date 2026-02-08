package service;

import model.button.IButton;
import model.command.ICommand;

import java.util.HashMap;

public class RemoteService {
    HashMap<String, ICommand> buttons = new HashMap<>();

    RemoteService(HashMap<String, ICommand> button){
        this.buttons = button;
    }

    public void switchON(String button){
        buttons.get(button).execute();
    }

    public void switchOFF(String button){
        buttons.get(button).undo();
    }
}
