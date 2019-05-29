package hellocucumber.model;

public class Seller {
    public boolean processPayment(int price, int cardMinimum){
        if(price>=cardMinimum){
            return true;
        }
        return false;
    }
}
