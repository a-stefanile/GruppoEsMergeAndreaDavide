public interface DiscountStrategy {
    double calculateDiscountPrice(double price);
    String description();
}
