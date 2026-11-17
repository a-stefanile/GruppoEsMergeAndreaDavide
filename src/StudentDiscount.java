public class StudentDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscountPrice(double price) {
        return price * 0.90;
    }

    @Override
    public String description() {
        return "StudentDiscount strategy";
    }
}
