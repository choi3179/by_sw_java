package day10.enumeration;

public class EnumTest {
    Day day;

    EnumTest(Day day){
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day){
            case Monday:
                System.out.println("Monday so bad");
                break;
            case Friday:
                System.out.println("Friday is better");
                break;
            case Saturday:
                System.out.println("Saturday is the best");
                break;
            default:
                System.out.println("so-so");
                break;
        }
    }
}
