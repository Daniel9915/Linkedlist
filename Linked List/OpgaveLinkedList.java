import java.util.Random;
public class OpgaveLinkedList{
    public static void main(String[] args){


        //Value of first node is 5
        Random rand = new Random();

        LinkedList list = new LinkedList(rand.nextInt(10000-100));
        System.out.println();
        for(int i = 0; i<100; i++){
            list.add(rand.nextInt(10000-100));
        }
        

        System.out.print("The list: ");
        list.println();
        System.out.println("Largest: " + list.largest());
        System.out.println("Smallest: " + list.smallest());
        
        
    }
}
