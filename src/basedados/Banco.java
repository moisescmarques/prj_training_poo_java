package basedados;

import java.util.*;

import entidade.Produto;
import entidade.Pedidos;
import entidade.Cupons;

public class Banco {
    
    private List<Produtos> listProdutos;
    private List<Pedidos> listPedidos;
    private List<Cupons> listCupons;
    private Cliente cliente;

    public Banco(){
        this.listProdutos = new ArrayList<>();
        this.listPedidos = new ArrayList<>();
        this.listCupons = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public List<Cupons> getListCupons() {
        return listCupons;
    }
    
    public List<Pedidos> getListPedidos() {
        return listPedidos;
    }
    
    public List<Produtos> getListProdutos() {
        return listProdutos;
    }
    
    public void adicionarProduto(){
    
    }

    public void removerProduto(){

    }

    public void adicionarPedido(){

    }
    
    public void removerPedido(){

    }
}
