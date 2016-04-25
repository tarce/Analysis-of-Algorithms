package programs;

import sorting.*;
import queues.*;



public class Driver {

    public static void main(String[] args) {

        int [] arr1 = {5, 2, 4, 6, 1, 3, -1, 0};
        int [] arr2 = {1, 5, 6, 9, 2, 3, 8, 10};
        int [] arr3 = {2, 5, 3, 0, 2, 3, 0 ,3};

        printArray(arr3);
        //Insertion.sort(arr1);
        //MergeSort mergeSort = new MergeSort();
        //mergeSort.sort(arr1);
        //Heapsort heapSort = new Heapsort();
        //heapSort.sort(arr1);
        //MaxPriorityQueue mpq = new MaxPriorityQueue(arr2);
        //System.out.println(mpq.heapMaximum(arr1));
        //System.out.println(mpq.heapExtractMax());
        //System.out.println(mpq.heapExtractMax());
        //System.out.println(mpq.heapExtractMax());
        //Quicksort.sort(arr1);
        CountingSort countingSort = new CountingSort();
        countingSort.sort(arr3);
        printArray(arr3);


    }

    private static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

}
