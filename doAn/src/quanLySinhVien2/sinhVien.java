package quanLySinhVien2;

public class sinhVien extends person {
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


    
    


}
