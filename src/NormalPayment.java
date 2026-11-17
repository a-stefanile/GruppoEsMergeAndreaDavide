public class NormalPayment implements  DiscountStrategy{
    @Override
    public double calculateDiscountPrice(double price) {
        return price;
    }

    @Override
    public String description() {
        return "NormalPayment strategy";
    }
}
