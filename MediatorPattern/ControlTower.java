import java.util.*;
public class ControlTower implements TowerMediator{
private Queue<Aircraft> landingQueue=new LinkedList<>();
private Queue<Aircraft> takeOffQueue=new LinkedList<>();
private List<Aircraft> allAircraft=new ArrayList<>();

public void broadcast(String msg,Aircraft sender){
    if(msg.equalsIgnoreCase("MAYDAY")){
        System.out.println("EMERGENCY - "+sender.getId()+" needs to land now!");
        for(Aircraft a:allAircraft){
            if(!a.equals(sender))a.receive("Hold position - emergency in progress");
        }
        ((LinkedList<Aircraft>)landingQueue).addFirst(sender);
        }   else{

        for(Aircraft a:allAircraft){
        if(!a.equals(sender))a.receive(msg);
        }
        }
        }
        public boolean requestRunway(Aircraft a){
        landingQueue.add(a);
        System.out.println(a.getId()+" requested to land.");
        return false;
        }
        public void registerAircraft(Aircraft a){
            allAircraft.add(a);
        }
        public void tick(){
        if(!landingQueue.isEmpty()){
        Aircraft next=landingQueue.poll();
        System.out.println(next.getId()+" is landing now.");
        }   else if(!takeOffQueue.isEmpty()){
        Aircraft next=takeOffQueue.poll();
        System.out.println(next.getId()+" is taking off now.");
        }   else{
            System.out.println("Nothing happening. Runway is clear.");
        }
        }
        }