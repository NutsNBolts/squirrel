package com.aliciareesealex.squirrelhack;

import org.junit.Test;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by ducoterra on 3/3/2018.
 */
public class EventTest {
    private Event e;

    @Test
    public void decrement() throws Exception {
        e = new Event("Test");
        assertEquals(e.decrement(), false);
        assertEquals(e.increment(), true);
        assertEquals(e.decrement(), true);
    }

    @Test
    public void getCount() throws Exception {
        e = new Event("test");
        assertEquals(e.getCount(), 0);
    }

    @Test
    public void increment() throws Exception {
        e = new Event("Test");
        assertEquals(e.getCount(), 0);
        e.increment();
        assertEquals(e.getCount(), 1);
    }

    @Test
    public void resetCount() throws Exception {
        e = new Event("Test");
        e.increment();
        assertEquals(e.getCount(), 1);
        e.resetCount();
        assertEquals(e.getCount(), 0);
    }

    @Test
    public void getName() throws Exception {
        e = new Event("Test");
        assertEquals(e.getName(), "Test");
    }

    @Test
    public void setName() throws Exception {
        e = new Event("Test");
        assertEquals(e.getName(), "Test");
        e.setName("New");
        assertEquals(e.getName(), "New");
    }

}