// Arrays : Collections of similar type of data.

// Types of Arrays:

//  1). Single Dimensional
// // 2). Multi Dimensional   similar to matrix.



// 1). Single Dimensional Array:

import java.util.Scanner;

public class seventh {


    public static void main(String[] args) {


        // int a[] =  {12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78,12,13,23,56,78};

        // for(int i=0; i<a.length; i++){
        //     System.out.println(a[i]);
        // }



        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Array Elements : ");
        // int a[] = new int[5];
      


        // // Input Loop
        // for(int r=0; r<a.length; r++){

        //     a[r] = sc.nextInt();  // 12  13   14   15   16
        // }

        // // Output Loop


        // System.out.println("Array Elements are : ");
        // for(int r=0; r<a.length; r++){
        //     System.out.println(a[r]);// 12   13   14  15   16
        // }





        // Reverse Array 

        // int []a = {1,2,3,4};

        // System.out.println(a[0]);

        // System.out.println("Reverse Array Elements");
        // for(int i=a.length-1; i>=0; i--){

        //     System.out.print(a[i]+" ");
        // }




        // Reverse Array

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Elements : " );

        int a[] = new int[5];

        // Input Loop

        for(int r=0; r<a.length; r++){
            a[r] = sc.nextInt();  // 12  13   14   15   16
        }


        // Output Loop

        System.out.println("Reverse Array Elements : ");
        for(int r=a.length-1; r>=0; r--){
            System.out.print(a[r]+" ");
        }


        








        
        

    }
    
}
