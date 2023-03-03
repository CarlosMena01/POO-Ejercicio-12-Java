package Ejercicio12;
import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
		/*	Declaramos las variables	*/
		double horasTrabajadas, porcentajeRetencion, valorHora, salarioBruto, salarioNeto;
		
		/*	Leemos las entradas	*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese horas trabajadas: ");
		
		/*	Asignamos los valores según los cálculos correspondientes	*/
		horasTrabajadas = sc.nextDouble();
		valorHora = 5000;
		porcentajeRetencion = 12.5;
		salarioBruto = valorHora * horasTrabajadas;
		salarioNeto = salarioBruto*(100 - porcentajeRetencion)/100;
		
		/*	Imprimimos la respuesta	*/
		System.out.println("El salario bruto es: $" + salarioBruto);
		System.out.println("La retención en fuente es: " + porcentajeRetencion + "%");
		System.out.println("El salario neto es: $" + salarioNeto);
		
		/*	Cerramos el scanner	*/
		sc.close();
	}
}
