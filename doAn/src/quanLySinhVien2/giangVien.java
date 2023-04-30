package quanLySinhVien2;

import java.lang.NullPointerException;

public class giangVien extends nhanVien {
    private String monGiangDay;
    private salary sala;

    public giangVien() {
    }

    

    public giangVien(String id, String name, String gioiTinh, ngaySinh ns, diaChi dc,String monGiangDay, salary sala) {
        super(id, name, gioiTinh, ns, dc);
        this.monGiangDay = monGiangDay;
        this.sala = sala;
    }

    public String getMonGiangDay() {
        return monGiangDay;
    }

    public void setMonGiangDay(String monGiangDay) {
        this.monGiangDay = monGiangDay;
    }

    public salary getSala() {
        return sala;
    }

    public void setSala(salary sala) {
        this.sala = sala;
    }
    
    public void nhapTT() {
        super.nhapTT();

        System.out.print("Nhap mon giang day: ");
        // sc.nextLine();
        monGiangDay = sc.nextLine();
     
        salary sala = new salary();
        System.out.print("Nhap he so luong cho GV: ");
        sala.setHeSoLuong(sc.nextInt());
        System.out.print("Nhap muc luong cho giao vien: ");
        sala.setMucLuong(sc.nextInt());
        setSala(sala);
    }

    public String toString() {
    return super.toString() + String.format("%-10s| %-10d| %-10s| %-10d", "",this.tinhLuong(), monGiangDay, getSala().getHeSoLuong());
}

    @Override
    public long tinhLuong() {
        return sala.tinhLuongGV();
    }
    
}
