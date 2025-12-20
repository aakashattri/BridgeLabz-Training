import java.util.*;
public class ArrayImplimentation2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        int rows = sc.nextInt() ;
        int columns = sc.nextInt() ;
        
        int[][] m = new int[rows][columns] ; 
        
        int[] arr = new int[rows * columns] ; 
        int indx = 0  ; 
        for(int i = 0 ;  i <  rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                
                System.out.print("Enter the number in row : " +  i  + "  and column : "+ j ) ; 
                m[i][j] = sc.nextInt() ; 
                arr[indx] = m[i][j] ;
                indx++;
            }
        }
        
        System.out.print(" 1D Array is -> ") ; 
        for(int v : arr){
            System.out.print(v+ " ") ; 
        }
        System.out.println() ; 
    }
}
