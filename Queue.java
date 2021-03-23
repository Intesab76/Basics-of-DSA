package com.LinkedList;

import java.util.Arrays;
import java.util.Scanner;

class Queue {
    static int[] queArr = new int[7];
    static int top=0;
    public static class InnerQueue{
        public void insertInQueue(int data){
            if(top>= queArr.length){
                System.out.println("\n Overflown !!\n");
            }
            else{
                queArr[top] = data;
                top++;
            }
        }
        public void showElements(){
            int[] data = new int[5];
            int j=0;
            for(int i=0;i<top-1;i++) {
                data[j] = queArr[i];
                j++;
            }
            System.out.println("\n Queue is :: "+ Arrays.toString(data));
        }
        public void deleteElement(){
            int j=0;
            int data = queArr[j];
            j++;
            System.out.println("\n Element deleted is :: "+data);

        }
    }
}
class MainCall{
    public static void main(String[] args) {
        Queue.InnerQueue qi = new Queue.InnerQueue();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter elements :: \n");
        for(int i=0;i<6;i++) {
            qi.insertInQueue(scanner.nextInt());
        }
        System.out.println("\n Showing queue elements :: ");
        qi.showElements();
        System.out.println("\n Deleting the element from the queue :: ");
        qi.deleteElement();
        System.out.println("\n After deleting, the elements in the queue is/are ::\n");
        qi.showElements();
        }
}
