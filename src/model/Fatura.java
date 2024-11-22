package model;

import java.time.LocalDate;

public class Fatura {
    
    Integer id;
    LocalDate dataFechamento;
    LocalDate dataVencimento;
    Integer alunoId;
    //status

    
 
    public Fatura(LocalDate dataFechamento, LocalDate dataVencimento, Integer alunoId) {
        this.dataFechamento = dataFechamento;
        this.dataVencimento = dataVencimento;
        this.alunoId = alunoId;
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
        

}
