package Testes;

import ConfigHardware.Computador;
import ConfigHardware.ComputadorBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputadorBuilderTest {

    @Test
    public void deveRetornarExcecaoParaProcessadorVazio() {
        ComputadorBuilder builder = new ComputadorBuilder();
        builder.setMemoriaRam(16);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            builder.build();
        });

        assertEquals("Processador inválido", exception.getMessage());
    }

    @Test
    public void deveRetornarExcecaoParaMemoriaRamZero() {
        ComputadorBuilder builder = new ComputadorBuilder();
        builder.setProcessador("Intel Core i5");
        builder.setMemoriaRam(0);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            builder.build();
        });

        assertEquals("Memória RAM inválida", exception.getMessage());
    }

    @Test
    public void deveRetornarExcecaoParaMemoriaRamNegativa() {
        ComputadorBuilder builder = new ComputadorBuilder();
        builder.setProcessador("AMD Ryzen 5");
        builder.setMemoriaRam(-8);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            builder.build();
        });

        assertEquals("Memória RAM inválida", exception.getMessage());
    }

    @Test
    public void deveConstruirComputadorComSucesso() {
        ComputadorBuilder builder = new ComputadorBuilder();
        Computador computador = builder
                .setProcessador("AMD Ryzen 7")
                .setMemoriaRam(32)
                .setPlacaMae("ASUS ROG Strix")
                .setArmazenamento("SSD 1TB NVMe")
                .setPlacaDeVideo("RTX 4070")
                .setFonte("750W")
                .setGabinete("Mid Tower")
                .setSistemaOperacional("Windows 11")
                .build();

        assertNotNull(computador);
        assertEquals("AMD Ryzen 7", computador.getProcessador());
        assertEquals(32, computador.getMemoriaRam());
        assertEquals("ASUS ROG Strix", computador.getPlacaMae());
        assertEquals("SSD 1TB NVMe", computador.getArmazenamento());
        assertEquals("RTX 4070", computador.getPlacaDeVideo());
        assertEquals("750W", computador.getFonte());
        assertEquals("Mid Tower", computador.getGabinete());
        assertEquals("Windows 11", computador.getSistemaOperacional());
    }

}
