public class RectanglePerimeter {
    int length, breadth;

    RectanglePerimeter(int l, int b) {
        length = l;
        breadth = b;
    }

    void perimeter() {
        System.out.println("Perimeter: " + 2 * (length + breadth));
    }

    public static void main(String[] args) {
        RectanglePerimeter rp = new RectanglePerimeter(5, 4);
        rp.perimeter();
    }
}
