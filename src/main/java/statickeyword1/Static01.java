package statickeyword1;

public class Static01 {

    String okulIsmi="Yildiz Koleji";
    String okulTelefonu="3122563635";
    String ogrenciIsim="Fatih";

    public void notStaticMethod(){
        System.out.println("Non static method");
    }

    public static void staticMethod(){
        System.out.println("Static method");
    }

    public static void main(String[] args) {

        Static01 st=new Static01();
        System.out.println(st.ogrenciIsim);
        System.out.println(st.okulIsmi);
        System.out.println(st.okulTelefonu);
        st.notStaticMethod();
        staticMethod();

    }
}
