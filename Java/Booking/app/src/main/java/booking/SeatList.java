package booking;

import java.util.ArrayList;

public class SeatList {
    char row; 
    ArrayList<Seat> rowSeats ;

    public SeatList() {
        this.rowSeats = new ArrayList<>();
    }

    public ArrayList<Seat> getRowSeats() {
        return rowSeats;
    }

    public void setRowSeats(ArrayList<Seat> rowSeats) {
        this.rowSeats = rowSeats;
    }

   public Seat getSeatDetails(int seatNum){
    return  rowSeats.get(seatNum);
   }

   public int seatCount(){
    return  rowSeats.size();
   }

public char getRow() {
    return row;
}

public void setRow(char row) {
    this.row = row;
}

   

    
    

}
