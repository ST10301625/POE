/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.progpoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author totca
 */
public class TaskManagerTest {
    
    public TaskManagerTest() {
    }

    /**
     * Test of runTaskManager method, of class TaskManager.
     */
    @Test
    public void testRunTaskManager() {
        System.out.println("runTaskManager");
        TaskManager instance = null;
        instance.runTaskManager();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTask method, of class TaskManager.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        String developer = "Mike Smith";
        String taskName = "Create Login";
        int duration = 0;
        String status = "To Do";
        TaskManager instance = null;
        instance.addTask(developer, taskName, duration, status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTasksWithStatusDone method, of class TaskManager.
     */
    @Test
    public void testDisplayTasksWithStatusDone() {
        System.out.println("displayTasksWithStatusDone");
        TaskManager instance = null;
        instance.displayTasksWithStatusDone();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestDurationTask method, of class TaskManager.
     */
    @Test
    public void testDisplayLongestDurationTask() {
        System.out.println("displayLongestDurationTask");
        TaskManager instance = null;
        instance.displayLongestDurationTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class TaskManager.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String taskName = "Create Login";
        TaskManager instance = null;
        instance.searchTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class TaskManager.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developerName = "Mike Smith";
        TaskManager instance = null;
        instance.searchTasksByDeveloper(developerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTaskByName method, of class TaskManager.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");
        String taskName = "Create Login";
        TaskManager instance = null;
        instance.deleteTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayFullTaskDetails method, of class TaskManager.
     */
    @Test
    public void testDisplayFullTaskDetails() {
        System.out.println("displayFullTaskDetails");
        TaskManager instance = null;
        instance.displayFullTaskDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
