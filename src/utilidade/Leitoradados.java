package utilidade;

import java.util.Scanner;

import basedados.Banco;
import entidade.*;
import entidade.constantes.Genero;
import negocio.*;

public final class LeitoraDados {
    
    private static Scanner scanner;

    private static Banco banco = new Banco();

    static{
        scanner = new Scanner(System.in);
    }

    public static String lerDados(){
        
        String entrada = scanner.nextLine();
        return entrada;
    
    }

    public static void lerLivro(ProdutoNegocio produtoNegocio){
       
       
        System.out.println("Cadastrando livro...");

        System.out.println("Digite o nome");
		String nome = lerDados();

		System.out.println("Digite o gênero: DRAMA, SUSPENSE, ROMANCE");
		String genero = lerDados();

		System.out.println("Digite o preço(padrão 0.0)");
		String preco = lerDados();
        
        produtoNegocio.salvarProduto(new Livro(nome, genero, Double.parseDouble(preco)));
         
    }

    public static void lerPedido(PedidoNegocio pedidoNegocio, Cliente cliente){
        
        
        System.out.println("Cadastrando seu pedido...");
        System.out.println("Digite o código do produto: Livro/Caderno");
        String codigo = lerDados();
        System.out.println("Digite a quantidade: ");
        int quantidade = Integer.parseInt(lerDados());

        System.out.println("Já identificamos seu usuário...");

        pedidoNegocio.salvarPedido(codigo, cliente, quantidade);

        System.out.println("Pedido realizado!!!"); 
    }

    public static void lerCupom(){
        //This method is Optional
    }  

    /* public static void lerCliente(){

        System.out.println("Cadastrando um novo cliente...");
        System.out.println("Digite o CPF do cliente: ");
        String cpf = lerDados();
        System.out.println("Digite o nome do cliente: ");
        String nome  = lerDados();

        clienn.salvarCliente(nome, cpf);

        System.out.println("Cliente cadastrado com sucesso!!!"); 
    } */

}
