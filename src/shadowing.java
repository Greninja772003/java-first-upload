public class shadowing {
    static int x = 654;// this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);// =654
        int x ;// the class var at line 2 is shadowed by this
//        System.out.println(x);scope will actually begin when value is initialized
        x = 38;
        System.out.println(x);//=84
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
