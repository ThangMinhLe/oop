package quanLySinhVien2;

import java.lang.NullPointerException;

public abstract class nhanVien extends person {

    public nhanVien() {
        
    }

    public nhanVien(String id, String name, String gioiTinh, ngaySinh ns, diaChi dc)
    {
        super(id, name, gioiTinh, ns, dc);
    }



    public abstract long tinhLuong(); 
    
}
