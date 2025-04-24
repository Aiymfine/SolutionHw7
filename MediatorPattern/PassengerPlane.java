public class PassengerPlane extends Aircraft{
    public PassengerPlane(String id){
        super(id);}
    public void receive(String msg){
    System.out.println(id+" (PassengerPlane) received: "+msg);
    }
    }