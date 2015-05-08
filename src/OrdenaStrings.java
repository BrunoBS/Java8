import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import static java.util.Comparator.comparing;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("BRUNO");
		palavras.add("Bc");
		palavras.add("C");
		User u1 = new User("Bruno", 25);
		User u2 = new User("Carlos", 32);
		User u3 = new User("Tiago", 31);
		User u4 = new User("Zé", 23);

		List<User> user = User.getUsers();
		System.out.println("lista:");
		user.forEach(System.out::println);

		System.out.println("ordenado por idade:");
		user.sort(comparing(s->s.getIdade()));
		user.forEach(System.out::println);
		
		System.out.println("ordenado por nome:");
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		user.forEach(System.out::println);
		
		System.out.println("ordenado por nome method:");
		user.sort(Comparator.comparing(User::getNome).thenComparing(User::getIdade));
		user.forEach(System.out::println);
		
		
		System.out.println("ordenado por tamanho:");
		user.sort(Comparator.comparing(s->s.getNome().length()));
		user.forEach(System.out::println);
	}

}

class User {
	private String nome;
	private int idade;
	static List<User> users = new ArrayList<User>();

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

	public static List<User> getUsers() {
		return users;
		//return Collections.unmodifiableList(users);
	}

	public static void delete(User user) {
		users.remove(user);
	}

	@Override
	public String toString() {
		return nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}