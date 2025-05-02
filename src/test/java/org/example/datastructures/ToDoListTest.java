package org.example.datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoListTest {
    @Test
    void testToDoList() {
        ToDoList list = new ToDoList();
        list.addTask("Laundry");
        list.addTask("Groceries");

        list.completeAllTasks();

        assertTrue(list.isEmpty());
    }
}
