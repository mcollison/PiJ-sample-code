public class PrintN{
  public static void main(String[] args){
    if (args.length != 2){
      System.out.println( "Please enter two command-line arguments" );
    } else {
      String word = args[0];
      int number = Integer.parseInt(args[1]);
      for(int i=0;i<number;i++){
        System.out.println(word);
      }
    }
  }
}
