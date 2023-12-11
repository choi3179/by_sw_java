package day16.lambda.ex03;

interface Message {
    int doSomething(int x, int y);
}

class Person{
    public void greeting(Message msg){
        int su = msg.doSomething(1,2);
        System.out.println("Number is " + su);
    }
}

public class LambdaEx03 {

    public static void main(String[] args) {
        Person p = new Person();

        p.greeting(new Message() {
            @Override
            public int doSomething(int x, int y) {
                System.out.println("good morning");
                return x+y;
            }
        });

        System.out.println();

        p.greeting((x,y) -> {
            System.out.println("lambda : good morning");
            return x+y;
        });
    }
}
