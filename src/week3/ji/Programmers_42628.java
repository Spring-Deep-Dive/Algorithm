import java.util.*;

class Solution {

    private Queue<Integer> minQueue = new PriorityQueue<>();
    private Queue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());

    public int[] solution(String[] operations) {
        int[] answer = new int[2];

	for (int i = 0; i < operations.length; i++) {
            String[] pair = operations[i].split(" ");
	    Integer element;
	    switch (pair[0]) {
                case "I" -> {
		    element = Integer.parseInt(pair[1]);
		    minQueue.offer(element);
		    maxQueue.offer(element);
		}
		case "D" -> {
		    if (pair[1].equals("1")) {
		        element = maxQueue.poll();
			minQueue.remove(element);
		    } else {
			element = minQueue.poll();
			maxQueue.remove(element);
		    }
		}
	    }
	}
	Integer max = maxQueue.poll();
	Integer min = minQueue.poll();
	answer[0] = max != null ? max : 0;
	answer[1] = min != null ? min : 0;

	return answer;
    }
}
