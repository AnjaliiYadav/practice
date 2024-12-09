package booking;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Venue {
    private HashMap<Character, ArrayList<Seat>> seats = new HashMap<>();
    

    public Venue(String input){
        String[] parts = input.split("\\n");
        
    }

    private void createSeating(String[] parts){
        int numSeats = Integer.valueOf(parts[0]);
        for ( int i = 0; i<numSeats; i++){
            char row = getRow(i); 
            String[] temp = parts[i].split(" ");
            ArrayList<Seat> list = new ArrayList<>();
            for (int j = 0; j<temp.length; j++){
                SeatType type = (temp[j] == "S") ? SeatType.STANDARD : SeatType.DELUXE;
                Seat seat = new Seat(row, j, type);
                list.add(seat);
            }

            seats.put(row, list);

        }
    }

    public void printDetails(){
        for (Map.Entry<Character, ArrayList<Seat>> entry : seats.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

            
        }
    }



    private char getRow(int i){
        switch (i) {
            case 1:
                return 'A';
            case 2:
                return 'B';
            case 3:
                return 'C';
            case 4:
                return 'D';
            case 5:
                return 'E';
            case 6:
                return 'F';
            case 7:
                return 'G';
            case 8:
                return 'H';
            case 9:
                return 'I';
            case 10:
                return 'J';
            case 11:
                return 'K';
            case 12:
                return 'L';
            case 13:
                return 'M';
            case 14:
                return 'N';
            case 15:
                return 'O';
            case 16:
                return 'P';

            default:
                return '0';
                
        } 
    }

    public HashMap<Character, ArrayList<Seat>> getSeats() {
        return seats;
    }

    

}
