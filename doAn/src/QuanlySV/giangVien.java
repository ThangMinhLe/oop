package QuanlySV;

public class giangVien extends person {
        private String monGiangDay; 
        
        public giangVien () {

        }

        public giangVien(String maSo, String name, String namSinh,
         String diachi, String gioiTinh, String monGiangDay ) {
            super(maSo, name, namSinh, diachi, gioiTinh);
            this.monGiangDay = monGiangDay;
        }

        public String setMonGiangDay(String mon) {
            return this.monGiangDay = mon; 
        }

        public String getMonGiangDay () {
            return this.monGiangDay;
        }

        public void nhapTT () {
            super.nhapTT();
            System.out.print("Nhap Thong Tin Mon Giang Day Cua Giang Vien:");
            setMonGiangDay(sc.nextLine());
        }

        public String toString () {
            return super.toString() + String.format("%-28s|%-20s","", monGiangDay);
        }
}
