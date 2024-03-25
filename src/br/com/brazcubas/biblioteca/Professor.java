package br.com.brazcubas.biblioteca;
public class Professor extends Usuario {
  private String departamento;

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public void imprimirDetalhes() {
    super.imprimirDetalhes();
    System.out.println("Departamento: " + departamento);
  }
}