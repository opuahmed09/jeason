import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class santaUpdate {
    public static void main (String args[]){
        Scanner p=new Scanner(System.in);
        ArrayList<String> o=new ArrayList <String>();

        int total;
        String a;

      /*  o.add("Opu");
        o.add("Adnan");
        o.add("Nayem");
        o.add("Showrob");
        System.out.println("My family Members Are :- " +o);
        */
        System.out.println("how many members do you want to add : ");
        total = p.nextInt();

        System.out.println("Put your're family member's name :- ");
         a=p.nextLine(); //...This is just for loop .


        while(o.size()!=total) {
             a=p.nextLine();
            o.add(a);
        }


        System.out.println("your family members are :  "+ o);







       System.out.println("Whose Secrete santa are you looking for?:- ");
        String q=p.nextLine();
        o.remove(q);
        System.out.println(o);
        Random r=new Random();
        int s=r.nextInt(o.size());
        String t=o.get(s);
        System.out.println(t +"is the Secret Santa of "+q+".");
        System.out.println();





    }
}
