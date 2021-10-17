package jp.task.management.mapper;

import org.apache.ibatis.annotations.Mapper;

import jp.task.management.service.dto.TaskListDto;

@Mapper
public interface TaskMapper {
    
    public TaskListDto fetchTask();

}
