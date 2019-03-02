package Airport.CheckIn;

import Airport.Baggage;

import java.util.Random;

public class FirstCheckIn extends CheckIn{

    public void checkIn(String flightClass) {
        if (flightClass == "First Class") {
            Random r = new Random();
            int number = r.nextInt()*3+2;
            for(int t = 0;t<number; t++){
                generateBaggage(flightClass);
            }
        }

    }

    public void generateBaggage(String flightClass){
        String g = new String();
        Random r = new Random();
        Baggage n = new Baggage();
        switch ((r.nextInt()*5+1)){
            case 1:
                g = "B";
                break;
            case 2:
                g = "C";
                break;
            case 3:
                g = "H";
                break;
            case 4:
                g = "J";
                break;
            case 5:
                g = "N";
                break;
        }
        if (flightClass == "First Class"){
            if(maxFirstTransfer <= 18) {
                n.Baggage(1,g);
                baggages.add(n);
                maxFirstTransfer++;
            }else{
                n.Baggage(3,g);
                baggages.add(n);
            }
        }
    }
}
