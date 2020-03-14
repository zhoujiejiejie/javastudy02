package Java基础加强;

public class Persion {
    private String name;
    private int age;


    public String a;
    protected String b;
     String c;
    private String d;


    public Persion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;


    }

    public void eat(){
        System.out.println("eat.....");
    }

    public static String eat1(String s,String b){
        return "吃需要"+s+b;

    }
}
