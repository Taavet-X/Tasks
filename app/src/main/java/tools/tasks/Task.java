package tools.tasks;

import java.util.Date;

public class Task {

    String strName;
    boolean isDone;

    public Task(){
        isDone = false;
    }

    public Task(String strName){
        this.strName = strName;
        isDone = false;
    }

    public String getName() {
        return strName;
    }

    public void setName(String strName) {
        this.strName = strName;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
