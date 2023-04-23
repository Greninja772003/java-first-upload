public class passingexp {
    public static void main(String[] args) {
        String name = "ankur ";
        greet(name);
    }
    static void greet(String naam) //this new var namm is nothing but just a copy of var name in java reference point arn't exist'
//            when we change the var name to naam . the naam copy the value of name i.e it does print any new thing when we pass a value
//            this var naam is only applicable inside this funciton block you cant you this var outside of this function
    {
        System.out.println(naam);
    }
}
