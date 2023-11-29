package day07.oop.quiz01;

public class Score {
    String name;
    int kor;
    int eng;
    int math;
    int total;
    double avg;
    char grade;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        setTotal();
        setAvg();
        setGrade();
    }

    public Score(){

    }

    public void output(){
        System.out.println("*** "+ this.name + "님의 성적표 ***");
        System.out.println("국어 : " + this.kor + ", 영어 : " + this.eng + ", 전산 : " + this.math);
        System.out.print("총점 : " + this.total + ", ");
        System.out.printf("평균 : %.2f, ",this.avg);
        System.out.println("학점 : " + this.grade);
        System.out.println("====================");
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.kor + this.math + this.eng;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg() {
        this.avg = (double)this.total / 3;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade() {
        if(this.avg > 90){
            this.grade = 'A';
        }
        else if(this.avg > 80){
            this.grade = 'B';
        }
        else if(this.avg > 70){
            this.grade = 'C';
        }
        else if(this.avg > 60){
            this.grade = 'D';
        }
        else{
            this.grade = 'F';
        }
    }
}
