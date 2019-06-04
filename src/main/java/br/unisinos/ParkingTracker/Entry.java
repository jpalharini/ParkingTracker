package br.unisinos.ParkingTracker;

import javax.persistence.Entity;

/**
 * TODO: Document this class / interface here
 *
 * @since v7.4
 */

@Entity
public class Entry extends Event {

    public Entry(long timestamp) {
        super(timestamp, true);
    }
}
