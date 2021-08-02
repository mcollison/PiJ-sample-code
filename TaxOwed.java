import java.util.Scanner;

public class TaxOwed {
  public static void main(String[] args){
    double tax = taxOwed();
    System.out.println(tax);

  }
    static Scanner sc = new Scanner(System.in);

    public static double income(){
      System.out.println("Please input income...");
      String input = sc.nextLine();
      if ( !(input.toUpperCase().equals("Q")) ){ // !=
        System.exit();
      }
      double income = Double.parseDouble(input);
      return income;
    }

    public static double taxOwed(){
        double userIncome = income();
        if (userIncome < 11_001) {
            return 0;
        } else if ( userIncome < 43_000 ) {
            return (userIncome - 11_000) * 0.3;
        } else if (userIncome < 150_000){
            return (43_000-11_000)*0.3 + (userIncome-43_000)*0.4;
        } else {
            return (43_000-11_000)*0.3 + (150_000-43_000)*0.4 + (userIncome-150_000)*0.55;
        }
    }
}
