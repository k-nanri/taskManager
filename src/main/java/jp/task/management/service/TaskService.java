package jp.task.management.service;


import jp.task.management.model.Task;
import jp.task.management.service.dto.TaskCreatedDto;
import jp.task.management.service.dto.TaskListDto;

public interface TaskService {

    TaskCreatedDto createTask(Task task);

    TaskListDto fetchTask();

}
