package service;

import java.time.LocalDate;
import model.Fatura;

public class FaturaService {

    public boolean criarFatura(LocalDate dataVencimento, Integer alunoId, Integer diaEscolhido) {
        LocalDate novoVencimento = dataVencimento.withDayOfMonth(1);

      
        if (diaEscolhido != null && diaEscolhido > 0 && diaEscolhido <= novoVencimento.lengthOfMonth()) {
            novoVencimento = novoVencimento.withDayOfMonth(diaEscolhido);
        } else {
            throw new IllegalArgumentException("Dia escolhido inválido para o mês.");
        }

        Fatura fatura = new Fatura(dataVencimento, novoVencimento, alunoId);

        // Simula o retorno de criação da fatura (ajuste conforme necessário para lógica de persistência)
        return true;
    }

    // Método utilitário para contar os dias entre duas datas
    public long contarDiasEntreDatas(LocalDate dataInicial, LocalDate dataFinal) {
        return java.time.temporal.ChronoUnit.DAYS.between(dataInicial, dataFinal);
    }
    
}
