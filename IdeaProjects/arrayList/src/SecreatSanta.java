import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SecreatSanta {
    public static void main (String []args){
        ArrayList<String> family=new ArrayList<String>();
        Scanner call=new Scanner(System.in);
        family.add("Opu");
        family.add("Pappu");
        family.add("Sadik");
        family.add("Nayem");
        family.add("Rima");
        family.add("Shimu");
        family.add("Rimu");
        family.add("Hena");
        family.add("Ruhena");
        System.out.println("my family members are,"+" "+family);
        System.out.println("Whose Secrete santa You want to see :- ");
        String j=call.nextLine();
        family.remove(j);
        System.out.println(family);
        Random o=new Random();
        int p=o.nextInt(family.size());
        String q=family.get(p);
        System.out.println(q+" "+"Is the Secrete Santa of :- "+j);






    }
}
