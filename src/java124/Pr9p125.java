package java124;

import java.util.Scanner;

public class Pr9p125 {
    public static void main(String[] args) {
        //Напишете програма, която проверява дали дадена точка О (x, y) е вътре в окръжността К ((0,0), 5)
        //и е извън правоъгълника ((-1, 1), (5, 5).
        Scanner input = new Scanner(System.in);
        System.out.print("Въведете координата Х на точката М: ");
        int x = input.nextInt();
        System.out.print("Въведете координата Y на точката М: ");
        int y = input.nextInt();
        double c;
        int x1 = x;
        int y1 = y;
        c = x * x + y * y;
        System.out.println(c);
        c = Math.sqrt(c);
        System.out.println(c);
        System.out.print(c < 5 && !((x1 >= -1 && x1 <= 5) && (y1 >= 1 && y1 <= 5)) ? "Точката е в окръжността и извън правоъгълника" : "Точката не е в окръжността или е в правоъгълника");
        input.close();
    }

}
