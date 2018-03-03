package com.aliciareesealex.squirrelhack;

import com.aliciareesealex.squirrelhack.model.Event;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ducoterra on 3/3/2018.
 */
public class EventTest {
    private Event e;

    @Test
    public void decrement() {
        e = new Event("Test");
        assertEquals(e.decrement(), false);
        assertEquals(e.increment(), true);
        assertEquals(e.decrement(), true);
    }

    @Test
    public void getCount() {
        e = new Event("test");
        assertEquals(e.getCount(), 0);
    }

    @Test
    public void increment() {
        e = new Event("Test");
        assertEquals(e.getCount(), 0);
        e.increment();
        assertEquals(e.getCount(), 1);
    }

    @Test
    public void resetCount() {
        e = new Event("Test");
        e.increment();
        assertEquals(e.getCount(), 1);
        e.resetCount();
        assertEquals(e.getCount(), 0);
    }

    @Test
    public void getName() {
        e = new Event("Test");
        assertEquals(e.getName(), "Test");
    }

    @Test
    public void setName() {
        e = new Event("Test");
        assertEquals(e.getName(), "Test");
        e.setName("New");
        assertEquals(e.getName(), "New");
    }

}