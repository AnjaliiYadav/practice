package booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Event {
    private static final int STANDARD_TICKET =10;
    private static final int DELUXE_TICKET =20;

    Venue venue;
    HashMap<Character, ArrayList<Seat>> seats;

    public Event(String string){
        venue = new Venue(string);
        seats = venue.getSeats();

    }

    public int reserveSeats (int numSeats, SeatType seatType) {
        seats = venue.getSeats();
         for (Map.Entry<Character, ArrayList<Seat>> entry : seats.entrySet()) {
        //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        //implement sliding window
       
    }
    return  -1;
    }

    public void returnSeat (char row, int SeatNum){
        ArrayList<Seat> rowSeats = seats.get(row);
        rowSeats.get(SeatNum).setAvailablity(true);
    }
}
