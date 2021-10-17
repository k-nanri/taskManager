package jp.task.management.service.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TaskDto {
    
    private int taskId = 0;
    
    private String title = null;
    
    private LocalDateTime createdAt = null;
    
    private LocalDateTime updatedAt = null;
    

}
