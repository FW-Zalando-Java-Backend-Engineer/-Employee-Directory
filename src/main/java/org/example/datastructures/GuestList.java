package org.example.datastructures;

import java.util.HashSet;

// HashSet stores unique elements
public class GuestList {
    private HashSet<String> guests;

    public GuestList() {
        this.guests = new HashSet<>();
    }

    /**
     * Element will be added only when it isn’t already present in the HashSet.
     *  If an element was added, the method returns true, otherwise – false.
     * */
    public boolean addGuest(String name) {
      return guests.add(name);
    }

    /**
     *  It returns true if the element is found, otherwise false.
     * */
    public boolean isInvited(String name) {
        return guests.contains(name);
    }

    /**
     * Returns the number of elements in this set (its cardinality).
     * */
    public int totalGuests() {
        return guests.size();
    }
}
