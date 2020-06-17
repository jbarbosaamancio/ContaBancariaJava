package br.com.codenation.alunos;

import br.com.codenation.usuarios.Usuarios;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Aluno extends Usuarios {
    @Column(nullable = false,length = 10)
    private Integer numeroMatricula;

    public Aluno(Long id, String login, String cpf, String nome) {
        super(id, login, cpf, nome);
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
