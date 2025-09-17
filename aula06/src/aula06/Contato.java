package aula06;

import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private Endereco endereco;
    private List<String> telefones = new ArrayList<>();

    public Contato(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void addTelefone(String telefone) {
        telefones.add(telefone);
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println(endereco.getRua() + " " + endereco.getBairro() + " " +
                endereco.getCidade().getNomeCidade() + " " + endereco.getCidade().getEstado().getSigla());
        for (String tel : telefones) {
            System.out.println("Telefone: " + tel);
        }
    }
}