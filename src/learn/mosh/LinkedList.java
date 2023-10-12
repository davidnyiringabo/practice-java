package learn.mosh;

public class LinkedList {
    public class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
    public Node first;
    public Node last;

    /**
     * To be learn now.
     *
     * addFirst *
     * AddLast
     * deleteFirst
     * deleteLast
     * contains
     * indexOf *
     */
    public void addLast(int item){
        Node node = new Node(item);
        if(first == null){
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }

    }
    public void addFirst(int item){
        var tmp = first;
        first = new Node(item);
        first.next = tmp;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if(current.value == item){
                System.out.println("The item is at index of " + index);
                return 1;
            }
            current = current.next;
            index++;
        }
        System.out.println("Item not found!");
        return -1;
    }


    public int contains(int item){
        var current = first;
        while (current != null){
            if(current.value == item){
                System.out.println("The item is in the linked list.");
                return 1;
            }
            current = current.next;
        }
        System.out.println("The item is not in the linked list.");
        return -1;
    }

    public static void main(String[] args){
        var linkedList = new LinkedList();
        linkedList.addLast(12);
        linkedList.addLast(23);
        linkedList.addLast(34);
        linkedList.addLast(45);
        linkedList.addLast(56);
        linkedList.addFirst(100);
        linkedList.addLast(12);

        linkedList.indexOf(45);

//        System.out.println(linkedList);
    }
    private boolean isEmpty(){
        return first == null;
    }

}
