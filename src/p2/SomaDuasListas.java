package p2;
import java.util.Arrays;
import java.util.Scanner;

public class SomaDuasListas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Nomes de classe sempre começam com letras maiusculas
		int n = scan.nextInt();
		int [] array1 = new int[n];
		int [] array2 = new int [n];
		
		for(int i = 0; i < array1.length; i++) {
			array1[i] = scan.nextInt();
		}
		
		for(int i = 0; i < array2.length; i++) {
			array2[i] = scan.nextInt();
		}
		
		for(int i = 0; i < array2.length; i++) {
			System.out.println();
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		
		System.out.println(n);
		scan.close();

	}

}
