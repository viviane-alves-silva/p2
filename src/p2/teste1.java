package p2;

import java.util.ArrayList;
import java.util.Arrays;

public class teste1 {
	public static void main(String [] args) {
		System.out.println("Bom dia");
		String argumento = Arrays.toString(args);
		System.out.println(argumento);
		System.out.println(args [0]);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
