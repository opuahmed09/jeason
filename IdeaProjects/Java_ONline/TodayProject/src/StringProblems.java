import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringProblems {


    public static void main(String[] args) {
//        System.out.println(isPilandrom("CARD"));

        List<String> list = new ArrayList<>();
        list.add("Adnan");
        list.add("apu");
        list.add("sourav");


        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }








    }

 public static boolean isPilandrom(String p){
     if (p.length()<=1){
         return true;
     }

     if (p.charAt(0)== p.charAt(p.length() -1)){
         return isPilandrom(p.substring(1,p.length() -1));
     }else {
         return false;
     }
 }





}
