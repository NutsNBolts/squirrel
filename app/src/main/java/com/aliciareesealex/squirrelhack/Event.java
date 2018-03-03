package com.aliciareesealex.squirrelhack;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.File;
import java.util.HashMap;

/**
 * Created by ducoterra on 3/3/2018.
 */

public class Event {
    private String name;
    private int count;

    /**
     * Creates a new Event
     * @param name String name
     */
    public Event(String name) {
        this.name = name;
        this.count = 0;
    }

    /**
     * Increments the event count by 1
     * @return true if incremented
     */
    public boolean increment() {
        this.count++;
        return true;
    }

    /**
     * @return true if decremented, false if already 0
     */
    public boolean decrement() {
        if (this.count > 0) {
            this.count--;
            return true;
        }
        return false;
    }

    /**
     * returns the current count of events
     * @return int the number of times the event happened
     */
    public int getCount() {
        return this.count;
    }

    /**
     * resets the count of an event to zero (like at the end of the day)
     * @return true if reset
     */
    public boolean resetCount() {
        this.count = 0;
        return true;
    }

    /**
     * gets the name of the current event
     * @return String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * sets the name of an event
     * @return true if name set
     */
    public boolean setName(String newName) {
        this.name = newName;
        return true;
    }

    /**
     * converts an Event to a string
     * @return String name:count
     */
    @Override
    public String toString() {
        return this.name + ":" + this.count;
    }
}
