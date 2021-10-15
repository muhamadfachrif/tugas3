class nvidia {
    void introduce() {
        System.out.println("ini lah list Kartu grafis nvidia");

    }
}
class Gtx1050 extends nvidia {
    public String memory;
    public String bitrate;
    public String gbps;

    public String getMemory() {
        return memory;
    }

    public void setMemory(String Memory) {
        this.memory = Memory;
    }

    public String getBitrate() {
        return memory;
    }

    public void setBitrate(String Bitrate) {
        this.bitrate = Bitrate;
    }

    public String getGbps() {
        return gbps;
    }

    public void setGbps(String Gbps) {
        this.gbps = Gbps;
    }
}

class Gtx1080 extends nvidia {
    public String memory;
    public String bitrate;
    public String gbps;

    public String getMemory() {
        return memory;
    }

    public void setMemory(String Memory) {
        this.memory = Memory;
    }

    public String getBitrate() {
        return memory;
    }

    public void setBitrate(String Bitrate) {
        this.bitrate = Bitrate;
    }

    public String getGbps() {
        return gbps;
    }

    public void setGbps(String Gbps) {
        this.gbps = Gbps;
    }
}
class hasil {
    //nvdia mynvidia = new nvidia();
    //mynvidia.introduce();
     public static void main(String[] args) {
    System.out.println("ini lah spesifikasi yang ada di Gtx1050");
    Gtx1050 myGtx1050 = new Gtx1050();
    myGtx1050.setMemory("2 gigabyte");
    System.out.print("Ukuran Memory Vga Gtx1050" + myGtx1050.getMemory());

    Gtx1050 myGtx10502 = new Gtx1050();
    myGtx10502.setBitrate("128 bit");
    System.out.println("Ukuran bitrate Vga Gtx1050" + myGtx10502.getBitrate());
    
    Gtx1050 myGtx10503 = new Gtx1050();
    myGtx10503.setGbps("90 gigabyte per second");
    System.out.println("kecepatan visual yang di baca oleh Vga Gtx1050" + myGtx10503.getGbps());

    System.out.println("===========================================================");

    System.out.println("ini lah spesifikasi yang ada di Gtx1080");
    Gtx1080 myGtx1080 = new Gtx1080();
    myGtx1080.setMemory("11 gigabyte");
    System.out.println("Ukuran Memory Vga Gtx1080");

    Gtx1080 myGtx10802 = new Gtx1080();
    myGtx10802.setBitrate("192 bit");
    System.out.println("Ukuran bitrate Vga Gtx1080" + myGtx10802.getBitrate());
    
    Gtx1080 myGtx10803 = new Gtx1080();
    myGtx10803.setGbps("200 gigabyte per second");
    System.out.println("kecepatan visual yang di baca oleh Vga Gtx1080" + myGtx10803.getGbps());
    }
}