package lab2;

public class CommissionEmployee {
    private String first_name;
    private String last_name;
    private String social_security_number;
    private double gross_sales;
    private double commission_rate;

    public CommissionEmployee(String first_name, String last_name, String social_security_number, double gross_sales, double commission_rate){
        if (gross_sales < 0){
            this.gross_sales = 0;
        } else {
            this.gross_sales = gross_sales;
        }

        if (commission_rate < 0 || commission_rate > 1){
            this.commission_rate = 0.0;
        } else {
            this.commission_rate = commission_rate;
        }

        this.first_name = first_name;
        this.last_name = last_name;
        this.social_security_number = social_security_number;

    }

    public String getSocial_security_number() {
        return social_security_number;
    }

    public double getGross_sales() {
        return gross_sales;
    }

    public double calc_commission(){
        return this.gross_sales * this.commission_rate;
    }
}
