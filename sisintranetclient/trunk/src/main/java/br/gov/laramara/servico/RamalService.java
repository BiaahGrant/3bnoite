package br.gov.laramara.servico;
/*Ajuste Classes 111 */
import br.gov.laramara.dto.Ramal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author laramara
 */
@ManagedBean(name = "ramalService")
@ApplicationScoped
public class RamalService {

    public RamalService() {
    }

    private final static String[] NOMES;
    private final static String[] TELEFONES;
    private final static String[] EMPRESAS;
    private final static String[] DEPTOS;

    static {
        NOMES = new String[10];
        NOMES[0] = "Rubens Leme";
        NOMES[1] = "Paulo Bandeira";
        NOMES[2] = "Carlos Kafka";
        NOMES[3] = "Leone Pizzoli";
        NOMES[4] = "Alex Silva";
        NOMES[5] = "Alex Silva";
        NOMES[6] = "Ricardo Nunes";
        NOMES[7] = "Ednaldo Silva";
        NOMES[8] = "Suporte ti";
        NOMES[9] = "Vagner Silva";

        TELEFONES = new String[10];
        TELEFONES[0] = "6493";
        TELEFONES[1] = "6489";
        TELEFONES[2] = "6489";
        TELEFONES[3] = "6493";
        TELEFONES[4] = "6450";
        TELEFONES[5] = "6450";
        TELEFONES[6] = "6422";
        TELEFONES[7] = "6476";
        TELEFONES[8] = "6424";
        TELEFONES[9] = "3663-0016";

        DEPTOS = new String[10];
        DEPTOS[0] = "Suporte T.I";
        DEPTOS[1] = "Desenvolvimento T.I";
        DEPTOS[2] = "Suporte T.I";
        DEPTOS[3] = "Desenvolvimento T.I";
        DEPTOS[4] = "Suporte T.I";
        DEPTOS[5] = "Desenvolvimento T.I";
        DEPTOS[6] = "Suporte T.I";
        DEPTOS[7] = "Desenvolvimento T.I";
        DEPTOS[8] = "Suporte T.I";
        DEPTOS[9] = "Desenvolvimento T.I";

        EMPRESAS = new String[10];
        EMPRESAS[0] = "Laramara";
        EMPRESAS[1] = "Marvic´s";
        EMPRESAS[2] = "Grafica Laramara";
        EMPRESAS[3] = "Laramara";
        EMPRESAS[4] = "Marvic´s";
        EMPRESAS[5] = "Grafica Laramara";
        EMPRESAS[6] = "Laramara";
        EMPRESAS[7] = "Marvic´s";
        EMPRESAS[8] = "Grafica Laramara";
        EMPRESAS[9] = "Laramara";
    }

    public List<Ramal> criarRamais(int size) {
        List<Ramal> listaRamais = new ArrayList<Ramal>();

        for (int i = 0; i < size; i++) {
            listaRamais.add(new Ramal(NOMES[i].toString(), TELEFONES[i].toString(), DEPTOS[i].toString(), EMPRESAS[i].toString()));
        }
        return listaRamais;
    }

    public List<String> getNOMES() {
        return Arrays.asList(NOMES);
    }

    public List<String> getTELEFONES() {
        return Arrays.asList(TELEFONES);
    }

    public List<String> getEMPRESAS() {
        return Arrays.asList(EMPRESAS);
    }

    public List<String> getDEPTOS() {
        return Arrays.asList(DEPTOS);
    }

}
