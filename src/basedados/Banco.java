package basedados;

import java.util.*;

import entidade.*;


public class Banco {
    
    private List<Produto> listProdutos;
    private List<Pedido> listPedidos;
    private List<Cupom> listCupons;
    private Cliente cliente;

    public Banco(){
        this.listProdutos = new ArrayList<>();
        this.listPedidos = new ArrayList<>();
        this.listCupons = new ArrayList<>();
        this.cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public List<Cupom> getListCupons() {
        return listCupons;
    }
    
    public List<Pedido> getListPedidos() {
        return listPedidos;
    }
    
    public List<Produto> getListProdutos() {
        return listProdutos;
    }
    
    public void adicionarProduto(Produto tipoProduto){
        listProdutos.add(tipoProduto);
    }

    public void removerProduto(int codigo){
        for (Produto produto: listProdutos){
            if(produto.getCodigo() == codigo){
                listProdutos.remove(produto);
            }
        }
    }

    public void adicionarPedido(Pedido pedido){
        listPedidos.add(pedido);
    }
    
    public void removerPedido(int codigo){
        for (Produto pedido: listProdutos){
            if(pedido.getCodigo() == codigo){
                listProdutos.remove(pedido);
            }
        }
    }
}
