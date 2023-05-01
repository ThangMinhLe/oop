package test_has_a;

public class hocSinh {
    private String name;
    private double diem;
    private String diaChi;

    public hocSinh(){

    }

    public hocSinh(String name, double diem, String diaChi){
        this.name = name;
        this.diem = diem;
        this.diaChi = diaChi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String toString(){
    return String.format("%10s;%-10.1f;%-10s", getName(), getDiem(), getDiaChi() );
    }


}
