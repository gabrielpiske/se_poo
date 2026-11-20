package DAO;

import entidades.Local;
import interfaces.ICRUDLocal;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utils.ConectaDB;

/**
 *
 * @author gabriel_piske
 */
public class LocalDAO implements ICRUDLocal{

    @Override
    public Local inserir(Local loc) {
        try {
           String sql = "insert into tb_local(nome, endereco, nome_responsavel, celular_responsavel, email_responsavel)values(?,?,?,?,?)";
           PreparedStatement stm = ConectaDB.getConexao().prepareStatement(sql);
           stm.setString(1, loc.getNome());
           stm.setString(2, loc.getEndereco());
           stm.setString(3, loc.getNomeResponsavel());
           stm.setString(4, loc.getEmailResponsavel());
           stm.setString(5, loc.getEmailResponsavel());
           stm.execute();
           return loc;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    @Override
    public Local alterar(Local loc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Local consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Local> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
