import java.io.*;
import java.util.*;

// answer: 32858450
public class expense{

public static void calculateExpense(){
try{
  Scanner s = new Scanner(new File("expense.txt"));

  List<Integer> list = new ArrayList<Integer>();
  while(s.hasNext()){
    int item = Integer.parseInt(s.next());
    list.add(item);
  }

int answer = 0;

  for (int i = 0; i < list.size(); i++){
      for(int j = i + 1; j < list.size(); j++){
          for(int k = j + 1; k < list.size(); k++){
                if(list.get(i) + list.get(j) + list.get(k) == 2020){
                 answer = list.get(i) * list.get(j) * list.get(k);
                 System.out.println(answer);
                }
          }
      }
  }
}
catch(FileNotFoundException f){
    System.out.println(f);
}
}

public static void main(String[] args){
    calculateExpense();
}


}
