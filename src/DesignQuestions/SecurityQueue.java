package DesignQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ImmutableWaitingQueues implements WaitingQueues {
    private final List<List<String>> queues;

    public ImmutableWaitingQueues(List<List<String>> queues) {
        this.queues = queues;
    }

    @Override
    public WaitingQueues add(String person) {
        // Step 1: Find index of queue with the smallest size
        int targetIndex = IntStream.range(0, queues.size())
                .reduce((i, j) -> queues.get(i).size() <= queues.get(j).size() ? i : j)
                .orElse(0);

        // Step 2: Create new queues with person added to the target queue
        List<List<String>> newQueues = IntStream.range(0, queues.size())
                .mapToObj(i -> {
                    if (i == targetIndex) {
                        // Create a new list with person added (immutably)
                        List<String> newQueue = new ArrayList<>(queues.get(i));
                        newQueue.add(person);
                        return Collections.unmodifiableList(newQueue);
                    } else {
                        return queues.get(i); // reuse existing reference
                    }
                })
                .collect(Collectors.toUnmodifiableList());

        return new ImmutableWaitingQueues(newQueues);
    }

    @Override
    public String toString() {
        // Optional: You can build a vertical visual representation like the example
        return queues.toString(); // Placeholder
    }

    public List<List<String>> getQueues() {
        return queues;
    }
}
