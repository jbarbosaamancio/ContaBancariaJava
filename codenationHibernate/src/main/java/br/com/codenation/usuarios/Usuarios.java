package br.com.codenation.usuarios;

import javax.persistence.*;


@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 20, nullable = false)
    private String login;
    @Column(unique = true, length = 14, nullable = false)
    private String cpf;
    @Column(length = 100, nullable = false)
    private String nome;

    public Usuarios(Long id, String login, String cpf, String nome) {
        this.id = id;
        this.login = login;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
