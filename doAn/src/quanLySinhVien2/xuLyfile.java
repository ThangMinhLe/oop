package quanLySinhVien2;
import java.io.*;
import java.util.Arrays;

public class xuLyfile {
    sinhVien sv[] = new sinhVien[0];
    nhanVien nv[] = new nhanVien[0]; 

    public void DocFile(){
        try {
        FileReader fr= new FileReader("creatData.txt");
        BufferedReader br = new BufferedReader(fr);
        String st;int i=0; 
        // n= Integer.parseInt(br.readLine());
        while(true){
        st=br.readLine(); 
        if(st==null) break;
        String []s=st.split(";");
        String ht=s[0]; 
            
            if(ht.equalsIgnoreCase("sv")){
                sv = Arrays.copyOf(sv,sv.length + 1);
                String id = s[1];
                String name = s[2];
                String gt = s[3];
                ngaySinh ns = new ngaySinh();
                ns.setNam(Integer.parseInt(s[4]));
                ns.setThang(Integer.parseInt(s[5]));
                ns.setNgay(Integer.parseInt(s[6]));
                diaChi dc = new diaChi();
                dc.setQuan(s[7]);
                dc.setThanhPho(s[8]);
                lopCuaSinhVien lop = new lopCuaSinhVien();
                lop.setTenLop(s[9]);
                khoaCuaSinhVien khoa = new khoaCuaSinhVien();
                khoa.setMaKhoa(s[10]);
                khoa.setTenKhoa(s[11]);
                phuHuynh ph = new phuHuynh();
                ph.setTen(s[12]);
                ph.setSoDienThoai(s[13]);
                monhoc mh = new monhoc();
                mh.setTenMonHoc(s[14]);
                mh.setDiem(Double.parseDouble(s[15]));
                sv[sv.length - 1] = new sinhVien(id, name, gt, ns, dc, lop, khoa, ph, mh);
                
                // float d=Float.parseFloat(s[1]);
                // String qq=s[2];
                // ds[0]=new sinhVien(ht, d, qq);
                //  i++;
            }

            if(ht.equalsIgnoreCase("gv")){
                nv = Arrays.copyOf(nv,nv.length + 1);
                String id = s[1];
                String name = s[2];
                String gt = s[3];
                ngaySinh ns = new ngaySinh();
                ns.setNam(Integer.parseInt(s[4]));
                ns.setThang(Integer.parseInt(s[5]));
                ns.setNgay(Integer.parseInt(s[6]));
                diaChi dc = new diaChi();
                dc.setQuan(s[7]);
                dc.setThanhPho(s[8]);
                String mon = s[9];
                salary sala = new salary();
                sala.setHeSoLuong(Integer.parseInt(s[10]));
                sala.setMucLuong(Long.parseLong(s[11]));
                nv[nv.length - 1] = new giangVien(id, name, gt, ns, dc, mon, sala);
            }

            if(ht.equalsIgnoreCase("vp")){
                nv = Arrays.copyOf(nv,nv.length + 1);
                String id = s[1];
                String name = s[2];
                String gt = s[3];
                ngaySinh ns = new ngaySinh();
                ns.setNam(Integer.parseInt(s[4]));
                ns.setThang(Integer.parseInt(s[5]));
                ns.setNgay(Integer.parseInt(s[6]));
                diaChi dc = new diaChi();
                dc.setQuan(s[7]);
                dc.setThanhPho(s[8]);
                double soGioLamViec = Integer.parseInt(s[9]);
                long luong = Long.parseLong(s[10]);
                nv[nv.length - 1] = new nhanVienVanPhong(id, name, gt, ns, dc, soGioLamViec, luong);
            }

            if(ht.equalsIgnoreCase("bv")){
                nv = Arrays.copyOf(nv,nv.length + 1);
                String id = s[1];
                String name = s[2];
                String gt = s[3];
                ngaySinh ns = new ngaySinh();
                ns.setNam(Integer.parseInt(s[4]));
                ns.setThang(Integer.parseInt(s[5]));
                ns.setNgay(Integer.parseInt(s[6]));
                diaChi dc = new diaChi();
                dc.setQuan(s[7]);
                dc.setThanhPho(s[8]);
                System.out.println(s[9]);
                double ngayLuong = Double.parseDouble(s[9]);
                long luong = Long.parseLong(s[10]);
                nv[nv.length - 1] = new baoVe(id, name, gt, ns, dc, ngayLuong, luong);
                
            }

        }
        } catch (IOException e) {}}

        public sinhVien[] resultsv(){
            return sv;
        }

        public nhanVien[] resultnv(){
            return nv;
        }


        public void ghiFile(){
            
            try {
                for(sinhVien x:sv){
            FileWriter fr=new FileWriter("data.txt");
            BufferedWriter bw=new BufferedWriter(fr);
            bw.write(x.toStringToFile());
            bw.newLine();
            bw.close();
            fr.close();
            }
            System.out.println("Da ghi file sv thanh cong!!");
        }
            
            catch (IOException ex) {
                System.out.println(ex);
            }  
        
            try {
                for(nhanVien x:nv){
            FileWriter fr=new FileWriter("data.txt");
            BufferedWriter bw=new BufferedWriter(fr);
            bw.write(x.toStringToFile());
            bw.newLine();
            bw.close();
            fr.close();

            }
            System.out.println("Da ghi file nv thanh cong!!");
        }
            
            catch (IOException ex) {
                System.out.println(ex);
            }  
        }

        public void ghiFile2() {
            try (FileWriter fr = new FileWriter("data.txt",false);
                 BufferedWriter bw = new BufferedWriter(fr)) {
                for (sinhVien obj : sv) {
                    if (obj instanceof sinhVien) {
                        bw.write(obj.toStringToFile());
                        bw.newLine();
                    }
                }
                
                for (nhanVien obj : nv) {
                    if (obj instanceof nhanVien) {
                        bw.write(obj.toStringToFile());
                        bw.newLine();
                    }
                }
                // bw.write(st.toString());
                //         bw.newLine();
                
                System.out.println("Da ghi file thanh cong!!");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        

        public void returnsv(sinhVien[] sv){
                this. sv = sv;
        }

        public void returnnv(nhanVien[] nv){
                this.nv = nv;
        }

}
