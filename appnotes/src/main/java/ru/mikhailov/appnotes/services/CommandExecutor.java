package ru.mikhailov.appnotes.services;

import org.springframework.stereotype.Service;
import ru.mikhailov.appnotes.model.Command;

//
@Service
public class CommandExecutor {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
