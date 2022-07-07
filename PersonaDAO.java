package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    Conexion Conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List Listar() {
        List<Persona> datos = new ArrayList<>();
        String sql = "select * from bd_ejemplo";
        try {
            con = Conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona p = new Persona();
                p.setId(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setCorreo(rs.getString(3));
                p.setTel(rs.getInt(4));
                datos.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }

}
