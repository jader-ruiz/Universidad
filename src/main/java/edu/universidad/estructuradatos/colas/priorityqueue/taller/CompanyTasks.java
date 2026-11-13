package edu.universidad.estructuradatos.colas.priorityqueue.taller;
import java.util.*;

public class CompanyTasks{
    PriorityQueue<Task> queue;

    public CompanyTasks(){
        queue = new PriorityQueue<>(Comparator.comparingInt(Task::getPriority));
    }

    public String addTask(Task task){
        queue.offer(task);
        return "\nwas added a new task...";
    }

    public String showTask(){
        if(queue.isEmpty()){
            return "The queue is empty...";
        }

        StringBuilder sb = new StringBuilder();
        for(Task t : queue){
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }

    public String withPriority(){
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for(Task t : queue){
            if(t.getPriority() == 1){
                counter++;
                sb.append(t.toString()).append("\n");
            }
        }
        if(counter == 0) sb.append("There's no priority tasks");
        return sb.toString();
    }
    
    public String withPriorityThree(){
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for(Task t : queue){
            if(t.getPriority() == 3){
                counter++;
                sb.append(t.toString()).append("\n");
            }
        }
        if(counter == 0) sb.append("There's no priority 3 tasks");
        return sb.toString();
    }

    public String drop(){
        StringBuilder sb = new StringBuilder();
        if(queue.isEmpty()){
            sb.append("The queue is empty...");
            return sb.toString();
        }

        while(!(queue.isEmpty())){
            sb.append("Retired: ")
                .append(queue.poll().toString())
                .append("\n");
        }

        return sb.toString();
    }

    public String pollTask(){
        if(queue.isEmpty()){
            return "The queue is empty...";
        }

        queue.poll();
        return showTask();
    }

    public String pendingTask(){
        if(queue.isEmpty()) return "There's no pending tasks...";
        else return "Still there's pending tasks:\n" + showTask();
    }

}