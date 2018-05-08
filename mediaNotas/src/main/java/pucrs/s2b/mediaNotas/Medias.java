package pucrs.s2b.mediaNotas;

public class Medias {

	public static String calcular(double p1, double p2) {
		double nota = (p1 + p2) / 2.0;
		if (nota >= 7.0) {
			return "Aprovado";
		}else if (nota < 4.0) {
			return "Reprovado";
		} else {
			return "Em exame";
		}
	}

}
