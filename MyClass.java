import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Lista1 exercL1 = new Lista1();
        Lista2 exercL2 = new Lista2();

        while (true) {
        	
	        System.out.println("Digite a Lista a ser corrigida (1 ou 2): ");
	        int listaChoose = sc.nextInt();
	        outerloop:
	        while (true) {
		        if (listaChoose == 1) {
		        	exercL1.exerciciosL1(args);		        	
		    
		        	while (true) {
		        		System.out.println("Digite E para continuar nesta lista ou Q para voltar ao menu inicial: ");
			        	String decisao = sc.next();
			        	
			        	if (decisao.equalsIgnoreCase("Q")) {
			        		break outerloop;
			        	}else if(decisao.equalsIgnoreCase("E")) {
			        		System.out.println();
			        		break;
			        	}else {
			        		System.out.println("Decisao Invalida!");
			        		continue;
			        	}
			        	
		        	}
		        } else if(listaChoose == 2) {
		        	
		        	exercL2.exerciciosL2(args);
		        	
		        	while (true) {
		        		System.out.println("Digite E para continuar nesta lista ou Q para voltar ao menu inicial: ");
			        	String decisao = sc.next();
			        	
			        	if (decisao.equalsIgnoreCase("Q")) {
			        		break outerloop;
			        	}else if(decisao.equalsIgnoreCase("E")) {
			        		System.out.println();
			        		break;
			        	}else {
			        		System.out.println("Decisao Invalida!");
			        		continue;
			        	}
			        	
		        	}
		        } else {
		        	System.out.println("Escolha invalida");
		        	break outerloop;
		        }
	        }
	        
	    }
    }
}