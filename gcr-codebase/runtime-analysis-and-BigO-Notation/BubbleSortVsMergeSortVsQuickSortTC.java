import java.util.Arrays;
import java.util.Random;

// ---------------- Bubble Sort ----------------
class BubbleSorting {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}

// ---------------- Merge Sort ----------------
class MergeSorting {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}

// ---------------- Quick Sort ----------------
class QuickSorting {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

// ---------------- Data Generator ----------------
class DataGenerator {
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(100000);

        return arr;
    }
}

// ---------------- MAIN CLASS ----------------
public class BubbleSortVsMergeSortVsQuickSortTC {

    public static void main(String[] args) {

        int[] datasetSizes = {1000, 10000, 100000};

        for (int size : datasetSizes) {

            int[] dataset1 = DataGenerator.generateRandomArray(size);
            int[] dataset2 = Arrays.copyOf(dataset1, dataset1.length);
            int[] dataset3 = Arrays.copyOf(dataset1, dataset1.length);

            System.out.println("\nDataset Size: " + size);

            // Bubble Sort
            if (size <= 10000) {
                long start = System.nanoTime();
                BubbleSorting.bubbleSort(dataset1);
                long end = System.nanoTime();
                System.out.printf("Bubble Sort: %.3f ms%n", (end - start) / 1e6);
            } else {
                System.out.println("Bubble Sort: Skipped (Too Slow)");
            }

            // Merge Sort
            long startMerge = System.nanoTime();
            MergeSorting.mergeSort(dataset2, 0, dataset2.length - 1);
            long endMerge = System.nanoTime();
            System.out.printf("Merge Sort: %.3f ms%n", (endMerge - startMerge) / 1e6);

            // Quick Sort
            long startQuick = System.nanoTime();
            QuickSorting.quickSort(dataset3, 0, dataset3.length - 1);
            long endQuick = System.nanoTime();
            System.out.printf("Quick Sort: %.3f ms%n", (endQuick - startQuick) / 1e6);

            System.out.println("------------------------------------");
        }
    }
}
