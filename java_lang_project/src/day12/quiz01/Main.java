package day12.quiz01;

import day11.collection.quiz01.Customers;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer,Video> videoList = new HashMap<Integer,Video>();

    public static void main(String[] args) {
        char input = ' ';
        while(input != 'q'){
            System.out.println("==== 비디오 관리 프로그램 ====");
            System.out.println("1: 추가 / 2: 삭제 / 3:전체 출력 / 4: 수정 / q: 종료");
            input = sc.next().charAt(0);

            switch (input){
                case '1' :
                    add();
                    break;
                case '2' :
                    del();
                    break;
                case '3' :
                    listUp();
                    break;
                case '4' :
                    edit();
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

    static void add(){
        int code = 0;
        while(true){    // 코드 중복 제거
            code = new Random().nextInt(200000) + 1;
            if(!videoList.containsKey(code)) break;
        }

        System.out.print("제목 입력 : ");
        String name = sc.next();

        System.out.print("장르 입력 : ");
        String category = sc.next();

        System.out.print("대여 여부(1:대여중) : ");
        boolean lend = sc.next().equals("1");

        String lendName;
        String lendDate;
        if(lend){
            System.out.print("대여자 이름 입력 : ");
            lendName = sc.next();
            System.out.print("대여 일자(년-월-일) : ");
            lendDate = sc.next();
        } else {
            lendName = "";
            lendDate = "";
        }
        Video video = new Video(name,category,lend, lendName, lendDate);
        videoList.put(code,video);
        System.out.println("비디오 추가 완료 (" + code + ")\n");
    }

    static void del(){
        System.out.print("삭제할 비디오 코드를 입력하세요 : ");
        int code = sc.nextInt();
        if(videoList.containsKey(code)){
            videoList.remove(code);
            System.out.println("비디오 삭제가 완료되었습니다.\n");
        }else{
            System.out.println("존재하지 않는 비디오입니다.\n");
        }
    }

    static void listUp(){
        Iterator it = videoList.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry map = (Map.Entry)it.next();
            Video video = (Video)map.getValue();
            System.out.println("비디오 코드 : " + map.getKey());
            System.out.println("비디오 제목 : " + video.getTitle());
            System.out.println("비디오 장르 : " + video.getCategory());
            System.out.println("대여 여부 : " + (video.isLend() ? "O" : "X"));
            if(video.isLend()){
                System.out.println("대여자 : " + video.getLendName());
                System.out.println("대여일자 : " + video.getLendDate());
            }
            System.out.println("==========================");
        }
        System.out.println();
    }

    static void edit(){
        System.out.print("수정할 비디오 코드를 입력하세요 : ");
        int code = sc.nextInt();
        if(videoList.containsKey(code)){
            Video video = videoList.get(code);
            System.out.print("제목 수정(" + video.getTitle() + ") : ");
            String name = sc.next();

            System.out.print("장르 수정(" + video.getCategory() + ") : ");
            String category = sc.next();

            System.out.print("대여 여부(1:대여중) : ");
            boolean lend = sc.next().equals("1");

            String lendName;
            String lendDate;
            if(lend){
                System.out.print("대여자 이름 입력 : ");
                lendName = sc.next();
                System.out.print("대여 일자(년-월-일) : ");
                lendDate = sc.next();
            } else {
                lendName = "";
                lendDate = "";
            }
            Video newVideo = new Video(name,category, lend, lendName, lendDate);
            videoList.put(code,newVideo);
            System.out.println("비디오 정보 수정이 완료되었습니다.\n");
        }else{
            System.out.println("존재하지 않는 비디오입니다.\n");
        }
    }
}
