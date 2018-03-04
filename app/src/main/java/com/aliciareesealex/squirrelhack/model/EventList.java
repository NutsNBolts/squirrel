package com.aliciareesealex.squirrelhack.model;

import java.util.ArrayList;

/**
 * Created by ducoterra on 3/3/2018.
 */

public class EventList {
    private ArrayList<Event> events;

    /**
     * A list of Event objects
     */
    public EventList() {
        this.events = new ArrayList<>();
    }

    /**
     * @return the size of the array of events
     */
    public int size() {
        return this.events.size();
    }

    public ArrayList<EventList.Event> getList() {
        return this.events;
    }

    public boolean isEmpty() {
        if (this.events.size() == 0) {
            return true;
        }
        return false;
    }

    public boolean clear() {
        this.events = new ArrayList<>();
        return true;
    }

    /**
     * @param name the name of the event
     * @return an Event object
     */
    public Event addEvent(String name) {
        Event e = new Event(name);
        this.events.add(e);
        return e;
    }

    /**
     * @return converts a list of event objects to a list of comma separated values:
     * Name1,Count1
     * Name2,Count2
     * Name3,Count3
     * Name4,Count4
     */
    public String toCsvList() {
        String result = "";
        for (Event e : this.events) {
            result += e.toCsv() + "\n";
        }
        return result;
    }

    /**
     * @param csv a list of comma separated values:
     * Name1,Count1
     * Name2,Count2
     * Name3,Count3
     * Name4,Count4
     * @return
     */
    public boolean fromCsvList(String csv) {
        String[] events = csv.split("\n");
        int currentLine = 0;

        for (String e : events) {
            Event newEvent = new Event();
            newEvent.fromCsv(events[currentLine]);
            this.events.add(newEvent);
            currentLine++;
        }

        return true;
    }

    public class Event {
        private String name;
        private int count;

        /**
         * Creates a blank event
         */
        public Event() {
            this.name = null;
            this.count = 0;
        }

        /**
         * Creates a new Event
         *
         * @param name String name
         */
        public Event(String name) {
            this.name = name;
            this.count = 0;
        }

        /**
         * Increments the event count by 1
         *
         * @return true if incremented, false if max value
         */
        public boolean increment() {
            if (this.count < Integer.MAX_VALUE) {
                this.count++;
                return true;
            }
            return false;
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
         *
         * @return int the number of times the event happened
         */
        public int getCount() {
            return this.count;
        }

        /**
         * resets the count of an event to zero (like at the end of the day)
         *
         * @return true if reset
         */
        public boolean resetCount() {
            this.count = 0;
            return true;
        }

        /**
         * gets the name of the current event
         *
         * @return String name
         */
        public String getName() {
            return this.name;
        }

        /**
         * sets the name of an event
         *
         * @return true if name set
         */
        public boolean setName(String newName) {
            this.name = newName;
            return true;
        }

        /**
         * converts an Event to a string
         *
         * @return String name,count
         */
        public String toCsv() {
            return this.name + "," + this.count;
        }

        /**
         * @param csv a string of comma separated values:
         *            Name, Count
         * @return true if object loaded from values, false if count was not an int
         */
        public boolean fromCsv(String csv) {
            String[] values = csv.split(",");
            this.name = values[0];
            try {
                this.count = Integer.parseInt(values[1]);
            } catch (Exception error) {
                return false;
            }
            return true;
        }
    }
}