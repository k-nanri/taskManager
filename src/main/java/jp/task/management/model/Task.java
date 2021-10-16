package jp.task.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Task {
    
    @JsonProperty("id")
    private int id = 0;
    
    @JsonProperty("title")
    private String title = null;
    
    @JsonProperty("createdAt")
    private String createdAt = null;
    
    @JsonProperty("updatedAt")
    private String updatedAt = null;

}
