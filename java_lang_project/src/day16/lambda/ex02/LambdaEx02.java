package day16.lambda.ex02;

interface Message {
    int doSomething();
}

class Person{
    public void greeting(Message msg){
        int su = msg.doSomething();
        System.out.println("Number is " + su);
    }
}

public class LambdaEx02 {

    public static void main(String[] args) {
        Person p = new Person();

        p.greeting(new Message() {
            @Override
            public int doSomething() {
                System.out.println("good morning");
                return 300;
            }
        });

        System.out.println();

        p.greeting(() -> {
            System.out.println("lambda : good morning");
            return 50;
        });
    }
}
