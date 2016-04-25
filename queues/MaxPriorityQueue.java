package queues;

import sorting.Heapsort;

public class MaxPriorityQueue extends Heapsort {

    public MaxPriorityQueue() {
        System.out.println("Use other constructor");
    }

    public MaxPriorityQueue(int [] A) {
        numbers = A;
        buildMaxHeap();
    }

    public int heapMaximum() {
        return numbers[0];
    }

    public int heapExtractMax() {
        if (heapSize < 0) {
            System.out.println("Error: heap underflow");
            return -1;
        }
        int max = numbers[0];
        numbers [0] = numbers[heapSize-1];
        heapSize -= 1;
        maxHeapify(0);
        return max;
    }

    private void heapIncreaseKey(int i, int key) {
        if (key < numbers[i]) {
            System.out.println("Error: new key is smaller than current key");
        }
        numbers[i] = key;
        while (i > 0 && numbers[parent(i)] < numbers[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    private void maxHeapInsert(int key) {
        //TODO: make max heap insert.
    }
}
