package model;

import java.time.LocalDate;

public class Fatura {
    
    Integer id;
    LocalDate dataFechamento;
    LocalDate dataVencimento;
    LocalDate novoVencimento;
    Integer alunoId;
    LocalDate diaEscolhido;
    //status

    
 
    public Fatura(LocalDate dataFechamento, LocalDate dataVencimento, Integer alunoId) {
        this.dataFechamento = dataFechamento;
        this.dataVencimento = dataVencimento;
        this.alunoId = alunoId;
        this.novoVencimento = novoVencimento;
        this.diaEscolhido = diaEscolhido;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDate getDataFechamento() {
        return dataFechamento;
    }
    public void setDataFechamento(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public Integer getAlunoId() {
        return alunoId;
    }
    public void setAlunoId(Integer alunoId) {
        this.alunoId = alunoId;
    }

    public LocalDate getDiaEscolhido() {
        return diaEscolhido;
    }

    public void setDiaEscolhido(LocalDate diaEscolhido) {
        this.diaEscolhido = diaEscolhido;
    }

    public LocalDate getNovoVencimento() {
        return novoVencimento;
    }

    public void setNovoVencimento(LocalDate novoVencimento) {
        this.novoVencimento = novoVencimento;
    }
        

}
