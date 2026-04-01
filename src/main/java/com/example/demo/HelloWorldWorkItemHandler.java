package com.example.demo;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class HelloWorldWorkItemHandler implements WorkItemHandler {


    public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
        System.out.println("HelloWorldWorkItemHandler: executeWorkItem: Hello World!");
    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
        System.out.println("HelloWorldWorkItemHandler: abortWorkItem: Aborted");
    }
}
