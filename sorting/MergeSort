package sorting;

public class MergeSort {


    public  int[] helper;
    public int[] numbers;

    //merge sort is Theta(nlog(n))
    //note that it only works for numbers less than 1000
    public void sort(int[] A) {

        this.numbers = A;
        this.helper = new int [A.length];

        mergeSort(0, A.length-1);

        for (int i = 0; i < A.length; i++) {
            A[i] = helper[i];
        }


    }

    private  void mergeSort (int p, int r) {

        if (p < r) {
            int q = (int) Math.floor( ((double)(p + r)) / 2.0 );

            mergeSort(p, q);
            mergeSort(q + 1, r);
            merge(p, q, r);
        }
    }

    //merge Step
    private  void merge (int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            L[i] =  numbers[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = numbers[q + j + 1];
        }

        //sentinel values
        L[n1] = 1000;
        R[n2] = 1000;

        int i = 0;
        int j = 0;

        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                helper[k] = L[i];
                i++;
            }
            else {
                helper[k] = R[j];
                j++;
            }
        }

        for (int k = p; k <=r; k++) {
            numbers[k] = helper[k];
        }

    }

    private static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
        System.out.print(" | ");
    }
}
