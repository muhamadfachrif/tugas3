//package pertemuan5;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) { 
        main m = new main();
        System.out.println("Fetching  Gtx 1050");
        m.generateGtx1050("D:/codingan java/Pertemuan 7/bin/Gtx 1050.txt");
              
        System.out.println();
        System.out.println("=========================================");
        System.out.println();
        System.out.println("Fetching Gtx1080 ");
        m.generateGtx1080("D:/codingan java/Pertemuan 7/bin/Gtx1080.txt");
        }

    public void generateGtx1050(String path){

        File file = new File(path);
        FileInputStream fis = null; 
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<Gtx1050> listkartugrafisList= new ArrayList<Gtx1050>();

        try {
            fis = new FileInputStream(file); 
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
            //System.out.println("File "+file.getName()+ "ditemukan");
            while(dis.available() != 0){               
                String line = dis.readLine();
				String[] data = line.split(",");
                
                Gtx1050 i = new Gtx1050();
                i.setMemory(data[0]);               
                i.setBitrate(data[1]);
                i.setGbps(data[2]);
                double Harga = Double.parseDouble(data[3]);
                
                

                listkartugrafisList.add(i); 
             }

            } catch (IOException ex) {//error handling
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+ex.getMessage());
            }


        //memanggil keluaran array
        int Number = 1; 
        for(Gtx1050 i : listkartugrafisList){
            
            System.out.println("=======["+Number+"]=========");
            System.out.println("Memory: "+i.getMemory());
            System.out.println("Bitrate: "+i.getBitrate());
            System.out.println("Gbps: "+i.getGbps());
            Number++;       
        }
    }

    public void generateGtx1080(String path){

        File file = new File(path);
        FileInputStream fis = null; 
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<Gtx1080> listkartugrafis = new ArrayList<Gtx1080>();

        try {
            fis = new FileInputStream(file); 
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
            //System.out.println("File "+file.getName()+ "ditemukan");
            while(dis.available() != 0){               
                String line = dis.readLine();
				String[] data = line.split(",");
                
                Gtx1080 a = new Gtx1080();
                a.setMemory(data[0]);
                a.setBitrate(data[1]);
                a.setGbps(data[2]);
                double Harga = Double.parseDouble(data[3]);
               


                listkartugrafis.add(a); 
            }      
        }catch (IOException ex) {//error handling
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+ex.getMessage());
        }

        //memanggil keluaran array
        int Number = 1; 
        for(Gtx1080 a : listkartugrafis){
            
            System.out.println("=======["+Number+"]=========");
            System.out.println("Memory: "+a.getMemory());
            System.out.println("Bitrate: "+a.getBitrate());
            System.out.println("Gbps: "+a.getGbps());
            Number++;              

 }
    }
}

