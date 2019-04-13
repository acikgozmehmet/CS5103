package SortAlgorithm;

import java.util.Arrays;

public class SelectionSort {

    public int [] selectionSort(int [] A){

        int n = A.length;
        int smallest;

        for (int j = 0; j < n-1; j++){
            smallest = j;

            for (int i = j+1; i < n; i++){
                if (A[i] < smallest)
                    smallest = i;
            }

            A[j] = A[smallest];
        }


        return A;
    }

    public static void swap(int [] A, int a, int b){
        int temp = A[a];
        A[a] = A[b];
        A[b]= temp;
    }

    public  static void main(String [] args){
        int a = 5;
        int b = 3;
        System.out.println("a = " + a) ;
        System.out.println("b = " + b) ;



        System.out.println("a = " + a) ;
        System.out.println("b = " + b) ;

        int [] A = {1,2,3};
        System.out.println("A = " + Arrays.toString(A));

        swap (A,0,2);

        System.out.println("A = " + Arrays.toString(A));

    }
}
