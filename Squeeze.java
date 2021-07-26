import java.util.ArrayList;
public class Squeeze {
  public static void main(String[] args){
    int[] intArr = { 1, 2, 2, 2, 3, 4, 4 ,5 };
    int previous = intArr[0];
    ArrayList<Integer> list = new ArrayList<>();
    list.add(previous);
    for (int num : intArr){
      System.out.println(num);
      if (previous != num){
        list.add(num);
        previous=num;
      }
    }
    System.out.println( list );
  }
}
