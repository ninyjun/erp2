package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Configuration
//@PropertySource(value = "classpath:application-my.yml",encoding = "utf-8")


//@PropertySource(value= {"classpath:application-my.yml"},encoding="UTF-8",name="application-my.yml")

@ConfigurationProperties(prefix = "worker")
@PropertySource("classpath:application-my.yml")
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