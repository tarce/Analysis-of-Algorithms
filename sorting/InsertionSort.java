package sorting;

public class InsertionSort {

    //insertion sort is Theta(n^2)
    public static void sort (int[] A) {
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while ( (i >= 0) && (A[i] > key) ) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
    }

    private static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
        System.out.print(" | ");
    }

}
