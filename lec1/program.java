public class program {
    /*
     * here is comments
     * string 1 coment
     * string 2 comment
     * В терминале ввести java program.java
     */
    public static void main(String[] args) {
        System.out.println("bye world"); // here is comment
        String s = "sdfssd";
        System.out.println(s);

        int a = 10;
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(a);
        System.out.println(e);
        System.out.println(pi);

        char ch = '{';
        char ch1 = 123;
        System.out.println(ch);
        System.out.println(ch1);

        var v = 23.23;
        System.out.println(v);
        System.out.println(getType(v));
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

    
}


