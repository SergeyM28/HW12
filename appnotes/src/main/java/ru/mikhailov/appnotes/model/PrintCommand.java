package ru.mikhailov.appnotes.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.mikhailov.appnotes.services.FileGateway;
import ru.mikhailov.appnotes.services.TaskService;

import java.util.List;

//  Команда для вывода всех заметок в консоль
@AllArgsConstructor
@Component
public class PrintCommand implements Command {

    private final TaskService taskService;
    private final FileGateway fileGateway;

    @Override
    public void execute() {
        List<Task> allTasks = taskService.getAllTasks();
        allTasks.stream().forEach(task -> System.out.println(task.toString()));
    }
}
