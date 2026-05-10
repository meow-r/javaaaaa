package practice.ToDo.model;

public abstract class Task implements Comparable<Task>{
    private String title;
    private boolean completed;
    //private int priority;

    public Task(String title){
        setTitle(title);
        this.completed = false;
    }

    //setter
    public void completeTask(){
        this.completed = true;
    }
    //getter
    public boolean isCompleted(){
        //System.out.printf("%s: %s",this.title, this.completed? "已完成":"未完成");
        return this.completed;
    }
    //getter
    public String getTitle(){
        return this.title;
    }
    //setter
    public void setTitle(String newTitle){
        if(newTitle == null || newTitle.trim().isEmpty()){
            throw new IllegalArgumentException("标题不能为空");
        }
        this.title = newTitle;
    }


   /*  @Override
    public String toString(){
        return title + " " + (completed?"[已完成]":"[未完成]");
    }*/
    public abstract String toString();

    //public abstract void setPriority(int priority);
    public abstract int getPriority();

    @Override
    public int compareTo(Task other){
        return Integer.compare(this.getPriority(), other.getPriority());
    }
}
