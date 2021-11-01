package task2;

import task1.Task;
import java.util.ArrayList;

public class Stack implements Container{

    private ArrayList<Task> list = new ArrayList<>();

    public Stack() {
    }

    public ArrayList<Task> getTasks() {
        return list;
    }

    public void setList(ArrayList<Task> list) {
        this.list = list;
    }

    @Override
    public Task pop() {
        Task task = list.get(this.list.size() - 1);
        this.list.remove(task); //remove it from list
        return task;
    }

    @Override
    public void push(Task task) {
        this.list.add(task);
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        if(this.size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void transferFrom(Container container) {
        for (int i = 0; i < container.size(); i++) {
            Task task = container.pop();
            this.list.add(task);
        }
    }
}
