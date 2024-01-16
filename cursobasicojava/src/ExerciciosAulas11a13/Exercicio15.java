package ExerciciosAulas11a13;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quanto você recebe por hora trabalhada? ");
		double valorH = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou este mês? ");
		double horasMes = scan.nextDouble();
		
		double salarioBruto = valorH * horasMes;
		double inss = salarioBruto / 100 * 8;
		double contribuicaoSindical = salarioBruto / 100 * 5;
		double IR = salarioBruto / 100 * 11;
		double descontos = inss + contribuicaoSindical + IR;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salario Bruto = " + salarioBruto);
		System.out.println("INSS = " + inss);
		System.out.println("Sindicato = " + contribuicaoSindical);
		System.out.println("IR = " + IR);
		System.out.println("Descontos = " + descontos);
		System.out.println("Salario Liquido = " + salarioLiquido);
		
	}

}
