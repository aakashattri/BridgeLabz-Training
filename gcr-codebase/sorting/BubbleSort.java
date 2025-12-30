
public class BubbleSort {
    public static int[] sorting(int[]arr) {
        boolean swapped;
        for(int i=0;i<arr.length;i++) {
            swapped=false;
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)break;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[]arr= {12,45,8,74,69,6,5};
        int[]ans=sorting(arr);
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i]+", ");
        }
    }
}