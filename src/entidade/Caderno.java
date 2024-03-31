package entidade;

import entidade.constantes.Materias;

public class Caderno extends Produto {
    private Materias tipo;

    public Caderno(String tipo){
        this.setCodigo("Caderno");
        this.setTipo(Materias.valueOf(tipo.toUpperCase()));
    }

    public Materias getTipo() {
        return tipo;
    }

    public void setTipo(Materias tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularFrete() {
        return getPreco() * getQuantidade() *  tipo.getFator();
    }

    @Override
    public String toString() {
        return "Caderno {Codigo= '" + this.getCodigo() + "', Tipo = '"+ tipo +"'}";
    }
}
