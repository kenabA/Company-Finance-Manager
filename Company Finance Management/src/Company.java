import java.util.ArrayList;

public class Company {

  private String name;
  private int age;
  private int salary;
  private int updatedSalary;
  private Status status;
  private int currentAmount;

  public String toString() {
    return "{ Name: " + this.name + " | Age: " + this.age + " | Status: " + this.status + " }";
  }

  public Company(String name, int age, Status status) {
    this.name = name;
    this.age = age;
    this.status = status;
  }

  public void viewPersonalDetails() {
    System.out.println("{ Name: " + this.name + " | Age: " + this.age + " | Status: " + this.status + " }");
  }

  public void viewBankDetails() {
    System.out.println("Current Amount: Rs. " + this.currentAmount);
  }

  public void salaries() {

    switch (this.status) {
      case JUNIOR_INTERN:
        this.salary = 5000;
        break;

      case SENIOR_INTERN:
        this.salary = 10000;
        break;

      case DEV:
        this.salary = 25000;
        break;

      case CEO:
        this.salary = 100000;
        break;
    }

  }

  public void giveSalaryLogic() {
    salaries();
    if (this.updatedSalary != 0) {
      this.currentAmount += this.updatedSalary;
      System.out.println("Rs " + this.updatedSalary + " has been credited to " + this.name + ".");
    } else {
      salary = this.salary;
      this.currentAmount += this.salary;
      System.out.println("Rs " + this.salary + " has been credited to " + this.name + ".");
    }
  }

  public void giveSalary() {
    if (this.status == Status.CEO) {
      giveSalaryLogic();
    } else if (this.status == Status.JUNIOR_INTERN) {
      giveSalaryLogic();
    } else if (this.status == Status.SENIOR_INTERN) {
      giveSalaryLogic();
    } else if (this.status == Status.DEV) {
      giveSalaryLogic();
    }

  }

  public void increaseSalary(int increasingAmount) {
    salaries();
    this.updatedSalary = this.salary + increasingAmount;
    System.out.println(
        "Successfully increased. Now Salary is Rs. " + this.updatedSalary);
  }

  public void decreaseSalary(int decreasingAmount) {

    salaries();
    this.updatedSalary = this.updatedSalary - decreasingAmount;
    if (this.updatedSalary >= this.salary) {
      System.out.println(
          "Successfully decreased. Now Salary is Rs. " + this.updatedSalary);
    } else {
      System.out.println("Cannot decrease from the base salary.");
      this.updatedSalary = this.updatedSalary + decreasingAmount;

    }

  }

  public static void main(String[] args) {
    ArrayList<Company> accounts = new ArrayList<>();
    Company acc1 = new Company("Kenab Kushal KC", 24, Status.CEO);
    Company acc2 = new Company("Pragati Bista", 22, Status.SENIOR_INTERN);
    Company acc3 = new Company("Niraj Chaudhary", 18, Status.JUNIOR_INTERN);
    Company acc4 = new Company("Abhishek KC", 20, Status.DEV);

    acc1.viewBankDetails();
    acc1.decreaseSalary(1000);
    acc1.increaseSalary(10000);
    acc1.giveSalary();
    acc1.viewBankDetails();

    accounts.add(acc4);
    accounts.add(acc3);
    accounts.add(acc2);
    accounts.add(acc1);

    System.out.println(); // Just for printing an extra line to look organised.
    Account obj1 = new Account(accounts);
    obj1.viewTotalAccounts();

  }
}
