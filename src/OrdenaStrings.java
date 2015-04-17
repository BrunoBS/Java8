import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenaStrings {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("BRUNO");
		palavras.add("Bc");
		palavras.add("C");
		User u1 = new User("Bruno", 25);
		User u2 = new User("Carlos", 32);
		User u3 = new User("Tiago", 31);
		User u4 = new User("Zé", 27);
		
		List<User> user = User.getUsers().stream().filter(s->s.getNome().startsWith("") && s.getIdade()<30).collect(Collectors.toList());
		
		user.forEach(s -> System.out.println(s.getNome()));
	
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println("palavras> ");
		palavras.forEach(s -> System.out.println(s));

		List<String> filtros  =palavras.stream().filter(s->s.length()<2).collect(Collectors.toList());
		
		System.out.println("Filtro> ");
		filtros.forEach(s -> System.out.println(s));
	}

}

class User{
	private String nome;
	private int idade;
	static List<User> users  = new  ArrayList<User>();
	
	
	public User(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		users.add(this);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public static  List<User> getUsers() {
		return Collections.unmodifiableList(users);
	}
	
	
	
	
	
}