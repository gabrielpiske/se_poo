
package interfaces;

import entidades.Local;
import java.util.List;

/**
 *
 * @author gabriel_piske
 */
public interface ICRUDLocal {
    Local inserir(Local loc);
    Local alterar(Local loc);
    void deletar(int id);
    Local consultar(int id);
    List<Local> consultar();
}
