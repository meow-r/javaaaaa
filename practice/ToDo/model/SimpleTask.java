package practice.ToDo.model;

public class SimpleTask extends Task{
    //
    public SimpleTask(String title){
        super(title);
    }

    private int priority = 3;

    @Override
    public int getPriority(){
        return priority;
    }

    @Override
    public String toString(){
        return getTitle() + " " + (isCompleted()?"[已完成]":"[未完成]");
    }
}
