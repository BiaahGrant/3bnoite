package br.gov.laramara.servico;

import br.gov.laramara.dto.Colaborador;
import br.gov.laramara.repositorio.RepositorioBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author laramara
 */
@ManagedBean(name = "colaboradorService")
@ApplicationScoped
public class ColaboradorService {

    Colaborador colaborador;
    private String col;

    private final static String[] deptos;

    static {
        deptos = new String[10];
        deptos[0] = "CTO";
        deptos[1] = "TI LARAMARA";
        deptos[2] = "Marvic´s";
        deptos[3] = "Financeiro";
        deptos[4] = "CENTRAL DE DOAÇÕES";
        deptos[5] = "TI MARVIC´S";
        deptos[6] = "PROCEJA";
        deptos[7] = "RH MARVIC´S";
        deptos[8] = "RH";
        deptos[9] = "COMPRAS CORPORATIVA";

    }

    public ColaboradorService() {
    }

    public ColaboradorService(String colaborador) {
        this.col = colaborador;
    }

    public List<String> getNomes() {
        return Arrays.asList(colaborador.getNome());
    }

    public List<String> getDeptos() {
        return Arrays.asList(deptos);
    }

    public List<String> getEmpresas() {
        return Arrays.asList(colaborador.getEmpresa());
    }

    public List<Colaborador> createColaboradores() {
        List<Colaborador> list = new ArrayList<>();
        return new RepositorioBase().obterTodos();
    }
}
