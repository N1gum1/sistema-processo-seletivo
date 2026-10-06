package service;

import model.Candidato;
import java.util.ArrayList;
import java.util.List;

// essa minha senhora eu coloquei para gerenciar os candidatos
public class CandidatoService {

    //lista que eu usei para armazenar os candidatos
    private  List<Candidato> candidatos = new ArrayList<>(); 

    // usei para cadastar um candidato na lista
    public void cadastrar( Candidato candidato) {
        candidatos.add(candidato);
    }

    //vou usar para listar os candidatos ja cadastrados
    public void listar(){
        for (Candidato candidato : candidatos ) {
        
        System.out.println("------------------------------");
        System.out.println("ID: " + candidato.getId());
        System.out.println("Nome: " + candidato.getNome());
        System.out.println("CPF: " + candidato.getCpf());
        System.out.println("Data de nascimento: " + candidato.getDataNascimento());
        System.out.println("E-mail: " + candidato.getEmail());
        System.out.println("Telefone: " + candidato.getTelefone());
        System.out.println("Cidade: " + candidato.getCidade());
        System.out.println("Vaga: " + candidato.getVagaPretendida());
        System.out.println("Escolaridade: " + candidato.getEscolaridade());
        System.out.println("Situação: " + candidato.getSituacaoInscricao());
        
        }

    }

    public Candidato consultarPorId(Long id) {  //consultar o candiato pelo id
        for (Candidato candidato : candidatos) {  //passa por todos os candidatos d alista
            if (candidato.getId().equals(id)){   //aqui vai verificar se o id é igual oque eu estou pesquisando
                return candidato;
            }
        }

        return null;  //vai dar esse resultado caso não exista esse id
    }


    public Candidato consultarPorCPf(String cpf) {
        for (Candidato candidato : candidatos) {

            if (candidato.getCpf().equals(cpf)) {
            return candidato;
        }

    }
    return null;

    }
 
    // Edita os dados de um candidato pelo ID
public boolean editar(Long id, Candidato novosDados) {

    // Procura o candidato pelo ID
    Candidato candidato = consultarPorId(id);

    // Se não encontrou, não é possível editar
    if (candidato == null) {
        return false;
    }

    // Atualiza os dados do candidato
    candidato.setNome(novosDados.getNome());
    candidato.setCpf(novosDados.getCpf());
    candidato.setDataNascimento(novosDados.getDataNascimento());
    candidato.setEmail(novosDados.getEmail());
    candidato.setTelefone(novosDados.getTelefone());
    candidato.setCidade(novosDados.getCidade());
    candidato.setVagaPretendida(novosDados.getVagaPretendida());
    candidato.setEscolaridade(novosDados.getEscolaridade());
    candidato.setSituacao(novosDados.getSituacao());

    // Retorna true indicando que a edição deu certo
    return true;
}

} 
