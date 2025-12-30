
import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n=arr.length;
        for (int i=0; i<n-1;i++) {
            int minIndex=i;
            for (int j=i+1;j<n;j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int examScores[] ={85, 60, 95, 70, 80};
        System.out.println("Original Scores: " + Arrays.toString(examScores));
        selectionSort(examScores);
        System.out.println("Sorted Scores: " + Arrays.toString(examScores));
    }
}