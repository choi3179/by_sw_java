package day18.jdbc.crud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch;

        GiftDB giftDB = new GiftDB();
        int gno,g_start,g_end;
        String gname;


        while(true){
            display();
            ch = br.readLine().charAt(0);

            switch (ch){
                case '1':
                    giftDB.selectAll();
                    break;
                case '2':
                    System.out.print("조회할 GNO 입력 : ");
                    giftDB.selectByGno(Integer.parseInt(br.readLine()));
                    break;
                case '3':
                    System.out.print("갱신할 GNO 입력 : ");
                    gno = Integer.parseInt(br.readLine());
                    System.out.print("GNAME 입력 : ");
                    gname = br.readLine();
                    System.out.print("G_START 입력 : ");
                    g_start = Integer.parseInt(br.readLine());
                    System.out.print("G_END 입력 : ");
                    g_end = Integer.parseInt(br.readLine());
                    giftDB.update(gno,gname,g_start,g_end);
                    break;
                case '4':
                    System.out.print("삭제할 GNO 입력 : ");
                    giftDB.deleteByGno(Integer.parseInt(br.readLine()));
                    break;
                case '5':
                    System.out.print("추가할 GNO 입력 : ");
                    gno = Integer.parseInt(br.readLine());
                    System.out.print("GNAME 입력 : ");
                    gname = br.readLine();
                    System.out.print("G_START 입력 : ");
                    g_start = Integer.parseInt(br.readLine());
                    System.out.print("G_END 입력 : ");
                    g_end = Integer.parseInt(br.readLine());
                    giftDB.insert(gno,gname,g_start,g_end);
                    break;
                case '6':
                    giftDB.disconnect();
                    break;
                default:
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }
        }

    }

    public static void display() {
        System.out.println("----- GIFT Table DML -----");
        System.out.println("1: 전체 조회 / 2: gno 조회 / 3: 갱신 / 4: 삭제 / 5: 삽입 / 6: 종료");
    }
}
