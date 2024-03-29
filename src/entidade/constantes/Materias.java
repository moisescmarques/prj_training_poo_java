package entidade.constantes;

public enum Materias {
    M2(2),
    M5(5),
    M10(10);

    private int fator;

    private Materias(int fator) {
        this.fator = fator;
    }

    public int getFator() {
        return fator;
    }
}
