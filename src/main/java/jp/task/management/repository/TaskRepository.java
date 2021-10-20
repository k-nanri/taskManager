package jp.task.management.repository;

import jp.task.management.repository.dto.TaskListEntity;

public interface TaskRepository {

    TaskListEntity fetchTask();

}
