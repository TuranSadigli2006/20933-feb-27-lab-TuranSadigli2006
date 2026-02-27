class MathDemo {

    // a. Returns the minimum of two integers
    static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // b. Returns the maximum of two integers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // c. Returns the sum of array elements
    static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    // d. Returns the mean (average) of array elements
    static float mean(int[] args) {
        if (args.length == 0)
            return 0;
        return (float) sum(args) / args.length;
    }

    // e. Returns factorial of a number
    static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Number must be non-negative");
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}