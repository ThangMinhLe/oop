package quanLySinhVien2;

public class sinhVien extends person implements chucNang {
    private lopCuaSinhVien lop;
    private khoaCuaSinhVien khoa;
    private phuHuynh ph;
    private monhoc mh;
    private giangVien gv;

    public sinhVien() {
    }

    public sinhVien(lopCuaSinhVien lop, khoaCuaSinhVien khoa, phuHuynh ph, monhoc mh, giangVien gv) {
        this.lop = lop;
        this.khoa = khoa;
        this.ph = ph;
        this.mh = mh;
        this.gv = gv;
    }

    public lopCuaSinhVien getLop() {
        return lop;
    }

    public void setLop(lopCuaSinhVien lop) {
        this.lop = lop;
    }

    public khoaCuaSinhVien getKhoa() {
        return khoa;
    }

    public void setKhoa(khoaCuaSinhVien khoa) {
        this.khoa = khoa;
    }

    public phuHuynh getPh() {
        return ph;
    }

    public void setPh(phuHuynh ph) {
        this.ph = ph;
    }

    public monhoc getMh() {
        return mh;
    }

    public void setMh(monhoc mh) {
        this.mh = mh;
    }

    public giangVien getGv() {
        return gv;
    }

    public void setGv(giangVien gv) {
        this.gv = gv;
    }

    @Override 
    public void nhapTT() {
      super.nhapTT();

      System.out.println("Nhap lop cho sv!!!");
      System.out.print("Nhap ma lop cho sv: ");
      lop.setMaLop(sc.nextLine());  
      System.out.print("Nhap ten lop cho snh vien: ");
      lop.setTenLop(sc.nextLine());
      
      System.out.println("Nhap khoa cho sinh vien!!!");
      System.out.print("Nhap ma khoa cho sinh vien: ");
      khoa.setMaKhoa(sc.nextLine());
      System.out.print("Nhap ten khoa cho sinh vien: ");
      khoa.setTenKhoa(sc.nextLine());

      System.out.println("Nhap thong tin phu huynh cua sinh vien: ");
      System.out.print("Nhap ten cho phu huynh: ");
      ph.setTen(sc.nextLine());
      System.out.print("Nhap SDT cho phu huynh: ");
      ph.setSoDienThoai(sc.nextLine());

      System.out.println("Nhap thong tin mon hoc: ");
      System.out.print("Nhap ma mon hoc: ");
      mh.setMaMonHoc(sc.nextLine());
      System.out.print("Nhap ten mon hoc: ");
      mh.setTenMonHoc(getGioiTinh());
      System.out.print("Nhap diem cho sinh vien: ");
      mh.setDiem(sc.nextDouble());

      System.out.println("Nhap GV!!! ");
      System.out.print("Nhap ten giang vien: ");
      gv.setName(getName());
    }

    public String toString() {
        return super.toString() + String.format("%-5s %-5s %-20s %-20s", lop.getTenLop(), khoa.getTenKhoa(), ph.getTen(), gv.getName() );
    }

    public void xepLoai() {
        
    }



}
