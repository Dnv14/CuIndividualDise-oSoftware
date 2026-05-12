package PersistenciaConsola;

import Interfaces.IMembresiaDAO;
import Entidades.Membresia;
import Entidades.TipoMembresia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julian
 */
public class MembresiaListDAO {

    private static List<Membresia> membresias = new ArrayList<>();
    private static long contadorID = 1;

    static {
        membresias.add(new Membresia("1", TipoMembresia.BRONCE, 300.0, LocalDate.now().plusMonths(1)));
        membresias.add(new Membresia("2", TipoMembresia.PLATA, 500.0, LocalDate.now().plusMonths(1)));
        membresias.add(new Membresia("3", TipoMembresia.ORO, 750.0, LocalDate.now().plusMonths(1)));
    }

    public Membresia cargarMembresias(Membresia membresia) {
        membresia.setIdMembresia(String.valueOf(contadorID));
        contadorID++;
        this.membresias.add(membresia);
        return membresia;
    }

    public List<Membresia> obtenerTodas() {
        return this.membresias;
    }

    public Membresia obtenerPorId(String id) {
        return this.membresias.stream()
                .filter(m -> m.getIdMembresia().equals(id))
                .findFirst()
                .orElse(null);
    }

}
