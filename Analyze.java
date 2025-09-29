import java.util.ArrayList;
import java.util.List;

public class Analyze {

    // Step 1: transform_array
    public static List<Integer> transformArray(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int x : arr) {
            if (x % 3 == 0) {
                // Python // division = floorDiv
                result.add(Math.floorDiv(x, 3));
            } else if (x % 2 == 0) {
                result.add(x * 2);
            } else {
                result.add(x + 5);
            }
        }
        return result;
    }

    // Step 2: process_result
    public static int processResult(List<Integer> arr) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            if (i % 2 == 0) {
                total += val;
            } else {
                total -= val;
            }
        }
        return total;
    }

    // Step 3: final_operation (simulate Python bin()[2:])
    public static int finalOperation(int num) {
        String binStr = "0b" + Integer.toBinaryString(Math.abs(num)); // add fake prefix

        if (num < 0) {
            binStr = "-" + binStr; // Python puts '-' in front
        }

        // Python does bin(num)[2:], so we slice from index 2
        String sliced = binStr.substring(2);

        return sliced.length();
    }

    public static void main(String[] args) {
        int[] input = {9, 8, 7, 6, 5, 4};

        List<Integer> step1 = transformArray(input);
        int step2 = processResult(step1);
        int finalResult = finalOperation(step2);

        System.out.println("step1 = " + step1);       // [3, 16, 12, 2, 10, 8]
        System.out.println("step2 = " + step2);       // -1
        System.out.println("final = " + finalResult); // 2 (matches Python!)
    }
}
