package practice.ToDo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DeadlineTask extends Task{
    private LocalDate deadline;
    //private int priority;
    
    public DeadlineTask(String title, LocalDate ddl){
        super(title);
        deadline = ddl;
        
    }

    public boolean isOverdue(){
        return !isCompleted() && LocalDate.now().isAfter(deadline);
    }

    @Override
    public String toString(){
        String status = isCompleted() ? "[已完成]" : (isOverdue() ? "[已过期]" : "[未完成]");
        return getTitle() + " (截止：" + deadline + ") " + status;
    }

    //@Override

    @Override
    public int getPriority(){
        LocalDate now = LocalDate.now();
        long daysDiff = ChronoUnit.DAYS.between(now, deadline);
        if (daysDiff >= 7){
            return 5;
        }else if(daysDiff < 7 && daysDiff >= 5){
            return 4;
        }else if(daysDiff < 5 && daysDiff >= 3){
            return 3;
        }else if(daysDiff < 3 && daysDiff >= 2){
            return 2;
        }else {
            return 1;
        }
        //return priority;
    }
}
