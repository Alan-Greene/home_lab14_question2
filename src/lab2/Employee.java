package lab2;

public class Employee extends CommissionEmployee{
    double base_salary;
    double earnings;

    public Employee(String first_name, String last_name, String social_security_number, double gross_sales, double commission_rate, double base_salary){
        super(first_name, last_name, social_security_number, gross_sales, commission_rate);
        this.base_salary = base_salary;
        this.earnings = this.calc_commission() + this.base_salary;
    }

    public double getEarnings() {
        return earnings;
    }
}
