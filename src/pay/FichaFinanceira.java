package pay;

import java.time.LocalDate;

public class FichaFinanceira {

    Integer alunoId;
    LocalDate dataVencimento;
    LocalDate dataFechamento = this.dataFechamento();


    private LocalDate dataFechamento() {

        if (dataVencimento == null) {
            throw new IllegalStateException("Data de vencimento não pode ser nula.");
        }
        return dataVencimento.minusDays(7);

    }

    
}