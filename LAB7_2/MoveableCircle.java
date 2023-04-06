package LAB7_2;

public class MoveableCircle implements Moveable {
    int radius;
    MoveablePoint center;

    public MoveableCircle(int radius, MoveablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MoveableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
    
    public void moveUp(){
        System.out.println("Di chuyen hinh tron len");
    }
    
    public void moveDown(){
        System.out.println("DI chuyen hinh tron xuong");
    }
    
    public void moveLeft(){
        System.out.println("Di chuyen hinh tron qua phai");
    }
    
    public void moveRight(){
        System.out.println("Di chuyen hinh tron qua trai");
    }
}
