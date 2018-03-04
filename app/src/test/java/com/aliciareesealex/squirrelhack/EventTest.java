package com.aliciareesealex.squirrelhack;

import com.aliciareesealex.squirrelhack.model.EventList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ducoterra on 3/3/2018.
 */
public class EventTest {
    private EventList eList = new EventList();
    private EventList.Event e;

    @Test
    public void increment() throws Exception {
        e = eList.addEvent("Name");
        assertEquals(e.getCount(), 0);
        e.increment();
        assertEquals(e.getCount(), 1);
    }

    @Test
    public void decrement() throws Exception {
        e = eList.addEvent("Name");
        assertEquals(e.decrement(), false);
        assertEquals(e.increment(), true);
        assertEquals(e.decrement(), true);
    }

    @Test
    public void getCount() throws Exception {
        e = eList.addEvent("Name");
        assertEquals(e.getCount(), 0);
    }

    @Test
    public void resetCount() throws Exception {
        e = eList.addEvent("Name");
        e.increment();
        assertEquals(e.getCount(), 1);
        e.resetCount();
        assertEquals(e.getCount(), 0);
    }

    @Test
    public void getName() throws Exception {
        e = eList.addEvent("Name");
        assertEquals(e.getName(), "Name");
    }

    @Test
    public void setName() throws Exception {
        e = eList.addEvent("Name");
        assertEquals(e.getName(), "Name");
        e.setName("New");
        assertEquals(e.getName(), "New");
    }

    @Test
    public void toCsv() throws Exception {
        e = eList.addEvent("Name");
        assertEquals(e.toCsv(), "Name,0");
    }

    @Test
    public void fromCsv() throws Exception {
        String data = "Test,13";
        e = eList.addEvent("Name");
        assertEquals(e.fromCsv(data), true);
        assertEquals(e.getCount(), 13);
    }

    @Test
    public void clear() throws Exception {
        eList.addEvent("Name");
        assertEquals(eList.isEmpty(), false);
    }

    @Test
    public void toCsvList() throws Exception {
        String data = "Test1,13\nTest2,39\nTest3,3\n";
        eList.clear();
        assertEquals(eList.isEmpty(), true);
        eList.fromCsvList(data);
        assertEquals(eList.isEmpty(), false);
        assertEquals(eList.toCsvList(), data);
    }

    @Test
    public void fromCsvList() throws Exception {
        String data = "Test1,13\nTest2,39\nTest3,3\n";
        eList.clear();
        assertEquals(eList.isEmpty(), true);
        eList.fromCsvList(data);
        assertEquals(eList.isEmpty(), false);
        assertEquals(eList.toCsvList(), data);
}

}