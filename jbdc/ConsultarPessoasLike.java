package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoasLike {
    public static void main(String[] args) throws SQLException {
        
        //bloco sql like
       Scanner entrada = new Scanner(System.in);
       
       Connection conexao = FabricaConexao.getConexao();
       String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
       
       System.out.println("Insira o valor para pesquisar: ");
       String valor = entrada.nextLine();
       
       // \/ importante, PreparedStatement
       PreparedStatement statement = conexao.prepareStatement(sql);
       statement.setString(1, "%" + valor + "%");
       ResultSet resultado = statement.executeQuery();
       //bloco sql like

       List<Pessoa> pessoas = new ArrayList<>();
       
       while(resultado.next()){ 
           int codigo = resultado.getInt("codigo");
           String nome = resultado.getString("nome");
           pessoas.add(new Pessoa(codigo, nome));
        }
        
        for(Pessoa p: pessoas){
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        statement.close();
        conexao.close();
        
        entrada.close();
    }
}
