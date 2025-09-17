package aula06;

public class Main {
    public static void main(String[] args) {
        Estado estado = new Estado("Rio de Janeiro", "RJ");
        Cidade cidade = new Cidade("Petrópolis", estado);
        Endereco endereco = new Endereco("Rua Fonseca Ramos 181", "Centro", "25600-000", cidade);

        Contato contato = new Contato("Roberta", endereco);
        contato.addTelefone("2234-1250");
        contato.addTelefone("2237-1350");

        contato.exibirDados();
    }
}