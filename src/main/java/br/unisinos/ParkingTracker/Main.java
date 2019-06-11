package br.unisinos.ParkingTracker;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb;
        SessionFactory factory;
        Session session;
        Transaction tx;

        boolean entry, stop;
        int events = 0;
        String counter;
        Event event;

        factory = new Configuration().configure().buildSessionFactory();
        session = factory.openSession();

        kb = new Scanner(System.in);

        System.out.println("Start counting!");
        System.out.println("Count entries (true) or exits (false)?");
        entry = kb.nextBoolean();

        System.out.println("Press enter to count a car, type 'x' to stop");

        stop = false;

        if(kb.hasNextLine())
            kb.nextLine();

        do {
            counter = kb.nextLine();
            if (counter.equals("x"))
                stop = true;
            else {
                event = new Event(System.currentTimeMillis(), entry);
                tx = session.beginTransaction();
                session.persist(event);
                tx.commit();
                System.out.println("Event registered");
            }
        } while (!stop);
    }
}
