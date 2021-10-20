package jp.task.management.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.task.management.model.Task;
import jp.task.management.repository.TaskRepository;
import jp.task.management.repository.dto.TaskListEntity;
import jp.task.management.service.dto.TaskCreatedDto;
import jp.task.management.service.dto.TaskListDto;

@Service
public class TaskServiceImpl implements TaskService {
    
    private TaskRepository repository = null;
    
    @Autowired
    public TaskServiceImpl(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public TaskCreatedDto createTask(Task task) {
        return null;
        
        
    }

    @Override
    public TaskListDto fetchTask() {
        
        TaskListEntity entity = this.repository.fetchTask();
        TaskListDto dto = new TaskListDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
