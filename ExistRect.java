package step5;
import java.util.Scanner;

public class ExistRect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("��(x,y)�� ��ǥ�� �Է��ϼ���.");
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x >= 50 && x <= 100) {
			if (y >= 50 && y <= 100) {
				System.out.println("��(" + x + "," + y
						+ ")�� (50,50)�� (100,100)�� �簢�� ���� �ֽ��ϴ�.");
			}else{
				System.out.println("��(" + x + "," + y
						+ ")�� (50,50)�� (100,100)�� �簢�� ���� �����ϴ�.");
			}
		}else{
			System.out.println("��(" + x + "," + y
					+ ")�� (50,50)�� (100,100)�� �簢�� ���� �����ϴ�.");
		}
	}

}
