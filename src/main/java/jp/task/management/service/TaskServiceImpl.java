package jp.task.management.service;

import org.springframework.stereotype.Service;

import jp.task.management.model.Task;
import jp.task.management.service.dto.TaskCreatedDto;

@Service
public class TaskServiceImpl implements TaskService {

    @Override
    public TaskCreatedDto createTask(Task task) {
        return null;
    }

}
