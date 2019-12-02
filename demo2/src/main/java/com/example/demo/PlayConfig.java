package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayConfig {
    public PlayConfig() {
      //  System.out.println(workerConfig.getTasks().toString());

    }

    @Override
    public String toString() {
        return "PlayConfig{" +
                "workerConfig=" + workerConfig +
                '}';
    }

    @Autowired
    private WorkerConfig workerConfig;

    public WorkerConfig getWorkerConfig() {
        return workerConfig;
    }

    public void setWorkerConfig(WorkerConfig workerConfig) {
        this.workerConfig = workerConfig;
    }

}
