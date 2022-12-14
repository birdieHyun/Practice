package standardofjava.chapter11;

import codesquadtest.coordinate.MakeRevolution;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

public class Ex20_11_4 {

    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {

        System.out.println("help 를 입력하면 도움말을 볼 수 있습니다");

        while (true) {
            System.out.println(">>");

            try {

                Scanner sc = new Scanner(System.in);
                String input = sc.next().trim();

                if ("".equals(input)) {
                    continue;
                }

                if (input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 보여줍니다");
                    System.out.println("Q - 프로그램을 종료");
                    System.out.println("history - 최근 입력한 명령어 " + MAX_SIZE + "개 보여줍니다");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;

                    save(input);

                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();

                    while (it.hasNext()) {
                        System.out.println(++i + "." + it.next());
                    }
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("Error");


            }

        }

    }

    public static void save(String input) {

        if (!"".equals(input)) {
            q.offer(input);
        }

        if (q.size() > MAX_SIZE) {
            q.remove();
        }
    }
}