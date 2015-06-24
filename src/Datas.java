import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		System.out.println(hoje.format(formatador));
		

//		LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
//		Period periodo = Period.between(hoje, futuro);
//
//		System.out.println(periodo.getYears());
//		System.out.println(periodo.getMonths());
//		System.out.println(periodo.getDays());
//		LocalDate proximaOlimpiadas = olimpiada.plusYears(4);
//		System.err.println(proximaOlimpiadas);
//		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.getDefault());
//		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		System.err.println(proximaOlimpiadas.format(formatador));

//		LocalDateTime agora = LocalDateTime.now();
//		System.err.println(agora.format(formatadorComHoras));
	}

}
