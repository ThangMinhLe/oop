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
    return super.toString() + String.format("%-10s| %-10s| %-10s| %-10s| %-5s", "", "",this.tinhLuong(), monGiangDay, xepLoai());
}

    
    public String toStringToFile() {
        return String.format("%s;","gv") + super.toStringToFile() + String.format("%d;%d",getSala().getHeSoLuong(), getSala().getMucLuong()); 
    }
    
    // Xep loai them he so luong
    public char xepLoai() {
            if(getSala().getHeSoLuong() >=1 && getSala().getHeSoLuong() <= 3) return 'C';
            if(getSala().getHeSoLuong() >3 && getSala().getHeSoLuong() <= 6) return 'B';
            if(getSala().getHeSoLuong() >6 && getSala().getHeSoLuong() <= 8) return 'A';
        return ' ';
    }

    // Dua tren xep loai tinh phu cap cho giang vien:
    // Voi giang vien co loai 'A': Phu cap them 2.500.000VND 
    // Voi giang vien co loai 'B' : Phu cap them 1.500.000VND 
    // Voi giang vien co loai 'C' : Phu cap them 500.000VND 
    @Override
    public long tinhLuong() {
        if(xepLoai() == 'A') return sala.tinhLuongGV() + 2500000;
        if(xepLoai() == 'B') return sala.tinhLuongGV() + 1500000;
        if(xepLoai() == 'C') return sala.tinhLuongGV() + 500000;
        return sala.tinhLuongGV();
    }
    
}
