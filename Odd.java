public class Odd{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input a number...");
    //Note this will throw an exception for non-integer inputs. 
    int input = Integer.parseInt( sc.nextLine() );
    if ( input%2 == 0 ){
      System.out.println("true");
    }
  }
}
