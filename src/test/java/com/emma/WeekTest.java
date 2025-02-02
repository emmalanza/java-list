package com.emma;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeekTest {

    private Week week;

    @BeforeEach
    void setUp() {
        week = new Week();
    }

    @Test 
    public void testGetDaysOfWeek() {
        List<String> days = week.getDaysOfWeek();
        assertEquals(7, days.size());
        assertTrue(days.contains("Monday"));
    }

    @Test 
    public void testGetListSize() {
        assertEquals(7, week.getListSize());
    }

    @Test 
    public void testDeleteDay() {
        assertTrue(week.deleteDay("Monday"));
    }

    @Test
    public void testSort() {
        week.sort();
        List <String> days = week.getDaysOfWeek();
        assertEquals("Friday", days.get(0));
        assertEquals("Wednesday", days.get(6));
        
    }

    @Test
    public void testClearList() {
        week.clearList();
        assertEquals(0, week.getListSize());
    }

    @Test 
    public void testGetDayByIndex() {
        assertEquals("Monday", week.getDayByIndex(0));
        assertEquals("Sunday", week.getDayByIndex(6));
        assertThrows(IndexOutOfBoundsException.class, () -> week.getDayByIndex(7));

    }

    @Test
    public void testIsInDaysList() {
        assertTrue(week.isInDaysList("Monday"));
        assertFalse(week.isInDaysList("December"));
    }

}
