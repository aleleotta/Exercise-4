package exercise4;
import java.util.*;

public class exercise4 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in); //Declaración de scanner
			double grade1; //Declaración de variables
			double grade2;
			
			System.out.println("To calculate your grade average, you must introduce 2 grades. \nIntroduce your first grade: ");
			grade1 = sc.nextDouble(); //Input de nota 1
			System.out.println("Introduce your second grade: ");
			grade2 = sc.nextDouble(); //Input de nota 2
			System.out.println("Your grade average is: " + ((grade1 + grade2) / 2));
			sc.close(); //Cierre de scanner
		}
}