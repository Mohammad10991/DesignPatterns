package Airbus;

import Airport.Baggage;
import Airport.Container;
import Airport.ContainerStorage;

import javax.xml.stream.events.StartElement;
import java.util.ArrayList;

public class Airbus {

    private int freeSeats = 562;
    private ArrayList<Container> storage = new ArrayList<>();
    private Enum<Locations> location;


    public void fly(Enum<Locations> n){
        location = n;
        for(int t = 1; t<7; t++){
            for(int d = 1; d<=storage.size(); d++){
                Container current = storage.get(d);
                ArrayList<Baggage> inventory = current.getInventory();
                for(int l = 1; l <= inventory.size(); l++){
                    Baggage now = inventory.get(l);
                    if(now.getPriority() == t){
                        inventory.remove(l);
                    }
                }
            }
        }

    }

    public void returnHome(){
        location = Locations.START;
    }

    public void load(ContainerStorage n){
        for(int z = 0; z<100; z++) {
            Container A = new Container();
            A.storeBaggage(n);
            storage.add(A);
        }
    }
}
