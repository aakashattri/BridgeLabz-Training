
public class InsertionSort{
    public static int[] sorting(int[]arr){
        for(int i=1;i<arr.length;i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
    public static void main(String[] args){
        int[]arr= {12,45,8,74,69,6,5};
        int[]ans=sorting(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+", ");
        }
    }
}