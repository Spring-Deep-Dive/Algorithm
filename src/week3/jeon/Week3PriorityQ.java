public class Week3PriorityQ {
    public static void main(String[] args) {
    }

    public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        TreeSet<Integer> maxSet = new TreeSet<>();

        for (String operation : operations) {
            if (operation.equals("D 1") && ! maxSet.isEmpty()) { // remove max
                int max = maxSet.last();
                queue.remove(max);
                maxSet.remove(max);
            } else if (operation.equals("D -1") && ! queue.isEmpty()) { // remove min
                int min = queue.poll();
                maxSet.remove(min);
            } else if (operation.contains("I")) {
                int num = getNumber(operation);
                queue.add(num);
                maxSet.add(num);
            }
        }

        if (! queue.isEmpty()) {
            answer[0] = maxSet.last();
            answer[1] = queue.peek();
        }

        return answer;
    }

    private static int getNumber(String input) {
        String number = input.substring(input.indexOf(" ") + 1);
        return Integer.parseInt(number);
    }
}
