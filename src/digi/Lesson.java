package digi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());


        if (a > b && a > c) {                     //21
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        if (a < b && a < c) {                      //22
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        boolean bool;

        if (a == 1 || b == 1 || c == 1) {            //23
            bool = true;
            System.out.println(bool);
        } else {
            bool = false;
            System.out.println(bool);
        }


        boolean bool1;

        if (a == 2 && b == 2 || a == 2 && c == 2 || b == 2 && c == 2) {          //24
            bool1 = true;
            System.out.println(bool1);
        } else {
            bool1 = false;
            System.out.println(bool1);
        }

        if (a + b >= c || a + c >= b || b + c >= a) {        //25
            System.out.println("y = 1");
        }else {
            System.out.println("y = 2");
        }

        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {         //26
            System.out.println("1");
        } else {
            System.out.println("2");
        }


        int x;                             //29
        if (a > b) {
            x = a;
            a = b;
            b = x;
        } else a = a;
        if (b > c) {
            x = b;
            b = c;
            c = x;
        } else b = b;
        if (a > b) {
            x = a;
            a = b;
            b = x;
        } else c = c;

        System.out.println(a + " " + b + " " + c);


        int z;        //30
        if (a < b) {
            z = a;
            a = b;
            b = z;
        } else a = a;
        if (b < c) {
            z = b;
            b = c;
            c = z;
        } else b = b;
        if (a < b) {
            z = a;
            a = b;
            b = z;
        } else c = c;

        System.out.println(a + " " + b + " " + c);

/*
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        if (a > b && a > c && a > d) {  //31
            System.out.println(a);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c > a && c > b && c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }


        if (a < b && a < c && a < d) {  //32
            System.out.println(a);
        } else if (b < a && b < c && b < d) {
            System.out.println(b);
        } else if (c < a && c < b && c < d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }


        boolean bool2;                         //33
        if (a == 1 || b == 1 || c == 1 || d == 1) {
            bool2 = true;
            System.out.println(bool2);
        } else {
            bool2 = false;
            System.out.println(bool2);
        }


        boolean bool3;                     //34
        if (a + b == c + d || a + c == b + d || a + d == b + c) {
            bool3 = true;
            System.out.println(bool3);
        } else {
            bool3 = false;
            System.out.println(bool3);
        }


        boolean bool4;                     //35
        if (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c) {
            bool4 = true;
            System.out.println(bool4);

        } else {
            bool4 = false;
            System.out.println(bool4);
        }


        if (a % 2 != 0 && b % 2 != 0 || c % 2 != 0 && d % 2 != 0 || a % 2 != 0 && d % 2 != 0 || b % 2 != 0 && c % 2 != 0) {    //36
            System.out.println("1");
        } else {
            System.out.println("2");
        }

 */




    }
}

