package structure;

public class datastructure {
    public static void main(String[] args) {


        String[] employeesName = {"Apu ", "Adnan"};
        int[] salary = {100, 200, 300};


        int[] Identification = new int[2];
        Identification[0] =100;
        Identification[1]=1000;
        try {
            Identification[2] = 2000;
        }catch(ArrayIndexOutOfBoundsException e){

        }




        System.out.println(Identification[1]);


       String  T[][] = new String [2] [3];
        for (int i=0;i<T.length;i++){
      for (int j=0; j<T.length;j++){
          T[0][1]="hey";

      }
        }
        System.out.println(TArray[0][1]);

        }

    }
//}
