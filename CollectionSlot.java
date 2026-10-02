package QueSkip;
import java.time.LocalDate;
import java.time.LocalTime;

public class CollectionSlot {

     private LocalDate date;
     private LocalTime time;
     private int capacity;

    //Constructors
    public CollectionSlot(LocalDate date, LocalTime time, int capacity) {
        this.date = date;
        this.time = time;
        this.capacity = capacity;
    }

    //Getters

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getCapacity() {
        return capacity;
    }

    //Setters
    public void setCapacity(int capacity) {
        if(capacity < 0) {
            System.out.println("Capacity cannot be negative.");
        } else {
        this.capacity = capacity;
        }
    }
}


