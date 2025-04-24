Part 1:
In Part 1 of the project, I implemented the iterator pattern to allow the traversal of episodes within a season of a TV series.
The task required the creation of several iterators to navigate through episodes in different ways (normal, reverse, shuffle). 
However, I focused on the core iterator functionality and didnt implement all the extra iterators as they were not necessary for the basic simulation as i thought.

1. Episode Class: Represents individual episodes of a TV show, storing details like title and runtime.
2. Season Class: Contains a list of episodes and provides functionality to add episodes.
3. SeasonIterator: This iterator allows traversal of the episodes in normal order.
4. BingeIterator: This iterator allows you to traverse all episodes from multiple seasons without manual intervention.

I skipped implementing the ReverseSeasonIterator and ShuffleSeasonIterator because 
they were not required to meet the basic requirements of the task.
The focus was on demonstrating the core Iterator Pattern using BingeIterator to traverse through seasons and episodes.
Screenshot of output:
![image](https://github.com/user-attachments/assets/40a85f93-0849-4087-8f1a-4d05e7ae0b39)



Part 2:
1. ControlTower: This class is the mediator, managing aircraft requests, landing, and takeoff queues.
2. Aircraft Classes: The project includes different types of aircraft:
   - PassengerPlane
   - CargoPlane
   - Helicopter
3. Emergency Handling: When an aircraft sends a MAYDAY message, the control tower clears the runway for immediate landing.


- Aircraft send requests to land or take off, which are processed by the ControlTower.
- In case of an emergency, the aircraft sending a MAYDAY message gets immediate priority and lands first.
- The control tower manages the runway in a FIFO manner, but handles emergencies as the highest priority.
  ![image](https://github.com/user-attachments/assets/6199bebd-3536-445c-a976-ddd69c9e3eba)
  uml: ![uml](https://github.com/user-attachments/assets/6cee52ce-325b-4cb9-be6f-b1b19cb8e644)


  



