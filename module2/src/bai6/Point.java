package bai6;

public class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float arr[] = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y ;
    }
}
class MovalbePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovalbePoint() {
    }

    public MovalbePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovalbePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float arr[]={this.xSpeed,this.ySpeed};
        return arr;
    }
    public void move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
    }
    @Override
    public String toString() {
        return super.toString()+" XSpeed:"+xSpeed+" YSpeed:"+ySpeed;
    }


    public static void main(String[] args) {
        Point point= new Point(5.5f,6);
        MovalbePoint movalbePoint= new MovalbePoint(1,2,3,4);
        System.out.println(point);
        System.out.println(movalbePoint);
        movalbePoint.move();
        System.out.println("Sau khi move:");
        System.out.println(point);
        System.out.println(movalbePoint);
    }
}
