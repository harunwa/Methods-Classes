public class Rectangle {
    private int length;
    private int height;
    private int area;

    public Rectangle(int inputLength, int inputHeight) {
        this.height = inputHeight;
        this.length = inputLength;
        this.area = this.height * this.length;
    }
    public int getArea(){
        return this.area;
    }
    public int getHeight(){
        return this.height;
    }
    public int getLength(){
        return this.length;
    }
    public boolean isRectangle() {
        return this.height == this.length;
    }

}
