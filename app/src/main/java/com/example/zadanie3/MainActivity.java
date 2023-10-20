package com.example.zadanie3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import java.util.Date;
import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

    public static class Task {
        private UUID id;
        private String name;
        private Date date;
        private boolean done;

        public Task(){
            id = UUID.randomUUID();
            date = new Date();
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public Date getDate(){
            return date;
        }

        public boolean isDone(){
            return done;
        }

        public void setDone(boolean done){
            this.done = done;
        }

    }

    @Override
    protected Fragment createFragment(){
        return new TaskFragment();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = new TaskFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container,fragment)
                    .commit();
        }
    }
}