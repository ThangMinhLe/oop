package quanLySinhVien2;

import java.util.*;

public class person implements chucNang {
    private int id;
    private String name;
    private String diaChi; 
    private String gioiTinh;
    private ngaySinh ns;
    private diaChi dc;

    Scanner sc = new Scanner(System.in);

    public person() {
    }

    public person(int id, String name, String diaChi, String gioiTinh, ngaySinh ns, diaChi dc) {
        this.id = id;
        this.name = name;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.ns = ns;
        this.dc = dc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        while(true){
            if(gioiTinh.equalsIgnoreCase("Nam")||
            gioiTinh.equalsIgnoreCase("Nu"))
                break;
            System.out.println("Moi nhap gioi tinh hop le");
            gioiTinh=sc.nextLine();
        }
       this.gioiTinh = gioiTinh;
    }

    public ngaySinh getNs() {
        return ns;
    }

    public void setNs(ngaySinh ns) {
        this.ns = ns;
    }

    public diaChi getDc() {
        return dc;
    }

    public void setDc(diaChi dc) {
        this.dc = dc;
    }


    public void xepLoai() {
        
    }


}
