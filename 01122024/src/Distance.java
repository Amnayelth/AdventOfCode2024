public class Distance {
    // get the difference between two numbers A[1] and B[1], A[2] and B[2], ..., A[n] and B[n]
    // and return the difference in a new array
    public static int[] distanceOf(int[] A, int[] B) {
        int[] C = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            switch (Integer.compare(A[i], B[i])) {
                case 1 -> C[i] = A[i] - B[i];
                case -1 -> C[i] = B[i] - A[i];
                case 0 -> C[i] = 0;
            }
        }
        return C;
    }

    // get the sum of the differences of two arrays
    public static int sumOf(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
}
