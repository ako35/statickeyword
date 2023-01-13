package statickeyword1;

public class Static03 {

    String isim;

    int id;

    static String okulIsmi;

    static int counter=0;

    public int setId(){
        counter++;
        return counter;
    }

    public Static03(String isim){
        this.isim=isim;
        this.id=setId();
    }

    public static void setOkulIsmi(String isim){
        okulIsmi=isim;
    }

    public void getStudentInfo(){
        System.out.println("Ogrenci id: "+id);
        System.out.println("Ogrenci ismi: "+isim);
        System.out.println("Okul ismi: "+okulIsmi);
    }

    public static void main(String[] args) {

        setOkulIsmi("Yildiz Okulu");
        Static03 s1=new Static03("Kadir Karatas");
        Static03 s2=new Static03("Ali Kocan");
        Static03 s3=new Static03("Fatma Okur");
        s1.getStudentInfo();

        System.out.println();

        s2.getStudentInfo();

        System.out.println();

        s3.getStudentInfo();
    }
}
