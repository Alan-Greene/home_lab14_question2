package lab2;

public class TestEmployee {

    public static void main(String[] args) {
        CommissionEmployee ce1 = new CommissionEmployee("Alan", "Greene", "x00124937", 20000, 0.05);

        Employee bpc1 = new Employee("Mary", "Jones", "x11489378", 30000, 0.06, 500);

        System.out.println(ce1.getSocial_security_number());
        System.out.println(bpc1.getSocial_security_number());
        System.out.println(ce1.getGross_sales());
        System.out.println(bpc1.getGross_sales());
        System.out.println(ce1.calc_commission());
        System.out.println(bpc1.getEarnings());

    }
}
