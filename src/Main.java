public class Main {

    static double sum(Shape[] vector) {
        double total = 0;
        for (Shape s : vector) {
            total += s.calculateArea();
        }
        return total;
    }

    static void sort(Shape[] vector) {
        Shape[] sorted_shapes = new Shape[vector.length];
        boolean[] used = new boolean[vector.length];

        for (int j = 0; j < vector.length; j++) {
            double min = Double.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < vector.length; i++) {
                if (!used[i] && vector[i].calculateArea() < min) {
                    min = vector[i].calculateArea();
                    index = i;
                }
            }
            used[index] = true;
            sorted_shapes[j] = vector[index];
        }

        for (int k = 0; k < vector.length; k++) {
            vector[k] = sorted_shapes[k];
        }
    }

    static void print(Shape[] vector) {
        for (Shape s : vector) {
            System.out.println(s.getClass().getSimpleName() + ": " + s.calculateArea());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Shape[] v = new Shape[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Circle(5);
        v[2] = new Square(5);
        v[3] = new Circle(120);

        double res = sum(v);

        System.out.println("sum: " + res);

        print(v);

        sort(v);

        print(v);
    }
}
