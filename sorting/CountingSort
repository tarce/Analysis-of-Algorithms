package sorting;

public class CountingSort {

    int[] B;
    int[] C;

    public void sort(int[] A) {
        int k = findMax(A);
        B = new int[A.length];
        C = new int[k+1];

        for (int i = 0; i <= k; i++) {
            C[i] = 0;
        }

        for (int j = 0; j < A.length; j++) {
            C[A[j]] += 1;
        }

        for (int i = 1; i <= k; i++) {
            C[i] += C[i-1];
        }

        for (int j = A.length - 1; j >= 0; j--) {
            B[ C[A[j]] - 1 ] = A[j];
            C[A[j]] -= 1;
        }

        for (int i = 0; i < A.length; i++) {
            A[i] = B[i];
        }
    }

    private int findMax(int[] A) {
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    private void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
        System.out.print(" | ");
    }

}
