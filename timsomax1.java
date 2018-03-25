import java.util.Scanner;

public class timsomax1 {

	private static Scanner sc;

	public static void main(String[] args) {
		int a[] = new int[3];
		sc = new Scanner(System.in);
		int max1 = 0;
		for(int i = 0 ; i < 3 ; i++) {
			a[i] = sc.nextInt() ;
			if(i == 0) {
				max1 = a[0];
			} else if (a[i] > max1) {
				max1 = a[i];
			}
			System.out.println("Phan tu lon nhat la: " + max1);
		}
		
	}

}
