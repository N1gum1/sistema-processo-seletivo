import model.Candidato;
import java.time.LocalDate;
import model.Escolaridade;
import model.SituacaoInscricao;
import service.CandidatoService;


public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema de Processo Seletivo");

        Candidato candidato = new Candidato(
            "Hellen Alexandre", "123.456.789-00");
 

        //vai criar o sevrviço que pra gerenciar os candidatos
        CandidatoService service = new CandidatoService(); 

        candidato.setCpf("123.456.789-00");
        candidato.setdataNascimento(LocalDate.of(2001, 8, 22));
        candidato.setEmail("hellen.ptu@gmail.com");
        candidato.setTelefone("(38) 99725-1690");
        candidato.setCidade("Paracatu-MG");
        candidato.setEscolaridade(Escolaridade.SUPERIOR);
        candidato.setId(1l);
        candidato.setVagaPretendida("Professora de Inglês");

        
        //adiciona candidatos na minha lista
        service.cadastrar(candidato);


      
        Candidato candidato2 = new Candidato(
           "Rebecca Galvão", "222.323.343-12"

        );


        //agora eu vou definir os dados

        candidato2.setdataNascimento(LocalDate.of(2004, 9, 30));
        candidato2.setEmail("rebeccagalssouy@gmail.com");
        candidato2.setTelefone("(61) 99867-1697");
        candidato2.setCidade("Brasilia-DF");
        candidato2.setEscolaridade(Escolaridade.TECNICO);
        candidato2.setId(2L);
        candidato2.setVagaPretendida("Desenvolvedora Java");
        service.cadastrar(candidato2);
        //----------------------------------------------------



        service.listar(); //vai listar os benditos candidatos

        Candidato encontrado = service.consultarPorId(1L);


        System.out.println("Candidato encontrado: " + encontrado.getNome());

        Candidato encontradoCpf = service.consultarPorCPf("123.456.789-00");

        System.out.println("Candidato encontrado pelo CPF: " + encontradoCpf.getNome()); //fazendo isso eu vou estar chamando o metodo 
    }   

 
}

