package sorting;

public class Heapsort {

    protected int heapSize;
    protected int [] numbers;

    public void sort(int [] A) {
        this.numbers = A;
        buildMaxHeap();
        for (int i = A.length - 1; i >= 1; i--) {
            swap(0,i);
            heapSize -= 1;
            maxHeapify(0);
        }
    }

    protected int parent(int i) {
        return (int)Math.floor( ((double)(i - 1)) / 2.0 );
    }

    private int left (int i) {
        return 2 * i + 1;
    }

    private int right (int i) {
        return 2 * i + 2;
    }

    protected void buildMaxHeap() {
        heapSize = numbers.length;
        int i = (int) Math.floor( ((double)(numbers.length+1)) / 2.0);
        for (; i >= 0 ; i--) {
            maxHeapify(i);
        }
    }

    protected void maxHeapify (int i) {
        int largest = -1;
        int l = left(i);
        int r = right(i);

        if (l < heapSize && numbers[l] > numbers[i]) {
            largest = l;
        }
        else {
            largest = i;
        }
        if (r < heapSize && numbers[r] > numbers[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(i, largest);
            maxHeapify(largest);
        }
    }

    protected void swap(int i, int k) {
        int temp = numbers [i];
        numbers [i] = numbers[k];
        numbers [k] = temp;
    }

}
