
import br.com.brazcubas.exercicio.Aluno;
import br.com.brazcubas.exercicio.Calculadora;
import br.com.brazcubas.exercicio.Carro;
import br.com.brazcubas.exercicio.ContaBancaria;
import br.com.brazcubas.exercicio.IdadePessoa;
import br.com.brazcubas.exercicio.Livro;
import br.com.brazcubas.exercicio.Musica;
import br.com.brazcubas.exercicio.Pessoa;
import br.com.brazcubas.exercicio.Produto;

public class Main {

  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    pessoa.dizerOla();

    Calculadora calculadora = new Calculadora();
    System.out.println("Dobro de 5: " + calculadora.dobrar(5));

    Musica musica = new Musica();
    musica.setTitulo("Vilarejo");
    musica.setArtista("Marisa Monte");
    musica.setAnoLancamento(2005);
    musica.exibirFichaTecnica();

    Carro carro = new Carro("Fusca", 1995, "Azul");
    carro.exibirFichaTecnica();

    ContaBancaria conta = new ContaBancaria();
    conta.setNumeroConta(12345);
    conta.setSaldo(1000);
    System.out.println("Número da conta: " + conta.getNumeroConta());
    System.out.println("Saldo: " + conta.getSaldo());

    IdadePessoa pessoaIdade = new IdadePessoa();
    pessoaIdade.setNome("João");
    pessoaIdade.setIdade(25);
    pessoaIdade.verificarIdade();

    Produto produto = new Produto();
    produto.setNome("Notebook");
    produto.setPreco(2000);
    produto.aplicarDesconto(10);
    System.out.println("Preço com desconto: " + produto.getPreco());

    Aluno aluno = new Aluno();
    aluno.setNome("Maria");
    aluno.addNota(7.5);
    aluno.addNota(8.5);
    aluno.addNota(4.5);
    System.out.println("Média do aluno: " + aluno.calcularMedia());

    Livro livro = new Livro();
    livro.setTitulo("Dom Casmurro");
    livro.setAutor("Machado de Assis");
    livro.exibirDetalhes();
  }
}