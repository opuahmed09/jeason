import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class linkdlist {
    public static void main (String args[]){
        LinkedList n=new LinkedList ();//LinkedList and ArrayList are same
        ArrayList<Integer> m=new ArrayList<Integer>();
        Scanner y=new Scanner(System.in);
        System.out.println("This is for ArrayList && LinkedList");
        //String x=y.nextLine();

        m.add(10);
        m.add(11);
        m.add(9);

        n.add("ahmed");
        n.add("Opu");
        n.add("Samian");
        n.add("Adnan");
        n.add("Nahid");
        n.add("Imran");
        System.out.println("First Name is:- " +n.get(0)+"\t"
                +n.get(1+(0+(1+(+3)))));



    }




}
