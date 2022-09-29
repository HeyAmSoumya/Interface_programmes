package Interface;

public class son implements father,mother {
    son(){
        System.out.println("son");
    }
    public void test(){
        System.out.println("Father and mother");
    }

    public static void main(String[] args) {
        son s1 =new son();
        s1.test();
    }
}
