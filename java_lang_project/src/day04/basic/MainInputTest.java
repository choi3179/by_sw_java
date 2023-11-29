package day04.basic;

public class MainInputTest {
    public static void main(String[] args) {
        System.out.println("string, int = ");

        if(args.length <=0){
            System.out.println("데이터가 없습니다.");
            return;
        }

        String name = args[0];
        int su = Integer.parseInt(args[1]);     // String -> Int

        System.out.println(name);
        System.out.println(su);
    }
}
