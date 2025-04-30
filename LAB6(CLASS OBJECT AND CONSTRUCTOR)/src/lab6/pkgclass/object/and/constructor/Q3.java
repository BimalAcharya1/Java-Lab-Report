
class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getVolume() {
        return width * height * depth;
    }
    public double getSurfaceArea() {
        return 2 * (width * height + width * depth + height * depth);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Box box1 = new Box(2.0, 3.0, 4.0);
        Box box2 = new Box(5.0, 6.0, 7.0);

        System.out.println("Box 1 Volume: " + box1.getVolume());
        System.out.println("Box 1 Surface Area: " + box1.getSurfaceArea());
	
        System.out.println("Box 2 Volume: " + box2.getVolume());
        System.out.println("Box 2 Surface Area: " + box2.getSurfaceArea());
    }
}