import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		super();
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Pyton", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		 cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		 cursos.forEach(c-> System.out.println(c.getNome() + " - " +
		 c.getAlunos()));
		
		 cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c->
		 System.out.println(c.getNome() + " - " + c.getAlunos()));
		 Stream<String > nomes= cursos.stream().map(Curso::getNome);
		 nomes.forEach(c->System.out.println(c));

		 cursos.stream()
		 .filter(c -> c.getAlunos() > 50)
		 .map(Curso::getAlunos)
		 .forEach(System.out::println);

		
		OptionalDouble media = cursos.stream().mapToInt(Curso::getAlunos).average();
		
		
		List<Curso> cursosFiltrado = cursos.stream().filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toList());
		
		 cursosFiltrado.forEach(c->System.out.println(c.getNome()+ " tem " + c.getAlunos()+ " alunos"));
		 
		 
		
		

	}
}
