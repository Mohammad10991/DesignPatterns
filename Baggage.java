package Airport;

public class Baggage {

    private static int priority;
    private String destination;

    public static void Baggage(int priority, String destination){
        priority = priority;
        destination = destination;
    }

    public int getPriority(){
        return priority;
    }

    public String getDestination(){
        return destination;
    }

}
