package review;
//import java.util.*;
public class Class2 {

    public static void main(String[] args) {
        //int [] num   = new int [5];
        //int [] num2  = {1,2,3,4,5};

        //ideal declaration for array
        //int [] [] num3  = new int [3] [2];
        int[][] num4 = {{1, 2, 3}, {4, 5, 6}};
        printArray(num4);
    }
    public static void printArray(int[][] arr) {
        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr[col].length; row++) {
                System.out.print(arr[col][row]+" ");
            }
            System.out.println("");
            //System.out.println(" end of row");
            //System.out.println("end of col");
        }
        System.out.println("");
        System.out.println("hello");
    }
}

