public class Point3D extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public Point3D(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Point3D(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Point3D() {

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        return new float[]{getXSpeed(), getYSpeed()};
    }

    @Override
    public String toString() {
        return super.toString() + ",speed = (" + getXSpeed() + "," + getYSpeed() + ")";
    }

    public Point3D move() {
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}