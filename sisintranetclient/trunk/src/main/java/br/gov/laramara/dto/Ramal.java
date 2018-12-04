package br.gov.laramara.dto;

public class Ramal {
    private String nome;
    private String ramal;
    private String depto;
    private String empresa;

       
    public Ramal(String nome, String ramal, String depto, String empresa) {
        this.nome = nome;
        this.ramal = ramal;
        this.depto = depto;
        this.empresa = empresa;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Ramal{" + "nome=" + nome + ", ramal=" + ramal + ", depto=" + depto + ", empresa=" + empresa + '}';
    }
    
    
    
    
    
}
