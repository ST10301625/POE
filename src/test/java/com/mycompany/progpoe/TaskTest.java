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
public class TaskTest {
    
    public TaskTest() {
    }

    /**
     * Test of addTaskDetails method, of class Task.
     */
    @Test
    public void testAddTaskDetails() {
        System.out.println("addTaskDetails");
        int numTasks = 2;
        Task instance = new Task();
        instance.addTaskDetails(numTasks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("CheckTaskDescription");
        String taskDesc = "Create Login to authenticate users";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.CheckTaskDescription(taskDesc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String taskName = "Log-in feature";
        String taskDesc = "Create Login to authenticate users";
        int taskDuration = 8;
        String developerFullName = "Robyn Harrison"
                + "";
        String taskStatus = "To Do";
        Task instance = new Task();
        instance.printTaskDetails(taskName, taskDesc, taskDuration, developerFullName, taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        Task instance = new Task();
        int expResult = 8;
        int result = instance.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
