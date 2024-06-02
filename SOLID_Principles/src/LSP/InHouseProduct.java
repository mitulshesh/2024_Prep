package LSP;

public class InHouseProduct extends Product {


@Override
public double getDiscount(){
        return getExtraDiscount();
}
    protected double getExtraDiscount(){
        return discount * 1.5;
    }
}
