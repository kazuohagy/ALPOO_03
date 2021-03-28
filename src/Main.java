import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Funcionario> lista = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int rept = sc.nextInt();
		System.out.println("");
		
		for(int i =0; i<rept ; i++) {
			int n = i +1;
			System.out.println("Employee #" + n+":");
			System.out.print("Id: ");
			Integer id;
			id = sc.nextInt();
			while(hasId(lista,id)) {
				System.out.print("Digite outro numero:");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			String name;
			name = sc.next();
			System.out.print("Salary: ");
			Double salary;
			salary = sc.nextDouble();
			System.out.println("");
			
			lista.add(new Funcionario(id,name,salary));
			
		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int idIdentifica = sc.nextInt();
		Funcionario obj = lista.stream().filter(mario -> mario.getId() == idIdentifica).findFirst().orElse(null);
		

		//System.out.println(obj); FUNCIONA IMPRIMIU 3, LUIGI, 10 IMPRIMIU OS 3 ITENS DA LISTA .GET(1);
		System.out.println("");
		if(obj!=null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			obj.increaseSalary(percentage);
		}
		else {
			System.out.println("This id does not exist!");
		}
		System.out.println("");
		
		
		System.out.println("List of employees:");
		for(Funcionario ob : lista) {
			System.out.println(ob);
		}
		
		
		System.out.println(lista);
	}
	public static boolean hasId(List<Funcionario> lista, int id) {
		Funcionario obj =lista.stream().filter(mario -> mario.getId() == id).findFirst().orElse(null);
		return obj != null;
	}
}
