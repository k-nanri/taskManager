package jp.task.management.service;


import jp.task.management.model.Task;
import jp.task.management.service.dto.TaskCreatedDto;

public interface TaskService {

    TaskCreatedDto createTask(Task task);

}
