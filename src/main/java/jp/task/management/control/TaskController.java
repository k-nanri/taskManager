package jp.task.management.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jp.task.management.common.ResponseCreater;
import jp.task.management.model.Task;
import jp.task.management.model.TaskCreatedResponse;
import jp.task.management.service.TaskService;
import jp.task.management.service.dto.TaskCreatedDto;

@RestController("/task")
public class TaskController {
    
    private TaskService taskService = null;
    
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    
    @PostMapping
    public ResponseEntity<TaskCreatedResponse> createTask(@RequestBody Task task) {
        
        TaskCreatedDto dto = this.taskService.createTask(task);
        
        TaskCreatedResponse taskCreatedResponse = ResponseCreater.createdTaskResponse(dto);
        return ResponseEntity.ok(taskCreatedResponse);
    }
    

}
