import java.util.Arrays;

public class overloading
{
    public static void main(String[] args){
        fun(67);
        fun("abcd");
        int ans = sum(54,65, 5458);
        System.out.println(ans);
        demo("ankur","abd","laptop");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static int sum(int a ,int b){
        return a+b;
    }
    static int sum(int a , int b ,int c){
        return a + b + c;
    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String name)
    {
        System.out.println(name);
    }
}
