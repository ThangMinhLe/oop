package quanLySinhVien2;

import java.util.*;
import java.lang.NullPointerException;

public abstract class person implements chucNang {
    private String id;
    private String name;
    private diaChi dc;
    private String gioiTinh;
    private ngaySinh ns;

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
            if(gioiTinh.equalsIgnoreCase("Nam")||gioiTinh.equalsIgnoreCase("Nu"))
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

        //set gioi tinh
        System.out.print("Moi nhap gioi tinh: ");
        setGioiTinh(sc.nextLine());

        //creat ngaySinh
        ngaySinh ns = new ngaySinh();
        System.out.println("Nhap ngay thang nam sinh!!");
        System.out.print("Nhap nam sinh: ");
        ns.setNam(sc.nextInt());
        System.out.print("Nhap thang sinh: ");
        ns.setThang(sc.nextInt());
        System.out.print("Nhap ngay sinh: ");
        ns.setNgay(sc.nextInt());
        sc.nextLine();
        setNs(ns);

        //creat a diaChi
        diaChi dc = new diaChi();
        System.out.println("Nhap dia chi!!!");
        System.out.print("Nhap quan: ");
        dc.setQuan(sc.nextLine());
        System.out.print("Nhap Thanh Pho: ");
        dc.setThanhPho(sc.nextLine());
        setDc(dc);

        
    }


    public String toString() {
        return String.format("%-5s| %-16s| %-5s| %-5s| %-10s| ",
            getId().substring(0, Math.min(2, getId().length())), 
            getName().substring(0, Math.min(16, getName().length())), 
            getGioiTinh().substring(0, Math.min(4, getGioiTinh().length())), 
            String.valueOf(getNs().getNam()).substring(0, Math.min(5, String.valueOf(getNs().getNam()).length())), 
            getDc().getThanhPho().substring(0, Math.min(9, getDc().getThanhPho().length()))
        );
    }
    

    public String toStringToFile() {
        return String.format("%s;%s;%s;%d;%d;%d;%s;%s;",
         getId(), getName(), getGioiTinh(),  getNs().getNam(), getNs().getThang(), getNs().getNgay(), getDc().getQuan(), getDc().getThanhPho()  );
    }

    public void toStringToDetail(){
        System.out.println("ID: " + getId());
        System.out.println("Ho Va Ten: " + getName());
        System.out.println("Gioi Tinh: " + getGioiTinh());
        System.out.println("Dia Chi: " + getDc().getThanhPho());
        System.out.println("Ngay Sinh: " + getNs().getNgay() + "/"+ 
        getNs().getThang() + "/" + getNs().getNam() );

    }

    public void xuatTT() {
        System.out.println(toString()); 
    }

    public String toStringshort() {
        return String.format("%-5s| %-16s| %-5s| %-5d| %-10s| ",
         getId(), getName(), getGioiTinh(),  getNs().getNam(), getDc().getThanhPho()  );
    }

    public void xuatTTshort() {
        System.out.println(toStringshort()); 
    }



    public abstract char xepLoai();


}
