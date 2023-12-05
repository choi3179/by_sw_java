package day11.collection.quiz01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListQuiz01 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Customers> customersArrayList = new ArrayList<Customers>();

        char input = ' ';
        while(input != 'q'){
            System.out.println("==== 고객 리스트 프로그램 ====");
            System.out.println("1: 추가 / 2: 삭제 / 3:전체 출력 / 4: 수정 / q: 종료");
            input = sc.next().charAt(0);

            switch (input){
                case '1' :
                    add(customersArrayList);
                    break;
                case '2' :
                    del(customersArrayList);
                    break;
                case '3' :
                    listUp(customersArrayList);
                    break;
                case '4' :
                    edit(customersArrayList);
                    break;
                case 'q' :
                    break;
                default:
                    System.out.println("입력이 잘못 되었습니다.\n");
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    static void add(ArrayList<Customers> list){
        System.out.print("이름 입력 : ");
        String name = sc.next();
        if(isExist(list,name)){
            System.out.println("이미 존재하는 고객 이름입니다.\n");
            return;
        }
        System.out.print("주소 입력 : ");
        String address = sc.next();
        System.out.print("전화번호 입력 : ");
        String tel = sc.next();
        Customers customers = new Customers(name,address,tel);
        list.add(customers);
    }

    static void del(ArrayList<Customers> list){
        System.out.println("---- 고객 정보 삭제 ----");
        System.out.print("삭제할 고객 이름을 입력하세요 : ");
        String delName = sc.next();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().equals(delName)){
                list.remove(i);
                System.out.println("삭제가 완료되었습니다.\n");
                return;
            }
        }
        System.out.println("고객 이름이 존재하지 않습니다.\n");
    }

    static void listUp(ArrayList<Customers> list){
        System.out.println(list.size() + "명의 고객정보가 있습니다.");
        for(int i=0;i<list.size();i++){
            Customers cus = list.get(i);
            System.out.println("---- 고객 정보 ----");
            System.out.println("-> 이름 : " + cus.getName());
            System.out.println("-> 주소 : " + cus.getAddress());
            System.out.println("-> 전화번호 : " + cus.getTel());
            System.out.println("------------------");
        }
        System.out.println();
    }

    static void edit(ArrayList<Customers> list){
        System.out.println("---- 고객 정보 수정 ----");
        System.out.print("수정할 고객 이름을 입력하세요 : ");
        String delName = sc.next();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().equals(delName)){
                System.out.print("이름 입력 : ");
                String name = sc.next();
                if(isExist(list,name)){
                    System.out.println("이미 존재하는 고객 이름입니다.\n");
                    return;
                }
                System.out.print("주소 입력 : ");
                String address = sc.next();
                System.out.print("전화번호 입력 : ");
                String tel = sc.next();
                Customers customers = new Customers(name,address,tel);
                list.set(i,customers);
                System.out.println("수정이 완료되었습니다.\n");
                return;
            }
        }
        System.out.println("고객 이름이 존재하지 않습니다.\n");
    }

    static boolean isExist(ArrayList<Customers> list, String name){
        Iterator<Customers> it = list.iterator();
        while(it.hasNext()){
            if(it.next().getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
