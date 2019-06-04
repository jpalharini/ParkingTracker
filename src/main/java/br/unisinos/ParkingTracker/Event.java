package br.unisinos.ParkingTracker;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * TODO: Document this class / interface here
 *
 * @since v7.4
 */

@Entity
class Event {

    @Id
    @GeneratedValue
    private long id;
    private long timestamp;
    private boolean entry;

    public Event() {
        this.timestamp = 0;
        this.entry = false;
    }

    public Event (long timestamp, boolean entry) {
        this.timestamp = timestamp;
        this.entry = entry;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setEntry(boolean entry) {
        this.entry = entry;
    }
}
