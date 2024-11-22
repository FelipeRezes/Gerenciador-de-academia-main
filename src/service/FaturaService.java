package service;

import java.time.LocalDate;
import model.Fatura;

public class FaturaService {

        public Fatura criarFatura(LocalDate dataVencimento, Integer alunoId){

            Fatura fatura = new Fatura(dataVencimento, dataVencimento, alunoId);
            
            
            
            
        }



        public static void dataPagamento(String[] args) {
            LocalDate dataFechamento = LocalDate.of(2024, 11, 1);  
            LocalDate dataVencimento = LocalDate.of(2024, 11, 7);   
    
            long diasEntre = contarDiasEntreDatas(dataFechamento, dataVencimento);
        }

    
}
