import Airbus.Airbus;
import Airport.Baggage;
import Airport.CheckIn.CheckIn;
import Airport.Container;
import Airport.ContainerStorage;
import Airbus.Locations;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Airbus Plane = new Airbus();

        CheckIn One = new CheckIn();
        CheckIn Two = new CheckIn();
        CheckIn Three = new CheckIn();
        CheckIn Four = new CheckIn();
        CheckIn Five = new CheckIn();
        CheckIn Six = new CheckIn();
        CheckIn Seven = new CheckIn();
        CheckIn Eight = new CheckIn();
        CheckIn Nine = new CheckIn();

        ContainerStorage BOM = new ContainerStorage();
        ContainerStorage CPT = new ContainerStorage();
        ContainerStorage HKG = new ContainerStorage();
        ContainerStorage JFK = new ContainerStorage();
        ContainerStorage NRT = new ContainerStorage();

        for(int t = 0; t<685; t++) {
            while(t<30){
                One.checkIn("First CLass");
                Two.checkIn("First Class");
            }
            while(t<205 && t>= 30){
                Three.checkIn("Business Class");
                Four.checkIn("Business Class");
            }
            while(t>= 205 && t<685){
                Five.checkIn("Economy Class");
                Six.checkIn("Economy Class");
                Seven.checkIn("Economy Class");
                Eight.checkIn("Economy Class");
                Nine.checkIn("Economy class");
            }
        }

        BOM.ContainerStorage("B",CheckIn.getBaggages());
        CPT.ContainerStorage("C",CheckIn.getBaggages());
        HKG.ContainerStorage("H",CheckIn.getBaggages());
        JFK.ContainerStorage("J",CheckIn.getBaggages());
        NRT.ContainerStorage("N",CheckIn.getBaggages());

        for(int o = 2; o<= 6; o++){
            ContainerStorage local = new ContainerStorage();
            Enum destination = Locations.START;
            switch(o){
                case 2:
                    local = BOM;
                    destination = Locations.BOM;
                    break;
                case 3:
                    local = CPT;
                    destination = Locations.CPT;
                    break;
                case 4:
                    local = HKG;
                    destination = Locations.HKG;
                    break;
                case 5:
                    local = JFK;
                    destination = Locations.JFK;
                    break;
                case 6:
                    local = NRT;
                    destination = Locations.NRT;
                    break;
            }
            Plane.load(local);
            Plane.fly(destination);
            Plane.returnHome();
        }


    }
}
