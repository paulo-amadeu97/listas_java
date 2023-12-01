import java.util.ArrayList;
import java.util.Scanner;
public class FuncoesL2 {

	public static double somar(double a, double b) {
		double result = a + b;
		return result;
	}
	public static double media(int n) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> numList = new ArrayList<Double>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite o valor" + i + ": ");
			double num = sc.nextDouble();
			numList.add(num);
		}
		double mediaList = numList.stream().mapToDouble(Double::doubleValue).sum() / n;
		return mediaList;
	}
	public static double cToF(double c) {
		double tempF = c*9/5+32;
		
		return tempF;
	}
	
	public static int contaVogal(String txt) {
			char[] lista = txt.toCharArray();
			int numVogal =0;
			
			for (int i=0; i < lista.length; i++) {
				char letra = Character.toLowerCase(lista[i]);
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
					numVogal++;
			}
		}
			return numVogal;
	}
	
	public static void soma(double num) {
        System.out.println("Tabuada da Soma:");
        for (int i=1; i<=10; i++) {
            System.out.println(i + "+" + num + "=" + (num+i));
        }
    }
    
    public static void subtracao(double num) {
        System.out.println("Tabuada da Subtracao:");
        for (int i=1; i<=10; i++) {
            System.out.println(i + "-" + num + "=" + (num-i));
        }
    }
    
    public static void multiplicacao(double num) {
        System.out.println("Tabuada da Subtracao:");
        for (int i=1; i<=10; i++) {
            System.out.println(i + "x" + num + "=" + (num*i));
        }
    }
    
    public static void divisao(double num) {
        System.out.println("Tabuada da Subtracao:");
        for (int i=1; i<=10; i++) {
            System.out.println(i + "/" + num + "=" + String.format("%.2f", num/i));
        }
    }

}
