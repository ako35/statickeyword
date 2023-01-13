package statickeyword1;

public class Static02 {

    static int x=1;

    int y=1;

    Static02(){
        x+=9;
        y++;
    }

    public static void main(String[] args) {

        Static02 sm1=new Static02();
        Static02 sm2=new Static02();

        System.out.println("-X "+sm1.x+"\n-Y "+sm2.y);

    }
}
