package day16.lambda.ex01;

interface Message {
    void doSomething();
}

class Person{
    public void greeting(Message msg){
        msg.doSomething();
    }
}

public class LambdaEx01 {

    public static void main(String[] args) {
        Person p = new Person();

        p.greeting(new Message() {
            @Override
            public void doSomething() {
                System.out.println("good morning");
            }
        });

        System.out.println();

        p.greeting(() -> {
            System.out.println("lambda : good morning");
        });
    }
}
