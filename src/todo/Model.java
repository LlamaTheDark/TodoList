/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.util.Date;

public class Model {
    
    int taskCount = 0;
        
    Task[] tasks = new Task[100];
    FileHelper helper = new FileHelper();
    
    Model(){
        String[] lines = helper.readTasks();
        taskCount = lines.length;
        for (int i = 0; i < taskCount; i++){
            tasks[i] = new Task();
            String[] taskLine = lines[i].split("#");
            tasks[i].setTitle(taskLine[0]);
            tasks[i].setDescription(taskLine[1]);
        }
    }
    
    void add(String title, String description){
        Task task = new Task();
        task.setDescription(description);
        task.setTitle(title);
        tasks[taskCount] = task;
        taskCount++;
        
        // every time we add something we have to save it to the file
        helper.writeTasks(getTasks());
        
        //tasks[taskCount++] = task; you can also write it like this
    }
    
    void remove(int index){
        for (int i = index; i < taskCount; i++){
            tasks[i] = tasks[i+1];
        }
        taskCount--;
        
        helper.writeTasks(getTasks());
    }
    
    void edit(int index, String title, String description){
        tasks[index].setDescription(description);
        tasks[index].setTitle(title);
        
        helper.writeTasks(getTasks());
    }

    String[] getTasks(){
        // create a new string array
        
        String[] tmpTasks = new String[taskCount];
        
        // loop through the tasks and add a string representation
        // of each one to the new array
        
        for(int i = 0; i < taskCount; i++){
            tmpTasks[i] = tasks[i].toString();
        }
        
        // return the array
        
        return tmpTasks;
    }

    String[] getTaskValues(int index){
        String[] values = new String[2];
        values[0] = tasks[index].getTitle();
        values[1] = tasks[index].getDescription();
        return values;
    }

    String[] getTaskTitles(){
        String[] lines = getTasks();
            for(int i = 0; i < lines.length; i++){
                lines[i] = lines[i].split("#")[0];
        }
        return lines;    
    }
}