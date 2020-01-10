package day02;

import java.util.Arrays;

public class Demo01Arry {
    public static void main(String[] args) {
        Person[] arr={new Person("周杰",20),new Person("狗屎",19),new Person("小东西",2)};

//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        //使用lamdba
        Arrays.sort(arr,(Person o1, Person o2)->{return o1.getAge()-o2.getAge();});


        for (Person p : arr) {
            System.out.println(p);
            
        }
    }
}
