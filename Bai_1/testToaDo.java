package Bai_1;
import java.util.Scanner;

public class testToaDo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ToaDo toadoA = new ToaDo();
		System.out.print("Nhap ten toa do: ");
		String name = sc.next();
		System.out.print("Nhap toa do x: ");
		float x = sc.nextFloat();
		System.out.print("Nhap toa do y: ");
		float y = sc.nextFloat();
		toadoA.setName(name);
		toadoA.setX(x);
		toadoA.setY(y);
		System.out.print(toadoA.toString());
		sc.close();
	}
}
