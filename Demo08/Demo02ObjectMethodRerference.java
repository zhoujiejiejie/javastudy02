package Demo08;

public class Demo02ObjectMethodRerference {
    public static void printString(Printable p){
        p.print("Hello");

    }

    public static void main(String[] args) {
        printString((s)->{
            MethodRerObict m=new MethodRerObict();
            m.printUpCaseString(s);
            System.out.println(s);
        });


        MethodRerObict obj=new MethodRerObict();
        printString(obj::printUpCaseString);
    }
}
