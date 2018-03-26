import java.util.Scanner;
public class tongcacso {
	public static void main(String[] args) {
	    int n, a, tong = 0;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhap so: ");
	    n = scanner.nextInt();
	         
	    while (n > 0) {
	        a = n % 10;
	        n = n / 10;
	        tong += a;
	    }
	         
	    System.out.println("Tong cac chu so = " + tong);
	}
}
