public class LinkedList{
    //Opgave 3
    Node first = null;

    LinkedList(int value){
        first = new Node(value);
    }
    
    //Opgave 4/6
    void add(int input){
        lastNode().next = new Node(input);
    }

    //Opgave 5
    void print(){
        Node lastNode = first;
        boolean done = false;
        while(!done){
            System.out.print("[" + lastNode.value + "] ");
            if(lastNode.next == null){
                done = true;
            }
            lastNode = lastNode.next;
        }
    }

    //Opgave 5
    void println(){
        Node lastNode = first;
        boolean done = false;
        while(!done){
            System.out.print("[" + lastNode.value + "] ");
            if(lastNode.next == null){
                done = true;
            }
            lastNode = lastNode.next;
        }
        System.out.println("");
    }

    //Opgave 7
    void addStart(int input){
        Node n = new Node(input);
        n.next = first;
        first = n;
    }

    //Opgave 8
    void insert(int input, int place){
        if(nodesNumber() < place){
            System.out.println("Error");
        }else{
            Node n1 = new Node(input);
            Node n2 = first;
            for(int i = 0; i<place; i++){
                n2 = n2.next;
            }
            Node n3 = n2.next;
            n2.next = n1;
            n1.next = n3;
        }
    }

    //Opgave 9
    int largest(){
        int largest = 0;
        boolean checking = true;
        Node n1 = first;
        while(checking){
            if(n1.value > largest){
                largest = n1.value;
            }
            if(n1.next != null){
                n1 = n1.next;
            }else{
                checking = false;
            }
        }
        return largest;
    }

    //Opgave 10
    int smallest(){
        int smallest = first.value;
        boolean checking = true;
        Node n1 = first;
        while(checking){
            if(n1.value < smallest){
                smallest = n1.value;
            }
            if(n1.next != null){
                n1 = n1.next;
            }else{
                checking = false;
            }
        }
        
        return smallest;
    }

    int nodesNumber(){
        boolean counting = true;
        Node temp = first;
        int count = 1;
        while(counting){
            if(temp.next != null){
                count++;
                temp = temp.next;
            }else{
                counting = false;
            }
        }
        return count;
    }

    Node lastNode(){
        Node lastNode = first;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        return lastNode;
    }
}
