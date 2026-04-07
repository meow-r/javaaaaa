package practice.ToDo.model;

import java.time.LocalDate;

public class DeadlineTask extends Task{
    private LocalDate deadline;
    
    public DeadlineTask(String title, LocalDate ddl){
        super(title);
        deadline = ddl;
    }

    public boolean isOverdue(){
        return isCompleted() && LocalDate.now().isAfter(deadline);
    }

    @Override
    public String toString(){
        String status = isCompleted() ? "[已完成]" : (isOverdue() ? "[已过期]" : "[未完成]");
        return getTitle() + " (截止：" + deadline + ") " + status;
    }
}
