Waiting queues
When proceeding to the security measures in a crowded airport, you will have to stay in one of the waiting lines to get your belongings inspected

This is how waiting queues can look like :

                                              This
                                              one
                                              is
                                              full
                                             _______          
                           _______           |  X  |          
                           |  X  |           |  X  |          
Some                      |  X  |           |  X  |          
room    _______           |  X  |           |  X  |          
free    |  X  |           |  X  |           |  X  |          
_______  |  X  |           |  X  |           |  X  |          
|  X  |  |  X  |  _______  |  X  |   empty   |  X  |          
|  X  |  |  X  |  |  X  |  |  X  |   Queue   |  X  |  _______
|  X  |  |  X  |  |  X  |  |  X  |  _______  |  X  |  |  X  |
The goal is to implement the WaitingQueues.add operation, which will try to add someone to the least occupied waiting line (or waiting queue).

//Use reduce operation to find the smallest queue

To help you in this task, we provide you a Java interface and the definition of a task. It is up to you to add more methods to those implementation but you are not allowed to remove or redefine the existing methods.

If you have time to, you can also implement the operation WaitingQueues.toString which can display the above drawing.

As much as possible, please try to implement an immutable implementation. To help you achieve this, we recommend you to: * avoid access to List.add and List.remove methods * use .stream() operations
//After adding the element to smallest queue, return Collections.unmodifiableList(queue);

Here the contract definition:

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public interface WaitingQueues {

    List<WaitingQueue> getWaitingQueues();

    WaitingQueues add(WaitingQueue.Task task);

    List<Integer> sizes();

    class WaitingQueue {
        private final List<Task> tasksInProgress;

        public WaitingQueue(List<Task> tasksInProgress) {
            this.tasksInProgress = Collections.unmodifiableList(tasksInProgress);
        }

        public static class Task {
            private final UUID id;

            public Task(UUID id) {
                this.id = id;
            }

            public Task() {
                this(UUID.randomUUID());
            }

            public UUID getId() {
                return id;
            }
        }
    }


## Ways to create an immutable list in Java:
Collectios.unmodifiableList(List<T> list) - Returns an unmodifiable view of the specified list.
List.of(T... elements) - Creates an immutable list containing the specified elements.
List.copyOf(Collection<? extends T> coll) - Creates an immutable list containing the elements of the specified collection.
}