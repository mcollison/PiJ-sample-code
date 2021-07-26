public class GreenBottlesFor {
  public static void main(String[] args) {
    int bottles = 10;
    for (int i=0;i<bottles;i++) {
      System.out.println( bottles-i + " green bottles hanging on the wall,");
      System.out.println( bottles-i + " green bottles hanging on the wall,");
      System.out.println( "and if one green bottle should accidentally fall, " );
      System.out.println( "they'll be " + (bottles-1-i) + " green bottles hanging on the wall.");
      System.out.println();
    }
    System.out.println("All gone");
  }
}
