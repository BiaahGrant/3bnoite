package br.gov.laramara.dto;

/**
 *
 * @author ruben
 */
public class Colaborador {
    private String nome;
    private String ramal;
    private String departamento;
    private String empresa;

    public Colaborador() {
    }
    
     

    public Colaborador(String nome, String ramal, String departamento, String empresa) {
        this.nome = nome;
        this.ramal = ramal;
        this.departamento = departamento;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
  
}
