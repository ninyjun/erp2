package com.ninyjun.erp.erpworker.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.sql.DataSourceDefinition;
import java.util.ArrayList;
import java.util.List;


@Configuration
@ConfigurationProperties(prefix="worker")
public class WorkerConfig {
    private List<String> tasks ;

    @Override
    public String toString() {
        return "WorkerConfig{" +
                "tasks=" + tasks +
                ", taskurl='" + taskurl + '\'' +
                '}';
    }

    public WorkerConfig() {
        tasks = new ArrayList<String>();
        taskurl = new String();
    }

    public String getTaskurl() {
        return taskurl;
    }

    public void setTaskurl(String taskurl) {
        this.taskurl = taskurl;
    }

    private String taskurl ;

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }
}