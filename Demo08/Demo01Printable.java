package Demo08;

public class Demo01Printable {

    public static void printString(Printable p){
        p.print("Hello Wrold");
    }

    public static void main(String[] args) {
        printString((s)->{
            System.out.println(s);
        });

        printString(System.out::println);
    }
}
