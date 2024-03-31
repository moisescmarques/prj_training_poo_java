package negocio;

import java.util.Optional;

import basedados.Banco;
import entidade.*;

public class ClienteNegocio {
    
    private static Banco banco;
    
    public ClienteNegocio(){

    }

    public ClienteNegocio(Banco banco) {
        this.banco = banco;
    }

    public Optional consultarCliente(String cpf){
       if (banco.getCliente().getCpf().equals(cpf)) {
            return Optional.of(banco.getCliente());
        } 
        else {
            return Optional.empty();
        }
    }
    
    public void salvarCliente(String nome, String cpf){
        Cliente novoCliente = new Cliente();

        novoCliente.setNome(nome);
        novoCliente.setCpf(cpf);

        banco.setCliente(novoCliente);
    }

    public void excluirCliente(String cpf){
        
    }
}
