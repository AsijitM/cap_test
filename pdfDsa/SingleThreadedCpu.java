package pdfDsa;
import java.util.*;
public class SingleThreadedCpu {
	public int[] exclusiveTime(int n, List<String> logs) {
        int[] exclusiveTimes = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;
        
        for (String log : logs) {
            String[] parts = log.split(":");
            int functionId = Integer.parseInt(parts[0]);
            String type = parts[1];
            int timestamp = Integer.parseInt(parts[2]);
            
            if (type.equals("start")) {
                if (!stack.isEmpty()) {
                    exclusiveTimes[stack.peek()] += timestamp - prevTime;
                }
                stack.push(functionId);
                prevTime = timestamp;
            } else {  // type.equals("end")
                exclusiveTimes[stack.pop()] += timestamp - prevTime + 1;
                prevTime = timestamp + 1;
            }
        }
        return exclusiveTimes;
    }
 
    public static void main(String[] args) {
        int n = 3;
        List<String> logs = new ArrayList<>();
        
        logs.add("0:start:0");
        logs.add("1:start:2");
        logs.add("2:start:3");
        logs.add("2:end:4");
        logs.add("1:end:5");
        logs.add("0:end:6");
 
        ExclusiveTime exclusiveTime = new ExclusiveTime();
        int[] result = exclusiveTime.exclusiveTime(n, logs);
        
        System.out.println(Arrays.toString(result)); // Output: [3, 2, 3]
    }

}
