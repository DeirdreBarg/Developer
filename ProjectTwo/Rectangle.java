public class Rectangle {
    
    int length = 0;
    int width = 0;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public float getArea() {
        float area = length * width;
        return area;
    }

}
