public class scope {
    public static void main(String[] args) {
        int a = 45;
        int b = 38;
        String name = "rahul";
        System.out.println(name);
        System.out.println("valur of a is:" +a);
        System.out.println("valur of b is:" +b);
        {
//        int a = 78; already initialized outside the block in the same method hence we can't initialize it again;'}
            a = 78;// reassign the origin ref var to some other value
            name = "ankur";
            int c = 99;
            System.out.println(name);
            System.out.println("valur of a is:" +a);
            System.out.println("valur of c is:" +c);
//        value initialised in this block will remain in this block
        }
        System.out.println(name);
        System.out.println("valur of a is:" +a);
        /* System.out.println(c);} cannot use outside the box yoo can check by yourselves */
    //scoping in for loops
        for (int i= 0; i<4 ; i++){
            System.out.println(i);
            int f =43; // you cant use/access initialize these var outside the for-loop
            int g = 48;
            a = 1999;
            System.out.println("valur of a is:" +a);// you cant re-initialize var from other code block, but you can update their value here
            System.out.println(f*g);
        }}
static void random(int marks){
        int num = 67;
    System.out.println(num);
    System.out.println(marks);
}}
