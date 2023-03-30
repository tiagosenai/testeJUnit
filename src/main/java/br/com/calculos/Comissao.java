package br.com.calculos;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.classes.Funcionario;

public class Comissao {

	public BigDecimal calcularComissao(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.2"));
		if (valor.compareTo(new BigDecimal("2000")) > 0) {
			valor = BigDecimal.ZERO;
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
