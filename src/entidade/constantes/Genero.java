package entidade.constantes;

public enum Genero {
    DRAMA(0.15),
    SUSPENSE(0.10),
    ROMANCE(0.05);

    private double fator;

    private Genero(double fator){
        this.fator = fator;
    }

    public double getFator() {
       return fator;
    }
}
