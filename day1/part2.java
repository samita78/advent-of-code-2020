import java.io.*;
import java.util.*;

public class part2{

  private static int TOTAL = 2020;

  public static void main(String[] args){
      try{
        Scanner s = new Scanner(new File("expense.txt"));
        Hashmap<Integer, int[]> hash = new Hashmap<Integer, int[]>();
        List<Integer> list = new ArrayList<Integer>();

        while (s.hasNext()){
          int price = Integer.parseInt(s.next());
          list.add(price);
        }
        s.close();

        int value1, value2, value3;
      for(int i = 0; i <list.size(); i++){
           value1 = list.get(i);
        for(int j = i + 1; j < list.size(); j++){
           value2 = list.get(j);
           value3 = TOTAL - (value1 + value2);
              if(hash.contains(value3)){
                  System.out.println(value1*value2*value3);
              }else{
                hash.add(new int[]{value1, value2});
                System.out.println(hash);
              }

        }

      }

    }
    catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
    }
  }

}
