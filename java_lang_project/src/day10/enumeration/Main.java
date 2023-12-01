package day10.enumeration;

public class Main {
    public static void main(String[] args) {
        EnumTest enumTest1 = new EnumTest(Day.Monday);
        enumTest1.tellItLikeItIs();

        EnumTest enumTest2 = new EnumTest(Day.Friday);
        enumTest2.tellItLikeItIs();

        EnumTest enumTest3 = new EnumTest(Day.Saturday);
        enumTest3.tellItLikeItIs();
    }
}
