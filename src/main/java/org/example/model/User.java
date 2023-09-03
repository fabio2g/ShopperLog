package org.example.model;

public class User {
    private String name;
    private int age;
    private String cpf;
    private String fone;
    private int role;

    public User(String name, int age, String cpf, String fone) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.fone = fone;
        this.role = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cpf='" + cpf + '\'' +
                ", fone='" + fone + '\'' +
                ", role=" + role +
                '}';
    }
}


