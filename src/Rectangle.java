public class Rectangle extends Shape {
    double base, height;

    Rectangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return base* height;
    }
}
