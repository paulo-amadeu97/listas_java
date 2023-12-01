import java.util.Scanner;

public class Lista2 {
	
	public static void exerciciosL2(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Digite o número do exercicio: ");
		int exercicio = sc1.nextInt();
		
		switch(exercicio) {
		
		case 1:
			exercicio1();
			System.out.println();
			break;
			
		case 2:
			exercicio2();
			System.out.println();
			break;
			
		case 3:
			exercicio3();
			System.out.println();
			break;
			
		case 4:
			exercicio4();
			System.out.println();
			break;
			
		case 5:
			exercicio5();
			System.out.println();
			break;
			
		case 6:
			exercicio6();
			System.out.println();
			break;
			
		default:
			System.out.println("Valor invalido, o nuero deve estar entre 1 e 6.");
			System.out.println();
			break;
		}
	}


	public static void exercicio1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite outro numero: ");
		double num2 = sc.nextDouble();
		
		System.out.println();
		
		double soma = FuncoesL2.somar(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + soma);
	}
	
	public static void exercicio2() {
		double media = FuncoesL2.media(3);
			
		System.out.println("A média dos numeros eh: " + media);
	}
	
	public static void exercicio3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor de temperatura(°C): ");
		double tempC = sc.nextDouble();
		
		double tempF = FuncoesL2.cToF(tempC);
		System.out.println(tempC + "°C = " + tempF + "°F");
	}
	
	public static void exercicio4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva qualquer coisa: ");
		String texto = sc.next();
		
		int nVogal = FuncoesL2.contaVogal(texto);
		System.out.println("O texto digitado contem " + nVogal + " vogais.");
	}
	
	public static void exercicio5() {
		Scanner sc = new Scanner(System.in);
		Lista2 tabuada = new Lista2();
		  
		System.out.println("Digite um numero: ");
		double valor = sc.nextDouble();
		  
		FuncoesL2.soma(valor);
		System.out.println();
		  
		FuncoesL2.subtracao(valor);
		System.out.println();
		  
		FuncoesL2.multiplicacao(valor);
		System.out.println();
		  
		FuncoesL2.divisao(valor);
		System.out.println();
	}
	
	public static void exercicio6() {
		System.out.println("Tudo isso eh o exercicio 6.");
		
	}

}
