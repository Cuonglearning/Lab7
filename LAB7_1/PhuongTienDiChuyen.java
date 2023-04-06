package LAB7_1;

public abstract class PhuongTienDiChuyen {
    String loaiPhuongTien;
    HangSanXuat hangSanXuat;
    
    String layTenHangSanXuat(){
        return "Ten hang san xuat";
    }
    
    void batDau(){
    }
    
    void tangToc(){
    }
    
    void dungLai(){
    }
    
    abstract double layVanToc();
}
