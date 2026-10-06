package  model;

import java.time.LocalDate;

public class Candidato {

    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private String cidade;
    private String vagaPretendida;
    private Escolaridade escolaridade;
    private SituacaoInscricao situacao;
    
    public Candidato() {

    }
    public Candidato(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.situacao = SituacaoInscricao.INSCRITO;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }



    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    


    public LocalDate getDataNascimento() {
        return  dataNascimento;
    }
    public void setdataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    


    public String getEmail() {
        return  email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    


    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }



    public Escolaridade getEscolaridade() {
        return escolaridade;
    }
    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
 


    public SituacaoInscricao getSituacaoInscricao() {
        return situacao;

    }
    public void setSituacaoInscricao(SituacaoInscricao situacao) {
        this.situacao = situacao;
    }



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    

    public String getVagaPretendida() {
        return vagaPretendida;
    }
    public void setVagaPretendida(String vagaPretendida){
        this.vagaPretendida = vagaPretendida;
    }

        
}

