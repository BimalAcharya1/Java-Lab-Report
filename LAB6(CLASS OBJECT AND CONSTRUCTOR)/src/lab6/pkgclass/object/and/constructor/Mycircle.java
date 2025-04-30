class circle {
    float pi;
    private float radius;

    public circle(float p, float r) {
        pi = p;
        radius = r;
    }

    public float findArea() {
        return (pi*(radius * radius));
    }

    public float findCircumfrence() {
        return(2 * pi * radius);
    }
}
public class Mycircle{
    public static void main(String[] args) {
        circle c = new circle(3.14f , 5f);
	float a=c.findArea();
	float ci= c.findCircumfrence();


        System.out.print("circle :Area: " +a + "  Circumfrence:  " +ci);
        
}
}