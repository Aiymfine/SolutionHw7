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
