package test_has_a;
import java.io.*;

 


public class filewirter {
        hocSinh ds []=new hocSinh[1];


    public void DocFile(){
        try {
        FileReader fr= new FileReader("creatData.txt");
        BufferedReader br = new BufferedReader(fr);
        String st;int i=0; 
        // n= Integer.parseInt(br.readLine());
        while(true){
        st=br.readLine(); if(st==null) break;
        String []s=st.split(";");
        String ht=s[0]; float d=Float.parseFloat(s[1]);
        String qq=s[2];
        ds[0]=new hocSinh(ht, d, qq); i++;
        }
        } catch (IOException e) {}}

        public void show(){
            System.out.println(ds[0].toString());
        }

    public static void main(String[] args) {
        // String st="\nHi man this is a addend data file";
        // hocSinh hs = new hocSinh("Minh Thang", 9.0, "Ham Tan");
        // try {
        //     FileWriter fr=new FileWriter("data.txt" );
        //     BufferedWriter fw=new BufferedWriter(fr);
        //     fw.write(hs.toString());
        //     fw.close();
        //     fr.close();
        //     System.out.println("Da ghi vao file");
        // } catch (IOException ex) {
        //     System.out.println("Error writing to file: " + ex.getMessage());
        // }
            filewirter x = new filewirter();
            x.DocFile();
            x.show();

    }}

    

