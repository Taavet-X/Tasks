package tools.tasks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTask;
        private Task task;

        public ViewHolder(View view) {
            super(view);
            tvTask = view.findViewById(R.id.tvTask);
        }

        public void setTask(Task task){
            this.task = task;
            tvTask.setText(task.getName());
        }

    }

    private ArrayList<Task> arlTasks;

    public RecyclerViewAdapter(ArrayList<Task> arlTask) {
        this.arlTasks = arlTask;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.task, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Task task = arlTasks.get(position);
        viewHolder.setTask(task);
    }

    @Override
    public int getItemCount() {
        return arlTasks.size();
    }



}
