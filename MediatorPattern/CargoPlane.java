public class CargoPlane extends Aircraft{
    public CargoPlane(String id){
        super(id);
    }
    public void receive(String msg){
    System.out.println(id+" (CargoPlane) received: "+msg);
    }
    }