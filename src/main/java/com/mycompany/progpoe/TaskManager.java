/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progpoe;

import javax.swing.JOptionPane;

/**
 *
 * @author totca
 */
class TaskManager { 
    String[] developers;
    String[] taskNames;
    String[] taskIDs;
    int[] taskDurations;
    String[] taskStatuses;
    int taskCount;

    public TaskManager(int maxTasks) {
        developers = new String[maxTasks];
        taskNames = new String[maxTasks];
        taskIDs = new String[maxTasks];
        taskDurations = new int[maxTasks];
        taskStatuses = new String[maxTasks];
        taskCount = 0;
    }
     public void runTaskManager() {
        
        
        //Code to display a welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Task Manager!");
        
        // Prompts the user to enter the number of tasks
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks:"));
        
        // Create a Task class
        Task task = new Task();
        
        // Adding the task details
        task.addTaskDetails(numTasks);
                
        // Display a thank you message when the user exits the app
        JOptionPane.showMessageDialog(null, "Thank you for using the Task Manager!");
    }

    public void addTask(String developer, String taskName, int duration, String status) {
        if (taskCount < developers.length) {
            developers[taskCount] = developer;
            taskNames[taskCount] = taskName;
            taskDurations[taskCount] = duration;
            taskStatuses[taskCount] = status;
            generateTaskID(taskCount);
            taskCount++;
        } else {
            JOptionPane.showMessageDialog(null, "Task capacity reached. Cannot add more tasks.");
        }
    }

    private void generateTaskID(int index) {
        String id = taskNames[index].substring(0, 2).toUpperCase() + ":" + (index + 1) + ":"
                + developers[index].substring(developers[index].length() - 3).toUpperCase();
        taskIDs[index] = id;
    }

    public void displayTasksWithStatusDone() {
        StringBuilder report = new StringBuilder();
        for (int i = 0; i < taskCount; i++) {
            if (taskStatuses[i].equalsIgnoreCase("Done")) {
                report.append("Developer: ").append(developers[i]).append("\n");
                report.append("Task Name: ").append(taskNames[i]).append("\n");
                report.append("Task Duration: ").append(taskDurations[i]).append(" hours\n\n");
            }
        }
        if (report.length() > 0) {
            JOptionPane.showMessageDialog(null, "Tasks with status 'Done':\n\n" + report.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks with status 'Done' found.");
        }
    }

    public void displayLongestDurationTask() {
        int maxDuration = 0;
        int maxDurationIndex = -1;
        for (int i = 0; i < taskCount; i++) {
            if (taskDurations[i] > maxDuration) {
                maxDuration = taskDurations[i];
                maxDurationIndex = i;
            }
        }
        if (maxDurationIndex != -1) {
            JOptionPane.showMessageDialog(null, "Task with the longest duration:\n\n" +
                    "Developer: " + developers[maxDurationIndex] + "\n" +
                    "Duration: " + taskDurations[maxDurationIndex] + " hours");
        } else {
            JOptionPane.showMessageDialog(null, "No tasks found.");
        }
    }

    public void searchTaskByName(String taskName) {
    boolean found = false;
    for (int i = 0; i < taskCount; i++) {
        if (taskNames[i].equalsIgnoreCase(taskName)) {
            JOptionPane.showMessageDialog(null, "Task Name: " + taskNames[i] + "\n" +
                    "Developer: " + developers[i] + "\n" +
                    "Task Status: " + taskStatuses[i]);
            found = true;
            break;
        }
    }
    if (!found) {
        JOptionPane.showMessageDialog(null, "Task with the name '" + taskName + "' not found.");
    }
}

public void searchTasksByDeveloper(String developerName) {
    StringBuilder report = new StringBuilder();
    boolean found = false;
    for (int i = 0; i < taskCount; i++) {
        if (developers[i].equalsIgnoreCase(developerName)) {
            report.append("Task Name: ").append(taskNames[i]).append("\n");
            report.append("Task Status: ").append(taskStatuses[i]).append("\n\n");
            found = true;
        }
    }
    if (found) {
        JOptionPane.showMessageDialog(null, "Tasks assigned to developer '" + developerName + "':\n\n" + report.toString());
    } else {
        JOptionPane.showMessageDialog(null, "No tasks assigned to developer '" + developerName + "' found.");
    }
}


    public void deleteTaskByName(String taskName) {
        boolean found = false;
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                // Shift the remaining tasks in the arrays to remove the task
                for (int j = i; j < taskCount - 1; j++) {
                    developers[j] = developers[j + 1];
                    taskNames[j] = taskNames[j + 1];
                    taskIDs[j] = taskIDs[j + 1];
                    taskDurations[j] = taskDurations[j + 1];
                    taskStatuses[j] = taskStatuses[j + 1];
                }
                taskCount--;
                found = true;
                JOptionPane.showMessageDialog(null, "Task '" + taskName + "' deleted successfully.");
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Task with the name '" + taskName + "' not found.");
        }
    }

    public void displayFullTaskDetails() {
        StringBuilder report = new StringBuilder();
        for (int i = 0; i < taskCount; i++) {
            report.append("Task Details:\n");
            report.append("Developer: ").append(developers[i]).append("\n");
            report.append("Task Name: ").append(taskNames[i]).append("\n");
            report.append("Task ID: ").append(taskIDs[i]).append("\n");
            report.append("Task Duration: ").append(taskDurations[i]).append(" hours\n");
            report.append("Task Status: ").append(taskStatuses[i]).append("\n\n");
        }
        if (taskCount > 0) {
            JOptionPane.showMessageDialog(null, "Full Task Details:\n\n" + report.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks found.");
        }
    }
}

