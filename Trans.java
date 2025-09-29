public class Trans {
    public static void main(String[] args) {
        int[] arr = {16, 7, 9, 15, 4, 11, 12};
        int sum = 0;
        for (int num : arr) {
            int transformed = transform(num);
            sum += transformed;
        }
        System.out.println("Sum of transformed numbers: " + sum);
    }

    public static int transform(int num) {
        if (isPrime(num)) {
            return num * 2;
        } else if (isPerfectSquare(num)) {
            return num / (int)Math.sqrt(num);
        } else if (num % 3 == 0) {
            return num + 10;
        } else {
            return num - 5;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int)Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}