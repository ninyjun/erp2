package com.ninyjun.erp.erpworker.worker;

import com.netflix.conductor.client.worker.Worker;
import com.netflix.conductor.common.metadata.tasks.Task;
import com.netflix.conductor.common.metadata.tasks.TaskResult;

public class ChameleonWorker implements Worker {

    private String taskDefName;

    public ChameleonWorker(String taskDefName) {
        this.taskDefName = taskDefName;
    }

    public void setTaskDefName(String taskDefName) {
        this.taskDefName = taskDefName;
    }

    @Override
    public String getTaskDefName() {
        return taskDefName;
    }

    @Override
    public TaskResult execute(Task task) {

        System.out.println("===>" + task.getTaskDefName());
        TaskResult result = new TaskResult(task);

        result.setStatus(TaskResult.Status.COMPLETED);

        //Register the output of the task
        result.getOutputData().put("outputKey1", "value");
        result.getOutputData().put("oddEven", 1);
        result.getOutputData().put("mod", 4);

        System.out.println("===>" + task.getTaskDefName() + "==> ok!");

        return result;
    }

    @Override
    public boolean preAck(Task task) {
        return false;
    }

    @Override
    public void onErrorUpdate(Task task) {

    }

}
