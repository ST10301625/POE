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
class Task { 
////// ctrl + shift + u = unit test //////    
/////// Variable Declaration //////    

    private static int taskCount = 0;
    private int taskId;
    private String taskName;
    private String taskDescription;
    private int taskDuration;
    private int tasksTally;
    private int totalHours;

    public Task() { 
        /////// Switch Statement to prompt a user for what option they want to pick////// 
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        int choice = 0;

        while (choice != 3) {
            String input = JOptionPane.showInputDialog(
                    "Menu:\nOption 1) Add tasks\nOption 2) Show report\nOption 3) Quit\nEnter your choice:");

            while (!input.matches("[1-3]")) {
                JOptionPane.showMessageDialog(null, "Please enter a valid choice (1-3).");
                input = JOptionPane.showInputDialog(
                        "Menu:\nOption 1) Add tasks\nOption 2) Show report\nOption 3) Quit\nEnter your choice:");
            }
           /////// Converting the input to an integer ////// 
            choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    int numTasks = UserInput();
                    addTaskDetails(numTasks);
                    break;

                case 2:
                    ShowReport();
                    break;

                case 3:
                    Quit();
                    break;
            }
        }
    }

    private void Quit() {
        /////// The message that will be outputted if a user chooses option 3 ////// 
        JOptionPane.showMessageDialog(null, "Thank you for using the Kanban App!");
       
    }

    private int UserInput() {
        /////// Prompting the user to enter the amount of tasks they want to add ////// 
        String input = JOptionPane.showInputDialog("Enter the number of tasks:");
        int numTasks = Integer.parseInt(input);
        return numTasks;
    }

    public void addTaskDetails(int numTasks) {
        /////// Prompting user to enter all the relevant information regarding the tasks ////// 
        totalHours = 0;
        for (int i = 1; i <= numTasks; i++) {
            String taskName = getNonEmptyInput("Enter the name for task " + i + ":");
            String taskDesc = getNonEmptyInput("Enter the description for task " + i + ":");
            while (taskDesc.length() > 50) {
                JOptionPane.showMessageDialog(null, "Task description cannot exceed 50 characters.");
                taskDesc = getNonEmptyInput("Enter the description for task " + i + ":");
            }
            int taskDuration = getTaskDuration(i);
            String developerFirstName = getNonEmptyInput("Enter the first name of the developer for task " + i + ":");
            String developerLastName = getNonEmptyInput("Enter the last name of the developer for task " + i + ":");
            String developerFullName = developerFirstName + " " + developerLastName;
            String taskStatus = getTaskStatus(i);
            createTaskID(taskName, i, developerFullName);
            totalHours += taskDuration;
            printTaskDetails(taskName, taskDesc, taskDuration, developerFullName, taskStatus);
        }
    }

    private String getNonEmptyInput(String message) {
        /////// Check preformed to see if an input is null, and if true, an error message occurs ////// 
        String input = JOptionPane.showInputDialog(message);
        while (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Input cannot be empty.");
            input = JOptionPane.showInputDialog(message);
        }
        return input;
    }

    private int getTaskDuration(int taskNumber) {
        /////// Calculation of the total duration of the tasks////// 
        String input = getNonEmptyInput("Enter the duration (in hours) for task " + taskNumber + ":");
        int taskDuration = Integer.parseInt(input);
        return taskDuration;
    }

    private String getTaskStatus(int taskNumber) {
        /////// Prompts user for a task status, using a dropdown list ////// 
        String[] options = {"To Do", "Done", "Doing"};
        String taskStatus = (String) JOptionPane.showInputDialog(
                null,
                "Select the status for task " + taskNumber + ":",
                "Task Status",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);
        return taskStatus;
    }

    private void createTaskID(String taskName, int taskNumber, String developerFullName) {
        /////// Creation of the most complicated task ID one can find ////// 
        String id = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":"
                + developerFullName.substring(developerFullName.length() - 3).toUpperCase();
        JOptionPane.showMessageDialog(null, "Task ID: " + id);
    }

    private void ShowReport() {
        /////// Message displayed if option 2 is chosen from the case statement ////// 
        JOptionPane.showMessageDialog(null,"Coming soon");
    }

    public boolean CheckTaskDescription(String taskDesc) {
        /////// Checks the length of the class description////// 
        return taskDesc.length() > 50;
    }
       /////// The output of all information relevant to each task////// 
    public void printTaskDetails(String taskName, String taskDesc, int taskDuration, String developerFullName, String taskStatus) {
        JOptionPane.showMessageDialog(null, "Task Details:\n" +
                "Task Name: " + taskName + "\n" +
                "Task Description: " + taskDesc + "\n" +
                "Task Duration: " + taskDuration + " hours\n" +
                "Developer: " + developerFullName + "\n" +
                "Task Status: " + taskStatus);
    }

    public int returnTotalHours() {
        return totalHours;
    }
}


    
    
        
    

    

