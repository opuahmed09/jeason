package Quee;

import java.util.LinkedHashMap;
import java.util.Map;

public class quee {
    public static  void main (String[]args){
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"Bangladesh");
        map.put(2,"America");
        map.put(3,"NewYork");
        System.out.println(map.get(2));
        for(Map.Entry<Integer,String> city:map.entrySet()){

        }
    }


}
