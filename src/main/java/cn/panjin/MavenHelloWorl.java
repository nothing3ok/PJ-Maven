package cn.panjin;


public class MavenHelloWorl {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("wanmei");
    }
}
