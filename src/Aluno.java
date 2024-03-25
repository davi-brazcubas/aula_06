public class Aluno extends Usuario {
  private double anoDeIngresso;

  public double getAnoDeIngresso() {
    return anoDeIngresso;
  }

  public void setAnoDeIngresso(double anoDeIngresso) {
    this.anoDeIngresso = anoDeIngresso;
  }

  public void imprimirDetalhes() {
    super.imprimirDetalhes();
    System.out.println("Ano de Ingresso: " + anoDeIngresso);
  }
}