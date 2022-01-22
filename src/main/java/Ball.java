public class Ball {
    int centerX;
    int centerY;
    final int diameter;
    private final int speed;

    public Ball(int centerX, int centerY, int diameter, int speed) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.diameter = diameter;
        this.speed = speed;
    }

    public void moveOneStepInX(){
        centerX+=speed;
    }
}
