import java.util.Scanner;

public class SoHoanHao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        sc.close();
        int sum = 1;
        for (int i = 2; i < Math.sqrt(n); i++){
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        if (sum == n && n != 1){
            System.out.println(n + " la so hoan hao");
        } else {
            System.out.println(n + " khong la so hoan hao");
        }
    }
}
