import java.util.ArrayList;

public class Account {

  ArrayList<Company> acc;

  public Account(ArrayList<Company> acc) {
    this.acc = acc;
  }

  public void viewTotalAccounts() {

    System.out.println("There are " + acc.size() + " total accounts in this company.");
    System.out.println();
    System.out.println("They are as follows: ");
    System.out.println();
    System.out.println(acc);
    System.out.println();
  }

}
