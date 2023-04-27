
import java.util.Scanner;
public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n1: ");
        int n1 = sc.nextInt();
        System.out.print("Nhap so nguyen n2: ");
        int n2 = sc.nextInt();
        int gcd = findGCD(n1, n2);
        int lcm = findLCM(n1, n2, gcd);
        System.out.println("Uoc chung long nhat la: " + gcd);
        System.out.println("Boi chung nho nhat la: " + lcm);
    }
    public static int findGCD(int a, int b){
        if(b==0) return a;
        return findGCD(b, a % b);
    }
    public static int findLCM(int a, int b, int gcd){
        return (a * b) / gcd;
    }
}
