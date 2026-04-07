package practice.ToDo.ui;

import java.time.LocalDate;
import java.util.Scanner;

import practice.ToDo.manager.TaskManager;
import practice.ToDo.model.DeadlineTask;
import practice.ToDo.model.Task;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== 待办事项管理器 ===");
            TaskManager.showTasks();
            System.out.println("1. 添加任务");
            System.out.println("2. 列出所有任务");
            System.out.println("3. 完成任务");
            System.out.println("4. 删除已完成任务");
            System.out.println("5. 删除对应序号任务");
            System.out.println("0. 退出");
            System.out.print("请选择：");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 消耗换行

            switch (choice) {
                case 1:
                    System.out.println("请选择任务类型：1.普通任务 2.截止任务");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("请输入任务标题：");
                    String title = scanner.nextLine();
                    Task task = null;
                    if(type == 1){
                        task = new Task(title);
                    }else if (type == 2){
                        System.out.println("请输入截止日期（yyyy-mm-dd）：");
                        LocalDate ddl = LocalDate.parse(scanner.nextLine());
                        task = new DeadlineTask(title, ddl);
                    }
                    TaskManager.addTask(task);
                    break;

                case 2:
                    TaskManager.showTasks();
                    break;

                case 3:
                    System.out.print("请输入要完成的任务序号：");
                    int index = scanner.nextInt();
                    TaskManager.completeTask(index);
                    break;
                case 0:
                    System.out.println("再见！");
                    scanner.close();
                    return;
                case 4:
                    TaskManager.deleteCompletedTask();
                    break;


                case 5:
                    System.out.print("请输入要删除的任务序号：");
                    index = scanner.nextInt();
                    scanner.nextLine();
                    if(index >= 1 && index <= TaskManager.numOfTask()){
                        Task taskToDel = TaskManager.getTask(index);
                        if(taskToDel.isCompleted()){
                            System.out.println("删除已完成任务"+"["+index+"]"+taskToDel.getTitle());
                            TaskManager.deleteTask(index);
                        }else{
                            System.out.println("任务["+index+"]"+taskToDel.getTitle()+"未完成，是否要删除？(y/n)");
                            String confirm = scanner.nextLine();
                            if (!confirm.equalsIgnoreCase("y")) {
                                System.out.println("取消删除");
                                break;
                            }else{
                                System.out.println("删除未完成任务"+"["+index+"]"+taskToDel.getTitle());
                                TaskManager.deleteTask(index);
                            }
                        }
                    }
                    else{
                        System.out.println("无效序号");
                    }
                    break;


                default:
                    System.out.println("无效输入");
            }
        }
    }
}
