
package br.com.projeto_1.ctr;

import java.sql.ResultSet;
import br.com.projeto_1.dao.ClienteDAO;
import br.com.projeto_1.dao.ConexaoDAO;
import br.com.projeto_1.dto.ClienteDTO;

public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    //Metodo construtor 
    public ClienteCTR(){
        
    }
    
    public String inserirCliente(ClienteDTO clienteDTO){
        try{
            // chama o metodo inserirCLiente e retorna uma mensagem
            
            if(clienteDAO.inserirCliente(clienteDTO)){
                return "Cliente Cadastrado com Sucesso!";
            }
            else{
                return "Cliente NÃO Cadastrado";
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO Cadastrado";
        }
    }
    
    public String excluirCliente(ClienteDTO clienteDTO){
        try{
            // chama o metodo inserirCLiente e retorna uma mensagem
            
            if(clienteDAO.excluirCliente(clienteDTO)){
                return "Cliente Excluido com Sucesso!";
            }
            else{
                return "Cliente NÃO Excluido";
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO Excluido";
        }
    }
    
    public ResultSet consultarCliente(ClienteDTO clienteDTO,int opcao){
        ResultSet rs = null;
        // o atributo rs recebe a consulta realizada pelo metodo da classe DAO
        rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        
        return rs;
    }
    
    public String alterarCliente(ClienteDTO clienteDTO){
        try{
            // chama o metodo alterarCLiente e retorna uma mensagem           
            if(clienteDAO.alterarCliente(clienteDTO)){
                return "Cliente Alterado com Sucesso!";
            }
            else{
                return "Cliente NÃO Alterado!";
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO Alterado!";
        }
    }

    public void closeDB(){
        ConexaoDAO.CloseDB();
    }
    
}
