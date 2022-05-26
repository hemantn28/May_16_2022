package shallow_deep_copy;

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle() {
        breadth=length=0;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area(){
        return (length*breadth);
    }
}
