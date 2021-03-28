 
public class Funcionario {
	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionario() {
		
	}
	public Funcionario(Integer id, String name,Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalaty(Double salary) {
		this.salary = salary;
	}
	public Double getSalary() {
		return salary;
	}
	public void increaseSalary(double percentage) {
		salary = salary + (salary *percentage)/100;
	}
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
}
