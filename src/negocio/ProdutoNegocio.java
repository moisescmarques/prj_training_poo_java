package negocio;

import java.util.Optional;

import basedados.Banco;
import entidade.*;

public class ProdutoNegocio {
    private Banco banco;

    public ProdutoNegocio() {

    }

    public ProdutoNegocio(Banco banco) {
        this.banco = banco;
    }

    public void salvarProduto(Produto novoProduto){
        banco.adicionarProduto(novoProduto);
    }

    public void excluirProduto(String codigo){
        banco.removerProduto(codigo);
    }

    public Optional<Produto> consultarProduto(String codigoProduto){
        for (Produto produto: banco.getListProdutos()){
            if(produto.getCodigo().equalsIgnoreCase(codigoProduto)){
                return Optional.of(produto);
            }
        }
        return Optional.empty();
    }

    public void listarTodosProdutos(){
        System.out.println("Listando todos os produtos no BD: ");
        System.out.println(banco.getListProdutos());
    }
}
