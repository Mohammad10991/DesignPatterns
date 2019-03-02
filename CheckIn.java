package Airport.CheckIn;

import Airport.Baggage;

import java.util.ArrayList;

public class CheckIn {

    protected static ArrayList<Baggage> baggages = new ArrayList<>();
    protected int maxFirstTransfer = 0;
    protected int maxBusinessTransfer = 0;
    protected int maxEconomyTransfer = 0;
    private CheckIn successor;

    public void checkIn(String flightClass) {
        System.out.print("No class defined!!");
    }


    public void generateBaggage(String flightClass){
        System.out.print("No class defined!!");
    }

    public static ArrayList<Baggage> getBaggages(){
        return baggages;
    }

    public CheckIn getSuccessor() {
        return successor;
    }

    public void setSuccessor(CheckIn successor) {
        this.successor = successor;
    }
}
