package javaBookFrog.java104;

public class Pr10p104 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
    }
}
