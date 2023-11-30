package day08.inheritance.quiz01;

public class Regular extends Employee{
    private double sal = 0;

    public Regular(String name, int empno, String dept, String tel, String lev, double sal) {
        super(name, empno, dept, tel, lev);
        this.sal = sal;
    }

    public void disp(){
        super.disp();
        System.out.println("급여 : " + sal);
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double comm) {
        this.sal= sal + comm;
    }

}
