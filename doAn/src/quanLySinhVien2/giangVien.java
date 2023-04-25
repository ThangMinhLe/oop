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
    


    @Override
    public long tinhLuong() {
        return sala.tinhLuongGV();
    }
    
}
