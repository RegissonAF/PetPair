package com.example.petpair;

public class Pet {
    private String nome;
    private String raca;
    private String ownerId;
    private String id;
    private int sexo;
    private int idade;

    public Pet() {
    }

    public Pet(String nome, String raca, String ownerId, String id, int sexo, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.ownerId = ownerId;
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
