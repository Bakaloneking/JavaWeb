pacote util
public class ConexaoUtil{
  private String url;
  private String usuario;
  private String senha;

public ConexaoUtil(){
  this.url = "//url do BD//"
  this.usuario = "//usuario do banco//"
  this.senha = "//senha do banco//"

}

/*public Connection getConexao(){
  try{
    return DriveManager.getConnection(url,usuario,senha);
  } catch(SQLExeception e){
      sout("ERRO:"+e.getMessage());
    }
return null;
}*/
  public Connection getConexao()trows{
  try{
    return DriveManager.getConnection(url,usuario,senha);
  } catch(SQLExeception e){
      sout("ERRO:"+e.getMessage());
    }
return null;
}
