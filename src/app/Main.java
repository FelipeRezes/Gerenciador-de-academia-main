package app;

import auth.AuthenticationFacade;
import controller.AlunoController;
import controller.ContratoController;
import controller.PlanoAssinaturaController;
import controller.TabelaPrecoController;
import controller.UsuarioController;
import java.time.LocalDate;
import model.Aluno;
import model.Contrato;
import model.PlanoAssinatura;
import model.Usuario;
import service.FaturaService;
import subscription.TabelaPreco;

public class Main {

    public static void main(String[] args) {
        
        AuthenticationFacade.getInstancia().initRepository();

        Usuario anau = UsuarioController.getInstancia().buscarPorEmail("ana.martins@example.com");
        Aluno ana = AlunoController.getInstancia().cadastrarAluno(null, null, null, "ana.martins@example.com");

        UsuarioController.getInstancia().PessoaUsuarioLink(anau.getId(), ana.getId());

        Contrato contratoAna = ContratoController.getInstancia().cadastrar();
        ContratoController.getInstancia().contratar(contratoAna, ana);

        System.out.println(anau);

        System.out.println(UsuarioController.getInstancia().buscarPorId(2));
        TabelaPreco tabela = TabelaPrecoController.getInstancia().criarNovaTabelaPreco(180.0, 0.3);
        
        PlanoAssinatura plano = PlanoAssinaturaController.getInstancia().cadastrarPlanoAssinatura(1, "Mensal",  tabela.getId());
   
        ContratoController.getInstancia().definirPlano(contratoAna, plano);

        System.out.println(ContratoController.getInstancia().buscarPorId(ana.getContratoAtualId()));

        System.out.println(TabelaPrecoController.getInstancia().buscarPorId(1));

        System.out.println();




            FaturaService faturaService = new FaturaService();
    
            // Cenários de teste
            LocalDate dataVencimentoInicial = LocalDate.of(2024, 11, 1); // 1º de novembro de 2024
            Integer alunoId = 1;
    

            System.out.println("=== Testes de criação de faturas ===");

            // Teste 1: Dia válido no meio do mês
            testarCriacaoFatura(faturaService, dataVencimentoInicial, alunoId, 15);
    
            // Teste 2: Último dia do mês
            testarCriacaoFatura(faturaService, dataVencimentoInicial, alunoId, 30);
    
            // Teste 3: Primeiro dia do mês
            testarCriacaoFatura(faturaService, dataVencimentoInicial, alunoId, 1);
    
            // Teste 4: Dia inválido (ex.: dia 32)
            testarCriacaoFatura(faturaService, dataVencimentoInicial, alunoId, 32);
    
            // Teste 5: Dia negativo
            testarCriacaoFatura(faturaService, dataVencimentoInicial, alunoId, -5);
    
            // Teste 6: Dia nulo (valor padrão pode ser definido no serviço)
            testarCriacaoFatura(faturaService, dataVencimentoInicial, alunoId, null);
        }
    
        private static void testarCriacaoFatura(FaturaService faturaService, LocalDate dataVencimento, Integer alunoId, Integer diaEscolhido) {
            try {
                System.out.println("\nTentando criar fatura com dia escolhido: " + diaEscolhido);
                boolean sucesso = faturaService.criarFatura(dataVencimento, alunoId, diaEscolhido);
                System.out.println("Resultado: Fatura criada com sucesso: " + sucesso);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }




}
