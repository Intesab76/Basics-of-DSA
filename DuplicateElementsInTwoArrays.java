package com.IntesabArray;

import java.util.*;

class DuplicateElementsInTwoArrays {
    public void duplicateElement(int arr1[] , int arr2[]){

        int counter = 0;
        int[] temp= new int[10];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    counter++;
                    temp[k] = arr1[i];
                    k++;
                }
            }
        }
        System.out.println("\n Total number of common elements in the two arrays are :: "+counter);
        System.out.println("\n Array of common elements are :: "+Arrays.toString(temp));

    }
}

class MainDuplicate{
    public static void main(String[] args) {
        DuplicateElementsInTwoArrays duplicateElementsInTwoArrays = new DuplicateElementsInTwoArrays();
        Scanner scanner = new Scanner(System.in);
        int n , m;
        System.out.println("\n Enter the number of elements to be inserted in two different arrays\n");
        n = scanner.nextInt();
        m = scanner.nextInt();
        System.out.println("\n Elements to be inserted in first array is :: "+n);
        System.out.println("\n Elements to be inserted in second array is :: "+m);
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("\n Enter the elements in the first array ::\n");
        for(int i=0;i<n;i++){
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Elements in the first array are :: "+Arrays.toString(arr1));
        System.out.println("\n Enter the elements in the second array ::\n");
        for(int i=0;i<m;i++){
            arr2[i] = scanner.nextInt();
        }
        System.out.println("Elements in the second array are :: "+Arrays.toString(arr2));

        duplicateElementsInTwoArrays.duplicateElement(arr1 , arr2);

    }
}
