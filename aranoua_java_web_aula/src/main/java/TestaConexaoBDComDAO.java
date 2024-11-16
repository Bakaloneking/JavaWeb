public class TestaConexaoBDComDAO{
  psvm{
    try{
    Pessoa pessoa = new Pessoa("Pessoa 08",9222222222 ,"Email08@email.com");
    PessoaDAO pessoaDAO = new PessoaDAO();
    pessoaDAO.inserir(pessoa);
    sout("Inserido com sucesso!");
    }catch(SQLException e){
      sout("ERRO:"+e.getMessage());
    }
  }
}
    
