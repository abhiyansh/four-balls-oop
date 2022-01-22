import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int BALL_DIAMETER = 25;
    public static final int BALL_COUNT = 4;
    public static final int BALL_START_CENTER_X = 0;

    Ball[] balls = new Ball[BALL_COUNT];

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int ballIndex = 0; ballIndex < BALL_COUNT; ballIndex++) {
            balls[ballIndex] = new Ball(BALL_START_CENTER_X, getBallHeight(ballIndex), BALL_DIAMETER, getBallSpeed(ballIndex));
        }
    }

    @Override
    public void draw() {
        for (Ball ball: balls) {
            drawBall(ball);
            ball.moveOneStepInX();
        }
    }

    private void drawBall(Ball ball) {
        ellipse(ball.centerX, ball.centerY, ball.diameter, ball.diameter);
    }

    private int getBallHeight(int ballIndex) {
        return (HEIGHT * (ballIndex+1)) / (BALL_COUNT + 1);
    }

    private int getBallSpeed(int ballIndex) {
        return ballIndex + 1;
    }

}
