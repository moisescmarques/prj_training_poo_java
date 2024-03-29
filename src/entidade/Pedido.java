package entidade;

public class Pedido {
    
    private String codigo;
    private Cliente cliente;
    private List<Produtos> listProdutos;
    private double total;

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

    public List<Produtos> getListProdutos() {
        return listProdutos;
    }
    
    public void setListProdutos(List<Produtos> listProdutos) {
        this.listProdutos = listProdutos;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
