package entidade;

import java.util.List;
import java.util.Optional;

public class Pedido {
    
    private String codigo;
    private Cliente cliente;
    private List<Produto> listProdutos;
    private double total;

    /* public Pedido(String codigo, Cliente cliente, List produtos){
        this.codigo = codigo;
        this.cliente = cliente;
        this.listProdutos = produtos;
    } */

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getListProdutos() {
        return listProdutos;
    }
    
    public void setListProdutos(List<Produto> listProdutos) {
        this.listProdutos = listProdutos;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
