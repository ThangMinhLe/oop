package quanLySinhVien2;

public class test {

    public static void main(String[] args) {    
        ngaySinh ns = new ngaySinh(2003, 03, 07);
        diaChi dc = new diaChi("Ho Chi Minh", "Thu Duc");
        lopCuaSinhVien lop = new lopCuaSinhVien("dct", "dct1212");
        khoaCuaSinhVien khoa = new khoaCuaSinhVien("cntt", "Cong nghe");
        phuHuynh ph = new phuHuynh("ABC", "0376142044");
        monhoc mh = new monhoc( "Toan", 9.8);

        salary sala = new salary(4, 2000000);

        sinhVien sv[] = new sinhVien[1];

        sv[0] = new sinhVien("01", "Le Minh Thang", "nam" , 
            ns, dc, lop, khoa, ph, mh);

        nhanVien nv[] = new nhanVien[3];
        nv[0] = new baoVe("02", "Hoang Thai", "nam" , 
        ns, dc, 28.9, 200000 );
        
        nv[1] = new giangVien("03", "Le Minh Thang", "nam" , 
        ns, dc,"CSDL", sala);
        
        nv[2] = new nhanVienVanPhong("04", "Le Minh Thang", "nam" , 
        ns, dc, 100, 20000);

        sv[0].xuatTT();
        
        for (nhanVien x:nv ){
            x.xuatTT();
        }
    }

}
