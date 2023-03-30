package br.com.calculos;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.classes.Funcionario;

class ComissaoTest {

	@Test
	void calculoComissao() {
		Comissao calcComissao = new Comissao();

		BigDecimal comissao = calcComissao.calcularComissao(new Funcionario("Tiago", LocalDate.now(), new BigDecimal("25000")));
		assertEquals(new BigDecimal("0.00"), comissao);
	}
	
	@Test
	void calculoComissaoMaior() {
		Comissao calcComissao = new Comissao();
		
		BigDecimal comissao = calcComissao.calcularComissao(new Funcionario("Tiago", LocalDate.now(), new BigDecimal("10000")));
		assertEquals(new BigDecimal("1000.00"), comissao);
	}
}
