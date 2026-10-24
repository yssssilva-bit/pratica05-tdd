package com.gqs.aula.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotaTest {
    // os testes vêm aqui
    @Test
    void deveSomarAsTresNotas() {
        CalculadoraNota calc = new CalculadoraNota();
        double resultado = calc.calcularNotaFinal(20, 20, 30);
        assertEquals(70, resultado);
    }

    @Test
    void deveSomarOutrasNotas() {
        CalculadoraNota calc = new CalculadoraNota();
        double resultado = calc.calcularNotaFinal(10, 15, 25);
        assertEquals(50, resultado);
    }
    @Test
        void deveAprovarComNota70() {
            CalculadoraNota calc = new CalculadoraNota();
            assertTrue(calc.estaAprovadoPorNota(70));
}

    @Test
        void deveReprovarComNota69() {
            CalculadoraNota calc = new CalculadoraNota();
            assertFalse(calc.estaAprovadoPorNota(69));
    }
    @Test
        void deveRejeitarA1MaiorQue30() {
            CalculadoraNota calc = new CalculadoraNota();
            assertThrows(IllegalArgumentException.class,
                () -> calc.calcularNotaFinal(35, 20, 30));

    }
    @Test
        void devePermitirFazerAIComNotaBaixaEFrequenciaSuficiente() {
            CalculadoraNota calc = new CalculadoraNota();
            assertTrue(calc.podeFazerAI(10, 20, 30, 80));
}

    @Test
        void devePermitirFazerAIComSomaNoLimite() {
            CalculadoraNota calc = new CalculadoraNota();
            assertTrue(calc.podeFazerAI(10, 5, 30, 80));
}

    @Test
        void naoDevePermitirFazerAISeJaEstiverAprovado() {
            CalculadoraNota calc = new CalculadoraNota();
            assertFalse(calc.podeFazerAI(25, 25, 30, 80));
}

    @Test
        void naoDevePermitirFazerAIComFrequenciaBaixa() {
            CalculadoraNota calc = new CalculadoraNota();
            assertFalse(calc.podeFazerAI(10, 20, 30, 70));
}

    @Test
        void naoDevePermitirFazerAIComSomasInsuficientes() {
            CalculadoraNota calc = new CalculadoraNota();
            assertFalse(calc.podeFazerAI(5, 5, 30, 80));
    }

}