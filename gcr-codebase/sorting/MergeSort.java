
public class MergeSort {
    public static int[] sorting(int[]arr,int left,int right) {
        if(left<right) {
            int mid=left+(right-left)/2;
            sorting(arr,left,mid);
            sorting(arr,mid+1,right);
            merge(arr,left,right,mid);
        }
        return arr;
    }
    public static int[] merge(int[]arr,int left, int right,int mid) {
        int n1=mid-left+1;
        int n2=right-mid;

        int[]leftArr=new int[n1];
        int[]rightArr=new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid+1, rightArr, 0, n2);

        int i=0,j=0,k=left;
        while(i<n1 && j<n2) {
            if(leftArr[i]<=rightArr[j]) {
                arr[k]=leftArr[i];
                k++;
                i++;
            }else {
                arr[k]=rightArr[j];
                k++;
                j++;
            }
        }
        while(i<n1) {
            arr[k]=leftArr[i];
            k++;
            i++;
        }
        while(j<n2) {
            arr[k]=rightArr[j];
            k++;
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr= {45,78,43,1,64,97,3,45,78,36,48,5,6};
        int[]ans=sorting(arr,0,arr.length-1);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+", ");
        }
    }
}