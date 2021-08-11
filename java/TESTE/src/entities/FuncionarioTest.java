package entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class FuncionarioTest {
	
	@Test
	void testCalcSalario() {
		//cenario
		Funcionario func1 = new Terceiro("001",10,10.00,1);
		double salario;
		
		//Execução
		salario = func1.calcSalario();
		
		
		Assert.assertEquals(salario, 101.00);
		
	}
	
	@Test
	void testSalarioNegativo() {
		//cenario
				Funcionario func1 = new Terceiro("001",-10,10.00,1);
				double salario;
				
				//Execução
				salario = func1.calcSalario();
				
				//Verificação
				Assert.assertEquals(salario, 1.00);
	}

}
