import java.util.Scanner;
public class FactorialLessThan1m{
  public static void main(String[] args){
    Scanner sc = new Scanner( System.in );
    System.out.println( "Please enter a number..." );
    int input = Integer.parseInt( sc.nextLine() );
    int factorial = 1;
    boolean valid =true;
    for(int i=1;i<=input;i++){
      factorial *= i;
      if( factorial > 1_000_000 ){
        System.out.println("None");
        valid = false;
        break;
      }
    }
    if(valid){
      System.out.println(factorial);
    }
  }
}
