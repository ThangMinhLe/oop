package QuanlySV;

import java.util.*;

public class person {
    private String maSo;
    private String name;
    private String namSinh;
    private String diachi;
    private String gioiTinh;

    Scanner sc = new Scanner(System.in);

    public person () {

    }

    public person (String maSo, String name, String namSinh, String diachi, String gioiTinh) {
        this.maSo = maSo;
        this.name = name; 
        this.namSinh = namSinh;
        this.diachi = diachi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSo () {
        return maSo;
    }

    public String setMaSo (String maSo) {
        return this.maSo = maSo; 
    }

    public String getName () {
        return this.name;
    }

    public String setName (String name) {
        return this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String setGioiTinh(String gioiTinh) {
        while(true){
            if(gioiTinh.equalsIgnoreCase("Nam")||gioiTinh.equalsIgnoreCase("Nu"))
                break;
            System.out.println("Moi nhap gioi tinh hop le");
            gioiTinh=sc.nextLine();
        }
         return this.gioiTinh = gioiTinh;
    }

    public String getNamSinh () {
        return this.namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    
    public String getDiaChi () {
        return this.diachi;
    }

    public String setDiaChi (String diaChi) {
        return this.diachi = diaChi;
    }

    public void nhapTT(){
        System.out.print("Nhap ma so: ");
        setMaSo(sc.nextLine());
        System.out.println("Moi nhap ho ten:");
        setName(sc.nextLine());
        System.out.println("Moi nhap gioi tinh:");
        setGioiTinh(sc.nextLine());
        System.out.println("Moi nhap nam sinh:");
        setNamSinh(sc.nextLine());
        System.out.println("Moi nhap dia chi:");
        setDiaChi(sc.nextLine());
    }

    public String toString () {
       
       return  String.format("%-7s|%-20s|%-11s|%-10s|%-20s|",maSo ,name, gioiTinh, namSinh, diachi);

    }

    public void xuatTT(){
        
        System.out.println(toString() );
    }
    
  
}
