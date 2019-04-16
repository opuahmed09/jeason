import java.util.ArrayList;
import java.util.Scanner;

public class arrayLIst {
    public static void main (String []args){
        Scanner ami=new Scanner(System.in);
        ArrayList <String> t= new ArrayList<String>();
        t.add("Otto Bekama kene :- ");
        System.out.println("type  t :-");
        String answer=ami.nextLine();
        System.out.println(answer+" \t"+t.get(0));




    }

}
