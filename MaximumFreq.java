package com.IntesabArray;

import java.util.*;

class MaximumFrequency{
    public void showFrequency(int arr[]){
        HashMap<Integer , Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i=0;i< arr.length;i++){
            if(hashMap.get(arr[i]) == null){
                hashMap.put(arr[i] , 0);
            }
            hashMap.put(arr[i] , hashMap.get(arr[i])+1);
        }

        Iterator iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry pair = (Map.Entry)iterator.next();
//            iterator.next();
            if((int)pair.getValue()>= arr.length/2){
//            if((int)iterator.next() >=arr.length/2)
//            {
//                System.out.println(iterator.next());
                System.out.println("Element with the maximum frequency which is "+(int)pair.getValue()+" in the given array is :: "+(int)pair.getKey());
            }
            iterator.remove();
        }
    }
}

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Enter the number of elements to be inserted \n");
        int n = scanner.nextInt();
        System.out.println("\n Number of elements are ::  "+n);
        int arr[] = new int[n];
        System.out.println("\n Enter array elements :: \n");
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("\n Array elements are :: \n");
        System.out.println(Arrays.toString(arr));

        MaximumFrequency maximumFrequency = new MaximumFrequency();

        maximumFrequency.showFrequency(arr);

    }
}
