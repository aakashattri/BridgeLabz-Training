
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;

public class ArrayVsHashSetVsTreeSet{
    public static void main(String[] args){
        int[] datasetSizes={1000,100000,1000000};
        for(int size:datasetSizes){
            System.out.println("Dataset Size: "+size);
            compareSearchTimes(size);
            System.out.println();
        }
    }

    public static void compareSearchTimes(int size){
        int[] array=generateRandomArray(size);
        HashSet<Integer> hashSet=new HashSet<>();
        TreeSet<Integer> treeSet=new TreeSet<>();

        for(int num:array){
            hashSet.add(num);
            treeSet.add(num);
        }

        int target=array[new Random().nextInt(size)];

        long startArray=System.nanoTime();
        arraySearch(array,target);
        long endArray=System.nanoTime();
        long arrayTime=endArray-startArray;

        long startHashSet=System.nanoTime();
        hashSetSearch(hashSet,target);
        long endHashSet=System.nanoTime();
        long hashSetTime=endHashSet-startHashSet;

        long startTreeSet=System.nanoTime();
        treeSetSearch(treeSet,target);
        long endTreeSet=System.nanoTime();
        long treeSetTime=endTreeSet-startTreeSet;

        System.out.println("Array Search took: "+arrayTime/1000000.0+" ms");
        System.out.println("HashSet Search took: "+hashSetTime/1000000.0+" ms");
        System.out.println("TreeSet Search took: "+treeSetTime/1000000.0+" ms");
    }

    public static boolean arraySearch(int[] array,int target){
        for(int num:array){
            if(num==target){
                return true;
            }
        }
        return false;
    }

    public static boolean hashSetSearch(HashSet<Integer> hashSet,int target){
        return hashSet.contains(target);
    }

    public static boolean treeSetSearch(TreeSet<Integer> treeSet,int target){
        return treeSet.contains(target);
    }

    public static int[] generateRandomArray(int size){
        Random rand=new Random();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            int randNum;
            do{
                randNum=rand.nextInt(size);
            }while(contains(array,randNum,i));
            array[i]=randNum;
        }
        return array;
    }

    private static boolean contains(int[] array,int num,int end){
        for(int i=0;i<end;i++){
            if(array[i]==num){
                return true;
            }
        }
        return false;
    }
}
