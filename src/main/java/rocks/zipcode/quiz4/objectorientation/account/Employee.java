package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee extends Account implements Worker{
    public Employee() {
    }

    public Employee(BankAccount bankAccount) {
    }

    public BankAccount getBankAccount() {
        return null;
    }

    public void setBankAccount(BankAccount bankAccount) {

    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {

    }

    @Override
    public Double getHoursWorked() {
        return null;
    }

    @Override
    public Double getHourlyWage() {
        return null;
    }

    @Override
    public Double getMoneyEarned() {
        return null;
    }
}
