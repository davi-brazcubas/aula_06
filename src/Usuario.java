public class Usuario {
  private String id;
  private String nome;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void imprimirDetalhes() {
    System.out.println("Nome: " + nome + ", ID: " + id);
  }

  public void imprimirDetalhes(String cabecalho) {
    System.out.println(cabecalho);
    this.imprimirDetalhes();
  }
}