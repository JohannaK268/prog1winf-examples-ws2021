import Prog1Tools.IOTools;

public class FirstClass
{

    public static void main(String[] args) {
        System.out.print("hello");
        System.out.println("hello");
        System.out.println("hello");
        int i = 5;
        int j = 5;

        i = 3+5;
        i = -5;
        j = +i;
        System.out.println("i is " + i + " and j is " + j);
        i = 3-5;
        i = 3*5;
        i=3/5;
        j=(3+5)*7+34+42-3+i;
        j=3%5;
        i = 123_456_789;
        System.out.println(i);
        System.out.println(j);
        System.out.println(3.0/5.0);
        System.out.println(i<=j);
        boolean b = i!=j;
        String s = "hello"+i;
        System.out.println(s+s);
        j = IOTools.readInt("eingabe (Integer):");

        // Wie sieht eine Speicheradresse aus?
        Object obj = new Object();
        System.out.println("Memory address of 'obj': " + obj);
    }

}
