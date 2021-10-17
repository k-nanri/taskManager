package jp.task.management.service.dto;

import java.util.ArrayList;
import java.util.List;

public class TaskListDto {
    
    private List<TaskDto> taskList = null;
    
    public TaskListDto() {
        
        this.taskList = new ArrayList<>();
    }
    
    public void addTask(TaskDto dto) {
        this.taskList.add(dto);
    }

}
