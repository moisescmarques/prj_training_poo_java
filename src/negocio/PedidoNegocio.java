package negocio;

import basedados.Banco;
import entidade.*;
import java.util.*;
import java.util.random.RandomGenerator;

public class PedidoNegocio {
    private Banco banco;


    public PedidoNegocio(){
        
    }

    public PedidoNegocio(Banco banco){
        this.banco = banco;
    }

    private double calcularTotal(List produtos, Cupom cupom){
        return 0;
    }
    
    public void salvarPedido(String codigoProduto, Cliente cliente, int quantidade){
        
        Pedido pedido = new Pedido();
        ProdutoNegocio produtoNegocio = new ProdutoNegocio();

        Optional<Produto> resultadoBuscaProduto = produtoNegocio.consultarProduto(codigoProduto);
        if (resultadoBuscaProduto.isPresent()){
            Produto produto = resultadoBuscaProduto.get();
            produto.setQuantidade(quantidade);

            pedido.setCodigo(Double.toString(Math.random()));
            pedido.setCliente(cliente);
            pedido.getListProdutos().add(produto);

            banco.adicionarPedido(pedido);
        }
        else {
            System.out.println("Produto inexistente. Escolha um produto válido");
        }
    }

    //public void salvarPedido(Pedido novoPedido, Cupom cupom){
    //    banco.adicionarPedido(new novoPedido);
    //}

    public void excluirPedido(String codigo){
        
    }

    public void listarTodoPedidos(){
        
    }

}
