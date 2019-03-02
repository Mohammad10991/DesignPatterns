package Airport;

import java.util.ArrayList;

public class ContainerStorage {

    private String destination;
    private ArrayList<Baggage> baggages = new ArrayList<>();
    private static ArrayList<Baggage> collectedBaggage = new ArrayList<>();

    public void ContainerStorage(String destination, ArrayList<Baggage> baggages){
        this.destination = destination;
        this.baggages = baggages;
        collectBaggage(destination);
    }


    private void collectBaggage(String destination){
        for(int t = 0; t<=baggages.size();t++){
            Baggage g = baggages.get(t);
            if(g.getDestination() == destination){
                collectedBaggage.add(g);
            }
        }
    }

    public static ArrayList getCollectedBaggage(){
        return collectedBaggage;
    }

    public static void setCollectedBaggage(ArrayList<Baggage> n){
        collectedBaggage = n;
    }
}
