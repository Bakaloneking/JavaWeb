public class TestaConexaoBDComDAO{
  psvm{
    try{
      //inserir
    Pessoa pessoa = new Pessoa("Pessoa 08",9222222222 ,"Email08@email.com");
    PessoaDAO pessoaDAO = new PessoaDAO();
    pessoaDAO.inserir(pessoa);
    sout("Inserido com sucesso!");
      //
      //
      //listar
      List<Pessoa> pessoas = pessoaDAO.listar();
      for(Pessoa pessoa:pessoas){

      }
      /*pessoaDAO.listar();*/
        sout("Listado com sucesso");
      //consultar
      Pessoa pessoa = pessoaDAO.sonsultar(5);
      souts
      sout("Consultado com sucesso!");
      
    }catch(SQLException e){
      sout("ERRO:"+e.getMessage());
    }
  }
}
    
