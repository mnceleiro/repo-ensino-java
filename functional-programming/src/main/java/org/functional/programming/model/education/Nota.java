package org.functional.programming.model.education;

public enum Nota {
	SINEVALUAR(-1),
	
	UNO(1),
	DOS(2),
	TRES(3),
	CUATRO(4),
	CINCO(5),
	SEIS(6),
	SIETE(7),
	OCHO(8),
	NUEVE(9),
	DIEZ(10);

	private final int valorNota;
	
	Nota(int valorNota) {
		this.valorNota = valorNota;
	}

	public int getValorNota() {
		return valorNota;
	}
}
