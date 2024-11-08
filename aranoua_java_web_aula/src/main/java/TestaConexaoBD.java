import java.sql.*;

public class TestaConexaoBD {

    public static void main(String[] args) {
//        jdbc:mysql://localhost:3306//aranoua_java_web == Onde esta instalado o BD
        String url = "jdbc:mysql://localhost:3306/aranoua_java_web";
        String usuario = "root"; //user do BD que será feita a conexao
        String senha = "aranoua"; //senha do BD que será feita a conexao
        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada!");//Para mostrar que deu certo

            Statement instrucao = conexao.createStatement();
            String sqlInserir = "insert into pessoa" +
                         " (nome,email)" +
                         " values" +
                         " ('Pessoa04','pessoa04@ifam.edu.br')"; //Insere a Pessoa
           // System.out.println("SQL:"+sqlInserir);
           // boolean resultado = instrucao.execute(sqlInserir);

            String sqlAlterar = "update pessoa" +
                    " set nome = 'João'" +
                    " where id = 1"; //Modifica o campo informado
            // System.out.println("SQL:"+sqlAlterar);
            // boolean resultado = instrucao.execute(sqlAlterar);

            String sqlDeletar = "delete from pessoa" +
                    " where id = 1"; //Deleta a pessoa no id especificado

            //System.out.println("SQL:"+sqlDeletar);
            //boolean resultado = instrucao.execute(sqlDeletar);

            String sqlListar = "select id,nome,email from pessoa";
            System.out.println("SQL:"+sqlListar);
            boolean resultado = instrucao.execute(sqlListar);
            if(resultado){
                ResultSet resultados = instrucao.getResultSet();
                while(resultados.next()){
                System.out.println("ID:"+resultados.getInt(1));
                    System.out.println("NOME:"+resultados.getString(2));
                    System.out.println("EMAIL:"+resultados.getString(3));
                    System.out.println("*******************************************");
                }
            }

            System.out.println("Instrução realizada com sucesso!");

            //System.out.println("Resultado:"+resultado);

        }catch(SQLException exececao){
            System.out.println("Erro:"+ exececao.getMessage()); //Para mostrar que deu erro
        }
        System.out.println("Progama finalizado"); //Para mostrar que o programa finalizou
    }
}