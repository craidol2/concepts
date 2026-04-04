package com.example.jbpm;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class HelloWorldWorkItemHandler implements WorkItemHandler {


    public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
        String serviceInterface = (String) workItem.getParameter("Interface");
        String serviceOperation = (String) workItem.getParameter("Operation");
        System.out.println("Executing interface: " + serviceInterface + ", with operation: " + serviceOperation);

        System.out.println("HelloWorldWorkItemHandler: executeWorkItem: Hello World!");
    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
        System.out.println("HelloWorldWorkItemHandler: abortWorkItem: Aborted");
    }
}
