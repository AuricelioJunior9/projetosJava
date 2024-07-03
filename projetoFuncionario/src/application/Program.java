package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelDoTrabalhador;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entrar com nome do Departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Insira os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nível: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salário Base: ");
		double salarioBase = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador ,NivelDoTrabalhador.valueOf(nivelTrabalhador) ,salarioBase ,new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos para este trabalhador? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n ; i++) {
			System.out.println("Insira do contrato #" + i + " dados:");
			System.out.print("Data (DD/MM/YYYY) ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração(horas): ");
		    int horas = sc.nextInt();
		    ContratoHora contrato = new ContratoHora(dataContrato, valorPorHora, horas);
		    trabalhador.adicionarContrato(contrato); 
		}
		
		System.out.println();
		System.out.print("Insira mês e ano para calcular a renda (MM/YYYY): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0,2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
        System.out.println("Salário para " + mesAno + ": " + String.format("%.2f", trabalhador.salario(ano, mes)));
        
        sc.close();
	}

}
