package model;

import java.time.LocalDate;



public class Aluno extends Pessoa{

    public Aluno(String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
    }

    private Integer matricula;
    private LocalDate dataMatricula;
    private Integer contratoAtualId;


    //Observer methods
    /*@Override
    public void update( ){

    }*/



    //getters and setters
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Integer getContratoAtualId() {
        return contratoAtualId;
    }

    public void setContratoAtualId(Integer contratoAtualId) {
        this.contratoAtualId = contratoAtualId;
    }

}
