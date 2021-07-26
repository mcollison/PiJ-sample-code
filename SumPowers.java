public class SumPowers{
  public static void main(String[] args){
    if( args.length == 2){
      int terms = Integer.parseInt(args[0]);
      int power = Integer.parseInt(args[1]);
      int total = 0;
      for(int i=1; i<=terms;i++){
        total += Math.pow(i,power);
        //System.out.println( total );
      }
      System.out.println( total );
    }
  }
}
