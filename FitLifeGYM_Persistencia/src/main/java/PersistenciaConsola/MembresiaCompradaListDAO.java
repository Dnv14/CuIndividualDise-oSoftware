package PersistenciaConsola;

import Interfaces.IMembresiaCompradaDAO;
import Entidades.MembresiaComprada;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julian
 */
public class MembresiaCompradaListDAO implements IMembresiaCompradaDAO {

    private List<MembresiaComprada> membresiasCompradas = new ArrayList<>();
    private static Long contadorID = 1L;

    @Override
    public MembresiaComprada guardar(MembresiaComprada compra) {
        contadorID++;
        this.membresiasCompradas.add(compra);
        return compra;
    }

    @Override
    public List<MembresiaComprada> obtenerTodas() {
        return this.membresiasCompradas;
    }

}
