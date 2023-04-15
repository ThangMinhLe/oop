package QuanlySV;

public class sinhVien extends person {
    private String lop;
    private String khoa;
    private double diem;
    // private int soTinChiDaDat;
    


     sinhVien(){

    }

    public sinhVien (String maSV, String name, String gioiTinh, String namSinh, String diaChi, String lop,
     String khoa, double diem, int soTinChiDaDat)   {
        super(maSV, name, namSinh, diaChi, gioiTinh);
        this.lop = lop;
        this.khoa  = khoa;
        this.diem = diem;
        // this.soTinChiDaDat = soTinChiDaDat;
    }

    public String lop () {
        return this.lop;
    }

    public String getLop () {
        return this.lop;
    }

    public String setLop (String lop) {
        return this.lop = lop;
    }

    public String setKhoa (String khoa) {
        return this.khoa = khoa;
    }

    public String getKhoa () {
        return this.khoa;
    }

    public double setDiem(double diem) { 
        return this.diem = diem;
    }

    public double getDiem () {
        return this.diem;
    }

    // public int settinChi (int tinChi){
    //     // return this.soTinChiDaDat = tinChi;
    // }

    // public int getTinChi () {
    //     // return this.soTinChiDaDat;
    // }

    public void nhapTT () {
        super.nhapTT();
        System.out.print("Nhap lop cho sinh vien: ");
        lop = sc.nextLine();
        System.out.print("Nhap khoa cho sinh vien: ");
        khoa = sc.nextLine();
        // System.out.print("Nhap so tin chi da dat duoc cua sinh vien: ");
        // soTinChiDaDat = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap diem cho sinh vien: ");
        diem = Double.parseDouble(sc.nextLine());
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%-5s|%-5s|%-5.1f|", lop, khoa, diem);
    }

    public static void main(String[] args) {
        
    }

}
