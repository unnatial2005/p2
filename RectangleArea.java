public class RectangleArea {
    int length, breadth;

    RectangleArea(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area: " + (length * breadth));
    }

    public static void main(String[] args) {
        RectangleArea r = new RectangleArea(5, 4);
        r.area();
    }
}
