package quanLySinhVien2;

public class giangVien extends nhanVien {
    private String monGiangDay;
    private salary sala;

    public giangVien() {
    }

    public giangVien(String monGiangDay, salary sala) {
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
        monGiangDay = sc.nextLine();
     
        System.out.print("Nhap he so luong cho GV: ");
        sala.setHeSoLuong(sc.nextInt());
        System.out.print("Nhap muc luong cho giao vien: ");
        sala.setMucLuong(sc.nextInt());
    }

    public String toString() {
    return String.format("%-10s %-20d", monGiangDay, this.tinhLuong());
}

    @Override
    public long tinhLuong() {
        return sala.tinhLuongGV();
    }
    
}
