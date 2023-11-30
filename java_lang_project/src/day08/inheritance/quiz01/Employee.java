package day08.inheritance.quiz01;

public class Employee {

    private String name;
    private int empno;
    private String dept;
    private String tel;
    private String lev;

    public Employee(String name, int empno, String dept, String tel, String lev) {
        this.name = name;
        this.empno = empno;
        this.dept = dept;
        this.tel = tel;
        this.lev = lev;
    }

    public void disp(){
        System.out.println("이름 : " + name);
        System.out.println("사번 : " + empno);
        System.out.println("부서 : " + dept);
        System.out.println("전화번호 : " + tel);
        System.out.println("직급 : " + lev);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLev() {
        return lev;
    }

    public void setLev(String lev) {
        this.lev = lev;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
