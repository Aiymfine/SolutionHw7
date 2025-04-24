import java.util.*;
public class Mainn{
public static void main(String[] args){
ControlTower tower=new ControlTower();
Aircraft p1=new PassengerPlane("Flight-101");
Aircraft c1=new CargoPlane("Cargo-77");
Aircraft h1=new Helicopter("Heli-9");

List<Aircraft> aircraftList=List.of(p1,c1,h1);
for(Aircraft a:aircraftList)tower.registerAircraft(a);

p1.send("I want to land",tower);
tower.requestRunway(p1);
c1.send("I want to land too",tower);
tower.requestRunway(c1);
h1.send("MAYDAY",tower);
tower.requestRunway(h1);
System.out.println("\n--- Tower in action ---");
for(int i=0;i<4;i++){
tower.tick();
}
}
}