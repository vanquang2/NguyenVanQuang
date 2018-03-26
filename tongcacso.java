import java.util.Scanner;
public class tongcacso {
	public static void main(String[] args) {
	    int n, soDu, tong = 0;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhap so: ");
	    n = scanner.nextInt();
	         
	    while (n > 0) {
	        soDu = n % 99;
	        n = n / 99;
	        tong += soDu;
	    }
	         
	    System.out.println("Tong cac chu so = " + tong);
	}
}