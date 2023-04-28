package PhanSo;

import java.util.Scanner;

public class BaiTapPhanSo {
    int a;
    int b;
    int c;
    int d;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so 1 : ");
        a = sc.nextInt();
        System.out.print("Nhap mau so 1 : ");
        b = sc.nextInt();
        System.out.print("Nhap tu so 2: ");
        c = sc.nextInt();
        System.out.print("Nhap mau so 2: ");
        d = sc.nextInt();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void Xuat(){
        System.out.println("Phan so do la: " + a + "/" + b);
        System.out.println("Phan so do la: " + c + "/" + d);
    }
    public void NghichDaoPhanSO(){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Phan so nghich dao la: " + a + "/" + b);
    }

}
