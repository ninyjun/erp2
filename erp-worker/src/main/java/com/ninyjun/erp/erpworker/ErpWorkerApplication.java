package com.ninyjun.erp.erpworker;

import com.netflix.conductor.client.task.WorkflowTaskCoordinator;
import com.ninyjun.erp.erpworker.worker.WorkerMarshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import com.netflix.conductor.client.worker.Worker;

import java.util.List;

@SpringBootApplication

public class ErpWorkerApplication implements CommandLineRunner {
    @Autowired
    WorkerMarshaller workMarshaller;

    public static void main(String[] args) {
        //SpringApplication.run(ErpWorkerApplication.class, args);

        //不启动WEB
        new SpringApplicationBuilder(ErpWorkerApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

    }

    @Override
    public void run(String... args) throws Exception {

        List<Worker> wrks = workMarshaller.buildWorker();
        WorkflowTaskCoordinator.Builder builder = new WorkflowTaskCoordinator.Builder();
        WorkflowTaskCoordinator coordinator = builder.withWorkers(wrks)
                    .withThreadCount(workMarshaller.getWorkers().size()).withTaskClient(workMarshaller.getTaskClient()).build();

        //Start for polling and execution of the tasks
        coordinator.init();


    }
}
