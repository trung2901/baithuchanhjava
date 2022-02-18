import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //khai bao bien
        double heSoA, heSoB, nghiemX;
        //can thong bao cho nguoi dung nhap vao he so
        System.out.println("Nhap he so A");  
        //doc gia tri nguoi dung nhap vao tu ban phim => gan vao bien
        //khai bao doi tuong Scanner de doc du lieu tu nguoi dung nhap vao
        Scanner abc = new Scanner(System.in);
        //gan gia tri nguoi dung nhap vao tu ban phim cho bien so heSoA
        heSoA = abc.nextDouble();
        //can thong bao cho nguoi dung nhap vao he so
        System.out.println("Nhap he so B"); 
        heSoB = abc.nextDouble();
        nghiemX = -heSoB / heSoA;
    
    }
}
