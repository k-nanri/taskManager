package jp.task.management.repository;

import jp.task.management.service.dto.TaskListDto;

public interface TaskRepository {

    TaskListDto fetchTask();

}
