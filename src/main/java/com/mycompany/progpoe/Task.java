package com.mycompany.progpoe;

import javax.swing.JOptionPane;

public class Task {
    TaskManager taskManager;

    public Task() {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        taskManager = new TaskManager(100);
        int choice = 0;

        while (choice != 9) {
            String input = JOptionPane.showInputDialog(
                    "Menu:\n" +
                    "Option 1) Add tasks\n" +
                    "Option 2) Show full task details\n" +
                    "Option 3) Show tasks with status 'Done'\n" +
                    "Option 4) Show task with longest duration\n" +
                    "Option 5) Search task by name\n" +
                    "Option 6) Search tasks by developer\n" +
                    "Option 7) Delete task by name\n" +
                    "Option 8) Display full task details\n" +
                    "Option 9) Quit\n" +
                    "Enter your choice:");

            while (!input.matches("[1-9]|10")) {
                JOptionPane.showMessageDialog(null, "Please enter a valid choice (1-10).");
                input = JOptionPane.showInputDialog(
                        "Menu:\n" +
                        "Option 1) Add tasks\n" +
                        "Option 2) Show full task details\n" +
                        "Option 3) Show tasks with status 'Done'\n" +
                        "Option 4) Show task with longest duration\n" +
                        "Option 5) Search task by name\n" +
                        "Option 6) Search tasks by developer\n" +
                        "Option 7) Delete task by name\n" +
                        "Option 8) Display full task details\n" +
                        "Option 9) Quit\n" +
                        "Enter your choice:");
            }

            choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    int numTasks = UserInput();
                    addTaskDetails(numTasks);
                    break;

                case 2:
                    taskManager.displayFullTaskDetails();
                    break;

                case 3:
                    taskManager.displayTasksWithStatusDone();
                    break;

                case 4:
                    taskManager.displayLongestDurationTask();
                    break;

                case 5:
                    String taskName = getNonEmptyInput("Enter the task name to search:");
                    taskManager.searchTaskByName(taskName);
                    break;

                case 6:
                    String developerName = getNonEmptyInput("Enter the developer name to search:");
                    taskManager.searchTasksByDeveloper(developerName);
                    break;

                case 7:
                    String taskToDelete = getNonEmptyInput("Enter the task name to delete:");
                    taskManager.deleteTaskByName(taskToDelete);
                    break;

                case 8:
                    taskManager.displayFullTaskDetails();
                    break;

                case 9:
                    Quit();
                    break;
            }
        }
    }

    private void Quit() {
        JOptionPane.showMessageDialog(null, "Thank you for using the Kanban App!");
        System.exit(0); // Exit the program after displaying the message
    }

    private int UserInput() {
        while (true) {
            String input = JOptionPane.showInputDialog("Enter the number of tasks:");
            if (input == null) {
                Quit();
            } else {
                try {
                    int numTasks = Integer.parseInt(input);
                    return numTasks;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                }
            }
        }
    }

    public void addTaskDetails(int numTasks) {
        for (int i = 1; i <= numTasks; i++) {
            String taskName = getNonEmptyInput("Enter the name for task " + i + ":");
            String developerName = getNonEmptyInput("Enter the name of the developer for task " + i + ":");
            int taskDuration = getTaskDuration(i);
            String taskStatus = getTaskStatus(i);
            taskManager.addTask(developerName, taskName, taskDuration, taskStatus);
        }
    }

    private String getNonEmptyInput(String message) {
        String input = JOptionPane.showInputDialog(message);
        while (input == null || input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Input cannot be empty.");
            input = JOptionPane.showInputDialog(message);
        }
        return input;
    }

    private int getTaskDuration(int taskNumber) {
        while (true) {
            String input = getNonEmptyInput("Enter the duration (in hours) for task " + taskNumber + ":");
            try {
                int taskDuration = Integer.parseInt(input);
                if (taskDuration >= 0) {
                    return taskDuration;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a non-negative number.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }
    }

    private String getTaskStatus(int taskNumber) {
        String[] options = {"To Do", "Done", "Doing"};
        String taskStatus = (String) JOptionPane.showInputDialog(
                null,
                "Select the status for task " + taskNumber + ":",
                "Task Status",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);

        while (taskStatus == null) {
            JOptionPane.showMessageDialog(null, "Please select a valid status.");
            taskStatus = (String) JOptionPane.showInputDialog(
                    null,
                    "Select the status for task " + taskNumber + ":",
                    "Task Status",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]);
        }

        return taskStatus;
    }

    public static void main(String[] args) {
        new Task();
    }
}
