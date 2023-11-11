package com.example.zadanie3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorge = new TaskStorage();
    private final List<Task> tasks;

    public static TaskStorage getInstance(){return taskStorge;}
    private TaskStorage(){
        tasks = new ArrayList<>();
        for(int i = 1; i <=100; i++){
            Task task = new Task();
            task.setName("Zadanie #" + i);
            task.setDone(i % 3 == 0);

            if(i % 3 == 0){
                task.setCategory(Category.STUDIA);
            } else {
                task.setCategory(Category.DOM);
            }

            tasks.add(task);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTask(UUID id) {
        for (Task task : tasks) {
            if (task.getId().equals(id))
                return task;
        }
        return null;
    }
}
