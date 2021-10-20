package jp.task.management.repository;

import org.springframework.stereotype.Repository;

import jp.task.management.mapper.TaskMapper;
import jp.task.management.repository.dto.TaskListEntity;
import jp.task.management.service.dto.TaskListDto;

@Repository
public class TaskRepositoryImpl implements TaskRepository {
    
    private TaskMapper mapper;
    
    public TaskRepositoryImpl(TaskMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public TaskListEntity fetchTask() {
        return this.mapper.fetchTask();
    }

}
