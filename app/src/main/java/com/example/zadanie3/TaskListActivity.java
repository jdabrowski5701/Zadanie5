package com.example.zadanie3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

public class TaskListActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new TaskListFragment();
    }
}

