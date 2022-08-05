package tools.tasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Task> arlTasks;

    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arlTasks = new ArrayList<>();
        recyclerViewAdapter = new RecyclerViewAdapter(arlTasks);
        RecyclerView rvTasks = findViewById(R.id.rvTasks);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvTasks.setLayoutManager(layoutManager);
        rvTasks.setAdapter(recyclerViewAdapter);
        addTask();
    }

    public void addTask(){
        for (int i = 0; i < 30; i++) {
            Task task = new Task("Test" + i);
            arlTasks.add(task);
        }
        recyclerViewAdapter.notifyDataSetChanged();
    }
}