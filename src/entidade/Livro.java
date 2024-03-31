package entidade;

import entidade.constantes.Genero;

public class Livro extends Produto{
    
    
    private String nome;
    private Genero genero;

    public Livro(String nome, String genero, double preco) {
        this.nome = nome;
        setGenero(Genero.valueOf((genero.toUpperCase())));
        setPreco(preco);
        this.setCodigo("Livro");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade() * (1 + genero.getFator()));
    }

    @Override
    public String toString() {
        return "Livro {Codigo = '" + getCodigo() + "', Nome = '"+ nome + "', Genero = '" + genero + "'}";
    }
    
}
