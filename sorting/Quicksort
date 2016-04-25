package sorting;

public class Quicksort {

    //average and best case (expected) Theta(nlg(n)).  worst case Theta(n^2)

    public static void sort(int[] A) {

        quicksort(A, 0, A.length-1);

    }

    private static void quicksort (int[] A, int p, int r) {

        if (p < r) {
            int q = partition(A, p, r);
            quicksort(A, p, q - 1);
            quicksort(A, q + 1, r);

        }
    }

    //partition algorithm
    private static int partition (int []A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (A[j] <= x) {
                i += 1;
                swap(A, i, j);
            }
        }
        swap(A, i+1, r);
        return i + 1;
    }

    private static void swap(int[] A, int i, int k) {
        int temp = A[i];
        A[i] = A[k];
        A[k] = temp;
    }

    private static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
        System.out.print(" | ");
    }

}
