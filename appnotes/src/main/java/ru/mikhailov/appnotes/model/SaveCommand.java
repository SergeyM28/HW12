package ru.mikhailov.appnotes.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.mikhailov.appnotes.services.FileGateway;
import ru.mikhailov.appnotes.services.TaskService;

import java.util.List;

//  Команда для сохранения всех заметок в файл
@AllArgsConstructor
@Component
public class SaveCommand implements Command {

    private final TaskService taskService;
    private final FileGateway fileGateway;

    @Override
    public void execute() {
        List<Task> allTasks = taskService.getAllTasks();
        allTasks.stream().forEach(task -> fileGateway.writeToFile("all_tasks.txt", task.toString()));
    }
}
