import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.text.DecimalFormat;

public class DevSaudavel {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//arredondamento do valor
		DecimalFormat df = new DecimalFormat("#.00");
		
		data/hora atual
		LocalDateTime agora = LocalDateTime.now();
		// formatar a data
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String dataFormatada = formatterData.format(agora);
		// formatar a hora
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaFormatada = formatterHora.format(agora);
		

		

		//Compra finalizada, mostrando o carrinho final 
		tituloCarrinho();
		for (contador = 0; contador < 10; contador++) {
			if (carrinhoCompras[contador] != 0) {
				System.out.printf("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+(carrinhoCompras[contador] * preco[contador])+"\t    ♥\n");
				total += carrinhoCompras[contador] * preco[contador];
			}
		}
		linha(falso)
		System.out.print("\nVALOR DA COMPRA : %f",total);
		System.out.println("\n\nFormas de Pagamento : \nOpção [1] - Dinheiro á vista c/ 10% de desconto\nOpção [2] - Cartão á vista c/ 10% de acréscimo\nOpção [3] - Cartão em 2x c/ 15% de acréscimo\n\nDigite a opção de pagamento : ");
		opcao = ler.nextInt();
		linhaNota(verdadeiro);
		
		//opções de pagamento e emissão das nostas fiscais
		while (opcao >3 ou opcao <=0) {
			System.out.println("Opção inválida, escolha novamente: ");
			System.out.println("\n\nFormas de Pagamento : \nOpção [1] - Dinheiro á vista c/ 10% de desconto\nOpção [2] - Cartão á vista c/ 10% de acréscimo\nOpção [3] - Cartão em 2x c/ 15% de acréscimo\n\nDigite a opção de pagamento : ");
			opcao = ler.nextInt();
		}
		
		//Opção de pagamento 1 - a vista.
		if (opcao == 1) {
			for (contador = 0; contador < 10; contador++) {
				if (carrinhoCompras[contador] != 0) {
					System.out.println("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n");
				}
			}
			System.out.print("\n\nDinheiro à vista");
			System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
			System.out.println("10% de desconto : R$ "+df.format(total * 0.1));
			System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 0.9),"\n");
			System.out.print("Data: "+formatterData.format(agora)+"\t");
			System.out.print("Hora: "+formatterHora.format(agora));
			linhaNota(falso);
		}
		
		//Opção de pagamento 2 - a vista no catão.
		
		if (opcao == 2) {
			for (contador = 0; contador < 10; contador++) {
				if (carrinhoCompras[contador] != 0) {
					System.out.println("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n");
				}
			}
			System.out.print("\n\nCartão à vista");
			System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
			System.out.println("10% de acréscimo : R$ "+df.format(total * 0.1));
			System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 1.1),"\n");
			System.out.print("Data: "+formatterData.format(agora)+"\t");
			System.out.print("Hora: "+formatterHora.format(agora));
			linhaNota(falso);
		}
		
		//Opção de pagamento 3 - em 2X no cartão.
		
		else if (opcao == 3) {
			for (contador = 0; contador < 10; contador++) {
				if (carrinhoCompras[contador] != 0) {
					System.out.println("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n");
				}
			}
			System.out.print("\n\n2X no Cartão");
			System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
			System.out.println("15% de acréscimo : R$ "+df.format(total * 0.1));
			System.out.println("\nValor da parcela : R$ "+df.format((total * 1.15)/2),"\n");
			System.out.println("\nTOTAL DA COMPRA R$ " +df.format(total * 1.1),"\n");
			System.out.print("Data: "+formatterData.format(agora)+"\t");
			System.out.print("Hora: "+formatterHora.format(agora));
			linhaNota(falso);
		}
		
		//Zerando carrinho
		auxQuant=0					
		contador=0
		for (inteiro x = 0; x < 10; x++) {
			verificarRepeticao[x] = " ";
		}
		for (inteiro x = 0; x < 10; x++) {
			estoque[x] -= carrinhoCompras[x];
		}
		for (inteiro x = 0; x < 10; x++) {
			carrinhoCompras[x] = 0	;		
			total = 0.0;
		}
	}//chave do public static void main
	
	//retorno para o site.
	System.out.println("Deseja retornar para o site [S] / [N]: ");
	desejaVoltarParaSite = ler.next().toUpperCase().charAt(0);
}//chave do faça p/ entrar no site


//Mensagem para retorno no site
	
	while (desejaVoltarParaSite == 'S' ) {
		System.out.println("Agradecemos a visita !!!");
	}

	}
	
}
