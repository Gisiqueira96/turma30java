import java.text.DecimalFormat;

public class teste {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.00");
		
	
	System.out.println("9% de ICMS : R$ "+df.format(126.568 * 0.09));
	
	
	/*
	 * // data/hora atual
			LocalDateTime agora = LocalDateTime.now();
			// formatar a data
			DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
			String dataFormatada = formatterData.format(agora);
			// formatar a hora
			DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
			String horaFormatada = formatterHora.format(agora);
	 */
	}
}
