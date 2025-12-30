
import java.util.*;

public class ZeroSumSubArrays{
    public static List<int[]>findZeroSumSubarrays(int[] arr){
        List<int[]>result=new ArrayList<>();
        Map<Integer, List<Integer>> sumMap=new HashMap<>();
        int sum=0;
        sumMap.put(0,new ArrayList<>());
        sumMap.get(0).add(-1);
        for (int i=0; i<arr.length;i++){
            sum+=arr[i];
            if(sumMap.containsKey(sum)){
                for(int startIndex:sumMap.get(sum)){
                    result.add(new int[]{startIndex + 1,i});
                }
            }
            sumMap.putIfAbsent(sum,new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        return result;
    }
    public static void main(String[] args){
        int[] arr={4, 2, -3, -1, 0, 4};
        List<int[]>subarrays=findZeroSumSubarrays(arr);
        if (subarrays.isEmpty()){
            System.out.println("No zero-sum subarrays found.");
        } else {
            System.out.println("Zero-sum subarrays found:");
            for (int[] subarray:subarrays){
                System.out.println("Start: "+subarray[0]+", End: "+subarray[1]);
            }
        }
    }
}