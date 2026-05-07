package ConfigHardware;

public class ComputadorBuilder {

    private Computador computador;

    public ComputadorBuilder() {
        computador = new Computador();
    }

    public Computador build() {
        if (computador.getProcessador().equals("")) {
            throw new IllegalArgumentException("Processador inválido");
        }
        if (computador.getMemoriaRam() <= 0) {
            throw new IllegalArgumentException("Memória RAM inválida");
        }
        return computador;
    }

    public ComputadorBuilder setPlacaMae(String placaMae) {
        computador.setPlacaMae(placaMae);
        return this;
    }

    public ComputadorBuilder setProcessador(String processador) {
        computador.setProcessador(processador);
        return this;
    }

    public ComputadorBuilder setMemoriaRam(int memoriaRam) {
        computador.setMemoriaRam(memoriaRam);
        return this;
    }

    public ComputadorBuilder setArmazenamento(String armazenamento) {
        computador.setArmazenamento(armazenamento);
        return this;
    }

    public ComputadorBuilder setPlacaDeVideo(String placaDeVideo) {
        computador.setPlacaDeVideo(placaDeVideo);
        return this;
    }

    public ComputadorBuilder setFonte(String fonte) {
        computador.setFonte(fonte);
        return this;
    }

    public ComputadorBuilder setGabinete(String gabinete) {
        computador.setGabinete(gabinete);
        return this;
    }

    public ComputadorBuilder setSistemaOperacional(String sistemaOperacional) {
        computador.setSistemaOperacional(sistemaOperacional);
        return this;
    }

}
