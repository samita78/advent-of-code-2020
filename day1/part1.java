import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

// answer: 542619
public class part1{

  private static int VALUE = 2020;

  public static void main(String[] args){
      try{
        Scanner s = new Scanner(new File("expense.txt"));
        Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();

        while (s.hasNext()){
          int price = Integer.parseInt(s.next());
          list.add(price);
        }
        s.close();

         for (int i = 0; i < list.size(); i++){
              int firstValue = list.get(i);
              int secondValue = VALUE - firstValue;
               if (hash.contains(secondValue)){
                 int answer = firstValue * secondValue;
                 System.out.println(answer);
               }
               else{
                  hash.put(i, firstValue);
               }
       }
    }
    catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
    }
  }

}
