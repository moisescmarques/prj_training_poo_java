package console;

import java.util.Optional;

import basedados.Banco;
import entidade.*;
import negocio.*;
import utilidade.*;

public class Start {   

    private static Cliente clienteLogado = null;

    private static Banco banco = new Banco();

    private static ClienteNegocio clienteNegocio = new ClienteNegocio(banco);
    private static ProdutoNegocio produtoNegocio = new ProdutoNegocio(banco);
    private static PedidoNegocio PedidoNegocio = new PedidoNegocio(banco);


    public static void main(String[] args) {

        System.out.println("Bem vindo ao MoMo-Livraria e Papelaria");

        String opcao = "";

        while(true) {

            if (clienteLogado == null) {

                System.out.println("Digite o cpf:");

                String cpf = "4";
                cpf = LeitoraDados.lerDados();
                identificarUsuario(cpf);
            }
        
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Excluir Livro");
            System.out.println("3 - Consultar Livro");
            System.out.println("4 - Cadastrar Caderno");
            System.out.println("5 - Excluir Caderno");
            System.out.println("6- Consultar Carderno");            
            System.out.println("7 - Fazer pedido");
            System.out.println("8 - Excluir pedido");
            System.out.println("9 - Consultar Pedido");
            System.out.println("10 - Listar produtos");
            System.out.println("11 - Listar pedidos");
            System.out.println("12 - Deslogar");
            System.out.println("13 - Sair");

            opcao = LeitoraDados.lerDados();

            switch (opcao) {
                case "1":
                    LeitoraDados.lerLivro(produtoNegocio);
                    break;
                case "7":
                    LeitoraDados.lerPedido(PedidoNegocio, clienteLogado);
                    //Optional<Cupom> cupom = LeitoraDados.lerCupom(banco);
                    break;

                case "10":
                    produtoNegocio.listarTodosProdutos();
                    break;
                default:
                    System.out.println("Opção inválida. Tente Novamente!");
                    break;
            }            
        }
    }

    private static void identificarUsuario(String cpf){
        
        Optional<Cliente> resultado = clienteNegocio.consultarCliente(cpf);

        if (resultado.isPresent()) {

            Cliente cliente = resultado.get();
            System.out.println(String.format("Olá %s! Você está logado.", cliente.getNome()));
            clienteLogado = cliente;
            
        } else {
            System.out.println("Usuário não cadastrado.");
            
            System.exit(0);
        }
    }
}

