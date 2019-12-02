package com.ninyjun.erp.erpworker.worker;

import com.netflix.conductor.client.http.TaskClient;
import com.ninyjun.erp.erpworker.config.WorkerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import com.netflix.conductor.client.worker.Worker;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class WorkerMarshaller {

    @Autowired
    public  WorkerConfig workerConfig;

    public WorkerMarshaller() {

    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    private List<Worker> workers;

    public TaskClient getTaskClient() {
        return taskClient;
    }

    private TaskClient taskClient;

    public List<Worker>  buildWorker(){
        //不能放入构造函数,否则自动装配不成功
        workers = new ArrayList<Worker>();
        taskClient = new TaskClient();
        taskClient.setRootURI(workerConfig.getTaskurl());
        for (String tsk : workerConfig.getTasks()){
            Worker wrk = new ChameleonWorker(tsk);
            workers.add(wrk);
        }
        return workers;
    }


}
