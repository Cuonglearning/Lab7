package LAB7_2;

public class MoveablePoint implements Moveable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
     
    public void moveUp(){
        System.out.println("Di chuyen diem len");
    }
    
    public void moveDown(){
        System.out.println("Di chuyen diem xuong");
    }
    
    public void moveLeft(){
        System.out.println("i chuyen diem qua trai");
    }
    
    public void moveRight(){
        System.out.println("Di chuyen diem qua phai");
    }
}

