package Exercicio01;
import java.util.Scanner;

class Soma {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Primeiro número:");
		int x = sc.nextInt();
		System.out.println("Segundo número:");
		int y = sc.nextInt();
		int soma = x+y;
		System.out.println("Soma:");
		System.out.println(soma);
		sc.close();	}
}
