package edu.universidad.estructuradatos.colas.priorityqueue.taller;

public class Task{
    private int code;
    private String description;
    private int priority;

    public Task(int code, String description, int priority){
        this.code = code;
        this.description = description;
        this.priority = priority;
    }

    public int getCode() {
        return code;
    }
    public String getDescription(){
        return description;
    }
    public int getPriority(){
        return priority;
    }

    @Override
    public String toString(){
        return "Code: " + code + ", Description: " + description + ", Priority: " + priority;
    }
}