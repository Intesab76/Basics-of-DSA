package com.LinkedList;

import org.w3c.dom.Node;

import java.util.*;

class LinkedList{
    LinkedList next;
    int data;
    public static class InnerLinked{
        LinkedList start;
        public void insert(int entry){
            LinkedList node = new LinkedList();
            node.data = entry;
            if(start == null){
                start = node;
            }
            else{
                LinkedList tempNode = start;
                while(tempNode.next !=null){
                    tempNode = tempNode.next;
                }   
                tempNode.next = node;
            }
        }
        public void showLinkedList(){
            LinkedList traverse = start;
            while(traverse.next!=null){
                System.out.print(traverse.data+"->");
                traverse = traverse.next;
            }
            System.out.print(traverse.data);
        }
        public void insertAtBeg(int data){
            LinkedList node = new LinkedList();
            node.data = data;
            node.next = start;
            start = node;
        }
        public void insertArbitrarily(int data , int loc){
            LinkedList node = new LinkedList();
            node.data = data;
            if(loc ==0){
                insertAtBeg(data);
            }
            else {
                LinkedList travNode = start;
                int i = 0;
                while (i < (loc - 1)) {
                    travNode = travNode.next;
                    i++;
                }

            node.next = travNode.next;
            travNode.next = node;
            }
        }
        public void deleteElement(int loc){
            LinkedList traverse = start;
            LinkedList temp = null ;
            if(loc==0){
                start = start.next;
            }
            int i=0;
            //while(i<loc-2){
            while(i<loc-2){
                traverse = traverse.next;
                i++;
            }
            temp = traverse.next;
            traverse.next = temp.next;
        }

    }

}
class Main{
    public static void main(String[] args) {
        LinkedList.InnerLinked obj = new LinkedList.InnerLinked();
//        obj.insert(2);
//        obj.insert(3);
//        obj.insert(8);
//        obj.insert(78);
//        obj.insert(20);
//        obj.insertAtBeg(1);
//        obj.insertArbitrarily(13,3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements in the linked list :: \n");
        for(int i=0;i<7;i++) {
            obj.insert(scanner.nextInt());
        }
//        System.out.println("\n---------------------------------------\n");
//        System.out.println("Enter an element to be inserted at the beginning ::\n");
//        obj.insertAtBeg(scanner.nextInt());
//        System.out.println("\n------------------------------------\n");
//        System.out.println("Enter an element at the desired location :: \n");
//        obj.insertArbitrarily(scanner.nextInt() , scanner.nextInt());
//        System.out.println("\n---- Linked list representation is :: \n");
       // obj.showLinkedList();
        obj.deleteElement(5);
        obj.showLinkedList();

        }

    }