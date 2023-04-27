package quanLySinhVien2;

import java.util.*;

public class person implements chucNang {
    private String id;
    private String name;
    private String gioiTinh;
    private ngaySinh ns;
    private diaChi dc;

    Scanner sc = new Scanner(System.in);

    public person() {
    }

    public person(String id, String name, String gioiTinh, ngaySinh ns, diaChi dc) {
        this.id = id;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.ns = ns;
        this.dc = dc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void nhapTT() {
        System.out.print("Nhap ID:  ");
        setId(sc.nextLine());
        System.out.print("Nhap ten: ");
        setName(sc.nextLine());

        System.out.println("Nhap dia chi!!!");
        System.out.print("Nhap Thanh Pho: ");
        dc.setThanhPho(sc.nextLine());
        System.out.print("Nhap quan: ");
        dc.setQuan(sc.nextLine());

        System.out.println("Nhap ngay thang nam sinh!!");
        System.out.print("Nhap nam sinh: ");
        ns.setNam(sc.nextInt());
        System.out.print("Nhap thang sinh: ");
        ns.setThang(sc.nextInt());
        System.out.print("Nhap ngay sinh: ");
        ns.setNgay(sc.nextInt());

        System.out.print("Nhap gioi tinh: ");
        setGioiTinh(sc.nextLine());
    }

    public String toString() {
        return String.format("%-5s %-20s %-5s %-5d %-5d %-5d %-10s %-10s", getId(), getName(), getGioiTinh(), ns.getNgay(), ns.getThang(), ns.getNam(), dc.getQuan(), dc.getThanhPho()  );
    }

    public void xuatTT() {
        System.out.println(toString()); 
    }

    public void xepLoai() {
        
    }


}
