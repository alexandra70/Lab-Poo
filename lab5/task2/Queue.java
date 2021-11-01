package task2;

import task1.Task;

import java.util.ArrayList;

public class Queue implements Container{

    private ArrayList<Task> list = new ArrayList<>();

    public Queue() {
    }

    public ArrayList<Task> getTasks() {
        return list;
    }

    @Override
    public Task pop() {
        Task task = this.list.get(0);
        this.list.remove(task);
        return task;
    }

    @Override
    public void push(Task task) {
        this.list.add(task);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        if(list.size() == 0)
            return true;
        return false;
    }

    @Override
    public void transferFrom(Container container) {
        for (int i = 0; i < container.size(); i++) {
            Task task = container.pop();
            this.push(task);
        }
    }
}
