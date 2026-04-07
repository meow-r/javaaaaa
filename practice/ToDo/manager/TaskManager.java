package practice.ToDo.manager;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

import practice.ToDo.model.Task;

public class TaskManager {
    private static ArrayList<Task> TaskList = new ArrayList<>();
    static int numOfUncompletedTask = 0;

    public static int numOfTask(){
        return TaskList.size();
    }

    public static void addTask(Task task){
        if(task != null){
            TaskList.add(task);
            numOfUncompletedTask ++;
            System.out.println("添加成功");
        }
    }

    public static void showTasks(){
        if(TaskList.isEmpty()){
            System.out.println("任务列表为空");
            return;
        }
        for (int i = 0; i < TaskList.size(); i ++){
            System.out.println("["+(i+1)+"]: "+(TaskList.get(i)).toString());
        }
        System.out.println("当前未完成任务：" + numOfUncompletedTask + "个");
    }

    public static void deleteCompletedTask(){
        if(TaskList.isEmpty()){
            System.out.println("任务列表为空");
            return;
        }
        Iterator<Task> iterator = TaskList.iterator();
        while(iterator.hasNext()){
            Task tmp = iterator.next();
            if(tmp.isCompleted()){
                System.out.println("删除"+tmp.getTitle());
                iterator.remove();
            }
        }
    }

    public static Task getTask(int index){
        return TaskList.get(index-1);
    }

    public static void deleteTask(int index){
        if(!TaskList.get(index-1).isCompleted()){
            numOfUncompletedTask --;
        }
        TaskList.remove(index-1);
        
    }


    public static void completeTask(int index){
        if(index >= 1 && index <= TaskList.size() && !TaskList.get(index-1).isCompleted()){
            System.out.println("完成任务"+"["+index+"]");
            TaskList.get(index-1).completeTask();
            numOfUncompletedTask --;
            return;
        }else if(index >= 1 && index <= TaskList.size() && TaskList.get(index-1).isCompleted()){
            System.out.println("任务已完成过了！");
            return;
        }
        System.out.println("无效任务");
        return;
    }
}
