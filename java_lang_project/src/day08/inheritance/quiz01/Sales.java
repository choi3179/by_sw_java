package day08.inheritance.quiz01;

public class Sales extends Regular{

    private double comm = 0;

    public Sales(String name, int empno, String dept, String tel, String lev, double sal) {
        super(name, empno, dept, tel, lev, sal);
        setComm();
        setSal(comm);
    }

    public void disp(){
        super.disp();
        System.out.println("커미션 : " + comm);
    }

    public double getComm() {
        return comm;
    }

    public void setComm() {
        if(getDept().equals("영업")){
            comm = getSal() * 0.1;
        }
    }

}
