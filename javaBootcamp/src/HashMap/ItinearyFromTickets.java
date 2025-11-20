package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class ItinearyFromTickets {
    public static  String getStart(HashMap<String,String> ticket){
        // To - from tickets
        HashMap<String,String> revMap = new HashMap<>();
        for (String key:ticket.keySet()) {
            revMap.put(ticket.get(key),key );
        }
        for (String from:ticket.keySet()
             ) {
            if (!revMap.containsKey(from)) {
                return from;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        //from - to  tickets
        HashMap<String,String> tickets  = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

       String start =   getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print("-"+tickets.get(start));
            start = tickets.get(start);
        }




    }
}
