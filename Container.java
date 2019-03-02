package Airport;

import java.util.ArrayList;

public class Container {

    private ArrayList<Baggage> inventory = new ArrayList();
    private ArrayList<Baggage> baggages = new ArrayList<>();

    public void storeBaggage(ContainerStorage n){

        int f = 72;
        for(int t = 1; t<=f; t++){
            baggages = n.getCollectedBaggage();
            if(baggages.get(t) == null){
                f++;
                continue;
            }
            inventory.add(baggages.get(t));
            baggages.remove(t);
            n.setCollectedBaggage(baggages);
        }
    }


    public ArrayList getInventory(){
        return inventory;
    }
}
