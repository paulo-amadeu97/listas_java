import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
public class Lista1 {

	public static void exerciciosL1(String[] args) {
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
			
		case 7:
			exercicio7();
			System.out.println();
			break;
			
		case 8:
			exercicio8();
			System.out.println();
			break;
			
		case 9:
			exercicio9();
			System.out.println();
			break;
		
		default:
			System.out.println("Valor invalido, o nuero deve estar entre 1 e 9.");
			System.out.println();
			break;
		}

	}

	public static void exercicio1() {
		Scanner input = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        int anoAtual = c.get(Calendar.YEAR);

        System.out.println("Digite o ano que você nasceu: ");
        int anoNascimento = input.nextInt();

        System.out.println("Sua idade é " + (anoAtual - anoNascimento));
        
	}
	
	public static void exercicio2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Double num1 = sc.nextDouble();
        System.out.println("Digite outro número: ");
        Double num2 = sc.nextDouble();

        System.out.println("Digite um operador(+,-,*,/): ");
        String operador = sc.next();
        
        if (operador.equals("+")) {
        	System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
        	
        }else if(operador.equals("-")) {
        	System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
        	
        }else if(operador.equals("*")) {
        	System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
        	
        }else if(operador.equals("/")) {
        	System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
        	
        }
    }
	
	public static void exercicio3() {
        String primoOuNao = " é primo!";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primoOuNao = " não é primo!";
                break;
            }
        }

        System.out.println(num + primoOuNao);
    }
	
	public static void exercicio4() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		String status;
		for (int i=1; i<=3; i++) {
			System.out.println("Digite a nota da prova " + i + ": ");
			Double nota = sc.nextDouble();
			notas.add(nota);
		}
		double media = notas.stream().mapToDouble(Double::doubleValue).sum() / 3;
		System.out.println("A media é " + media);
		
		if (media >= 7) {
			status = "APROVADO";

		}else if(media >= 5) {
			status = "EXAME";
			
		}else {
			status = "REPROVADO";
			
		}
		
		System.out.println("Status: " + status);
	}
	
	public static void exercicio5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double num1 = sc.nextDouble();

		System.out.println();
		System.out.println("Tabuada da soma para o valor "+ num1);
		for (int i=1; i<=10; i++) {
			System.out.println(num1 + "+" + i + "=" + (num1+i));
		}
		
		System.out.println();
		System.out.println("Tabuada da subtração para o valor "+ num1);
		for (int i=1; i<=10; i++) {
			System.out.println(num1 + "-" + i + "=" + (num1-i));
		}
		
		System.out.println();
		System.out.println("Tabuada da multiplicacao para o valor "+ num1);
		for (int i=1; i<=10; i++) {
			System.out.println(num1 + "x" + i + "=" + (num1*i));
		}
		
		System.out.println();
		System.out.println("Tabuada da divisao para o valor "+ num1);
		for (int i=1; i<=10; i++) {
			System.out.println(num1 + "/" + i + "=" + (num1/i));
		}
		System.out.println();
		System.out.println("Fim da Tabuada!");
	}
	
	public static void exercicio6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor de temperatura(Celcius): ");
		Double tempC = sc.nextDouble();
		
		Double tempF = tempC * 9 / 5 + 32;
		
		System.out.println(tempC + "°C = " + tempF + "°F");
		
	}
	public static void exercicio7() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> numeros = new ArrayList<Double>();

		for (int i=1; i<=5; i++) {
			System.out.println("Digite o valor" + i + ": ");
			Double num = sc.nextDouble();
			numeros.add(num);
	}
		double soma = numeros.stream().mapToDouble(Double::doubleValue).sum();
		double media = soma / 5;
		
		System.out.println("A soma dos numeros eh " + soma +  " e sua media eh " + media);
	}
	
	public static void exercicio8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do emprestimo: ");
		double valor = sc.nextDouble();
		
		System.out.println("Digite a taxa anual(%): ");
		double taxa = sc.nextDouble();
		
		System.out.println("Digite o tempo em anos: ");
		double tempo = sc.nextDouble();
	
		double valorTotal = valor * (taxa/100) * tempo + valor;
		
		System.out.println("O valor total a pagar será: " + valorTotal);
	}
	
	public static void exercicio9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua massa(Kg): ");
		double massa = sc.nextDouble();
		
		System.out.println("Digite sua altura(cm): ");
		double altura = sc.nextDouble();
		
		double imc = massa / ((altura*altura)/10000);
		System.out.println("Seu IMC é: " + imc);
	}
}
