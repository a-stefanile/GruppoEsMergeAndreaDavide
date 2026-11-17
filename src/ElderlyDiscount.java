public class ElderlyDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscountPrice(double price) {
        return price * 0.7;
    }
    @Override
    public String description() {
        return "Elderly Discount strategy";
    }
}
