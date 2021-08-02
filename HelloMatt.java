public class HelloMatt{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input your name...");
    String input = sc.nextLine();
    if ( input.equals("Matt") ){
      System.out.println("Hello Matt the programmer");
    } else {
      System.out.println("Hello " + input);
    }
  }
}
