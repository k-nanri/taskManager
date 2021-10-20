package jp.task.management.mapper;

import org.apache.ibatis.annotations.Mapper;

import jp.task.management.repository.dto.TaskListEntity;

@Mapper
public interface TaskMapper {
    
    public TaskListEntity fetchTask();

}
