package TankGames.Tankgame4;

public class Tank {
    private int x;
    private int y;
    private int speed = 1;
    private int direct;
    boolean isLive = true;

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    //坦克移动
    public void setY(int y) {
        this.y = y;
    }
    public void moveUp(){
        y -=speed;
    }
    public void moveRight(){
        x +=speed;
    }
    public void moveDown(){
        y +=speed;
    }
    public void moveLeft(){
        x -=speed;
    }

}
