import java.util.*;

class Node {
    Node next;
    int data;

    public static class InnerNode {
        Node start;

        public void insertNode(int entry) {

            Node newNode = new Node();
            newNode.data = entry;
            if (start == null) {
                start = newNode;
            } else {
                Node temp = start;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        public void insertAt(int data, int loc) {
            Node newNode = new Node();
            newNode.data = data;
            if (start == null) {
                insertNode(data);
            } else {
                int i = 0;
                Node temp = start;
                while (i < (loc - 1)) {

                    newNode = temp.next;

                }
            }
        }

        public void searchNode(int ele) {
            Node temp = start;
            int flag = 0;
            while (temp.next != null) {
                if (temp.data == ele) {
                    flag = 1;
                }
                temp = temp.next;
            }
            if (flag != 1)
                System.out.println("Node not present in the list :: ");
            else
                System.out.println("\n Node present :: ");
        }

        public void insertAtBeg(int data) {

            Node newNode = new Node();
            newNode.data = data;
            newNode.next = start;
            start = newNode;
        }

        public void insertArbitrarily(int data, int pos) {

            Node newNode = new Node();
            Node ptr = start;
            newNode.data = data;
            if (pos == 0) {
                insertAtBeg(data);
            } else {
                int i = 0;
                while (i < (pos - 1)) {
                    ptr = ptr.next;
                    i++;
                }
                newNode.next = ptr.next;
                ptr.next = newNode;
            }

        }

        public void showNumber() {
            Node ptr = start;
            int count = 0;
            while (ptr.next != null) {
                count++;
                ptr = ptr.next;
            }
            count = count + 1; // Last node which is having link part as null ...
            System.out.println("\nNumber of nodes in the given list is :: " + count);
        }

        public void showSum() {
            Node temp = start;
            int sum = 0;
            while (temp.next != null) {
                sum += temp.data;
                temp = temp.next;
            }
            sum += temp.data;
            System.out.println("\n Sum of the node elements in the given list is :: " + sum);
        }

        public void deleteNode(int pos) {

            Node ptr = start;

            if (pos == 1) { // Base Condition ...
                start = ptr.next;
            }

            else {
                Node currNode;
                int i = 1;
                while (i < (pos - 1)) {
                    ptr = ptr.next;
                    i++;
                }
                currNode = ptr.next;
                ptr.next = currNode.next;

            }
            System.out.println("\n Node has been deleted ::\n\n After deletion, Updated List is ::\n");
            showNodes();
        }

        public void showMidVal() {
            // Node temp = start;
            // int counter = 0;
            // while (temp.next != null) {

            // counter = counter + 1;
            // temp = temp.next;
            // }
            // System.out.println("\n Length of the List is :: " + counter);

            // System.out.println("\n\n Mid element in the given list is ::\n\n");
            // while (temp.next != null) {
            // if ((counter % 2) == 1) {
            // temp = temp.next;
            // }
            // }
            // System.out.println(temp.data);

            Node slow = start;
            Node fast = start;
            if (start != null) {
                while (fast != null && fast.next != null) {
                    fast = fast.next.next;
                    slow = slow.next;
                }
                System.out.println("\n Mid element in the given list is :: \n" + slow.data);
            }
        }

        public void showNodes() {
            Node temp = start;
            while (temp.next != null) {
                System.out.print(temp.data + " - >");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }

}

class Main {
    public static void main(String Arg[]) {
        Node.InnerNode obj = new Node.InnerNode();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Nodes ::\n");
        for (int i = 0; i < 7; i++) {
            obj.insertNode(scanner.nextInt());
        }

        System.out.println("\n List is :: \n");
        obj.showNodes();

        // System.out.println("\nEnter the nodes to be inserted at the begining ::\n");

        // (int i = 0; i < 7; i++) {
        // obj.insertAtBeg(scanner.nextInt());
        // }

        // scanner.close();

        // System.out.println("\n List is ::\n");
        // obj.showNodes();

        // System.out.println("\n Enter the node to be checked whether present or not ::
        // \n");
        // obj.searchNode(scanner.nextInt());
        System.out.println("\n Insert a node :: \n");
        // System.out.println(scanner.nextInt());
        System.out.println("\n Enter the position where it is to be inserted :: \n");
        // System.out.println(scanner.nextInt());
        obj.insertArbitrarily(scanner.nextInt(), scanner.nextInt());

        System.out.println("\n List after inserting the node :: \n");
        obj.showNodes();

        obj.showNumber();

        obj.showSum();

        System.out.println("\n Enter the position from where the node has to be deleted :: \n");
        int loc = scanner.nextInt();

        scanner.close();

        System.out.println("\nPosition is :: " + loc);
        obj.deleteNode(loc);

        obj.showMidVal();

    }
}