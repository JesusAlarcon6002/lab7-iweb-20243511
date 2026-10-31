package pe.edu.pucp.iweb.lab7.dao;

import java.util.ArrayList;

import pe.edu.pucp.iweb.lab7.beans.Sede;

public class SedeDao extends BaseDao { // TODO 2a: debe heredar de BaseDao

    /**
     * Ejercicio 2c: retorna todas las sedes ordenadas por nombre.
     */
    public ArrayList<Sede> listar() {
        ArrayList<Sede> lista = new ArrayList<>();
        // TODO 2c
        try(Connection conn = this.getConnetion();Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM sede");){
            while(rs.netx()){
                Sede sede = new Sede;
                sede.getIdSede(rs.getInt(1));
                sede.getNombre(rs.getString(2));
                lista.add(sede);
            }
        }
        return lista;
    }

    /**
     * Apoyo para el Ejercicio 4: retorna la sede con el id indicado,
     * o null si no existe.
     */
    public Sede buscarPorId(int idSede) {
        // TODO 4
        return null;
    }
}
