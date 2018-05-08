package pucrs.s2b.mediaNotas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
    public void testFiveAndFiveGivesExam()
    {
		String expected = "Em exame";
        String actual = Medias.calcular(5.0,5.0);
        assertEquals(expected, actual);
    }
	
	@Test
	public void testSevenAndSevenGivesAproved() {
		String expected = "Aprovado";
		String actual = Medias.calcular(7.0,7.0);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThreeAndThreeGivesReproved() {
		String expected = "Reprovado";
		String actual = Medias.calcular(3.0, 3.0);
		assertEquals(expected, actual);
	}
}
