package Voto;

public class CalculaPorcentagens {
	private int total_eleitores = 1000;
	private int validos = 800;
	private int votos_brancos = 150;
	private int nulos = 50;

	public double votos_total_eleitores() {
		return (validos + votos_brancos + nulos) / total_eleitores * 100;
	}

	public double votos_valido_eleitores() {
		return (((double) validos) / total_eleitores) * 100;
	}

	public double votos_brancos_eleitores() {
		return (((double)votos_brancos) / total_eleitores) * 100;
	}

	public double votos_nulos_eleitores() {
		return (((double)nulos) / total_eleitores) * 100;
	}
}
