package OCP;

public class InsurancePremiumDiscountCalculator {

        public int calculateInsurancePremium(CustomerProfile cust){
            if(cust.isLoyalCustomer()){
                return 20;
            }
            return 0;
        }
}
