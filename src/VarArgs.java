import java.util.Arrays;

public class VarArgs
{
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,9,45,6,513,5154,654,6584,64,65);
        multiple("g","r", "hello");//var length args always use later for understanding position and value of variables
//        System.out.println(a + b);
    }
    static  void multiple(String ...v){
        System.out.println(2 + 5);
        System.out.println(Arrays.toString(v));

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
