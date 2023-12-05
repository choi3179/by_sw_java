package day11.collection.set;


import java.util.HashSet;
import java.util.Set;

class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[name= " + name + ", age= " + age + "]\n";
    }

    /*
    해시 코드를 이용해서 객체의 동일 여부를 비교하기 때문에
    hashCode 함수를 오버라이드 하여 새로운 형태로 재정의 한다.
     */
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    /*
    Set에서 중복여부를 equals 메소드로 비교한다.
    equals 메소드를 오버라이드 하여 재정의한 hashCode로 객체의 동일 여부를 비교한다.
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){      // Object 타입을 클래스 타입으로 변환 가능하다면
            Person tmp = (Person) obj;
            return (name.equals(tmp.name)) && (age == tmp.age);     //
        }
        return false;
    }
}
public class HashSet03 {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add("happy");
        set.add("happy");

        Person ps1 = new Person("aaa", 10);
        set.add(ps1);
        set.add(new Person("bbb", 10));
        set.add(new Person("bbb", 30));
        set.add(new Person("bbb", 10));
        set.add(new Person("bbb", 10));

        System.out.println(set);
    }
}
