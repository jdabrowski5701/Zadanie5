package com.example.zadanie3;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    private static final TaskStorage taskStorge = new TaskStorage();
    private final List<MainActivity.Task> tasks;

    public static TaskStorage getInstance(){return taskStorge;}
    private TaskStorage(){
        tasks = new ArrayList<>();
        for(int i = 1; i <=150; i++){
            MainActivity.Task task = new MainActivity.Task();
            task.setName("Pilne zadanie numer" + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }
}
