
public class RotationPointUsingBinarySearch {
    public static int rotationPoint(int[]arr,int left,int right) {
        if(left<right) {
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[right]) {
                left=mid+1;
            }else {
                right=mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[]arr= {4, 5, 6, 7, 0, 1, 2};
        int ans=rotationPoint(arr, 0, arr.length-1);
        System.out.println("Rotation POint: "+ans);
    }
}