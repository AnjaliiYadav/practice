package booking;


public class Seat {

    private char row;
    private int seatNum;
    private SeatType seatType;
    private boolean availablity=true;

    
    public Seat(char row, int seatNum, SeatType seatType) {
        if (!(row >='A' && row<='Z')) throw new IllegalArgumentException("Invalid Value, the row should be between A-Z");
        this.row=row ;


        if (seatNum<=0) throw new IllegalArgumentException("Invalid Value, the seat number should be positive");
        this.seatNum = seatNum; 

        if (seatType != SeatType.DELUXE || seatType != SeatType.STANDARD ) throw new IllegalArgumentException("Invalid Value, the seat number should be positive");
        this.seatType = seatType;
    }


    public char getRow() {
        return row;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public String getSeatType() {
        return seatType.toString();
    }

    public boolean isAvailablity() {
        return availablity;
    }

    public void setAvailablity(boolean availablity) {
        this.availablity = availablity;
    }

    





}