package Homework1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[] {2, 5, 1, 8, 4, 3, 7, 9, 8, 0, 6};
        printArray(array);
        int arrayLength = array.length;
        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heapify(array, arrayLength, i);

        for (int i = arrayLength - 1; i >= 0 ; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);

        }

        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;

        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;

        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
        }
    }

//    private static void heapify(int arr[], int n, int i)
//    {
//        int largest = i;
//        int l = 2*i + 1;
//        int r = 2*i + 2;
//
//
//        if (l < n && arr[l] > arr[largest])
//            largest = l;
//
//
//        if (r < n && arr[r] > arr[largest])
//            largest = r;
//
//        if (largest != i)
//        {
//            int swap = arr[i];
//            arr[i] = arr[largest];
//            arr[largest] = swap;
//
//            heapify(arr, n, largest);
//        }
//    }
}