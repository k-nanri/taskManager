package jp.task.management.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TaskListResponse {
    
    private List<Task> taskList = null;
    
    public TaskListResponse() {
        this.taskList = new ArrayList<>();
    }
    
    public void addTask(Task task) {
        this.taskList.add(task);
    }

}
