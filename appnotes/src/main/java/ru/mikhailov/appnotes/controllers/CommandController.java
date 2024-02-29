package ru.mikhailov.appnotes.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mikhailov.appnotes.services.CommandExecutor;
import ru.mikhailov.appnotes.model.PrintCommand;
import ru.mikhailov.appnotes.model.SaveCommand;

//Контролер для использования команд
@RestController
@RequestMapping("/tasks/commands")
@AllArgsConstructor
public class CommandController {
    private final CommandExecutor commandExecutor;
    private final SaveCommand saveCommand;
    private final PrintCommand printCommand;

    @GetMapping("/save")
    public void executeSaveCommand(){
        commandExecutor.setCommand(saveCommand);
        commandExecutor.executeCommand();
    }

    @GetMapping("/print")
    public void executePrintCommand(){
        commandExecutor.setCommand(printCommand);
        commandExecutor.executeCommand();
    }


}
