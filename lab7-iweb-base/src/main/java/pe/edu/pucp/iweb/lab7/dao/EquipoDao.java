package pe.edu.pucp.iweb.lab7.dao;

import java.util.ArrayList;

import pe.edu.pucp.iweb.lab7.beans.EquipoRed;

public class EquipoDao extends BaseDao{ // TODO 2a: debe heredar de BaseDao

    /**
     * Ejercicio 2c: retorna los equipos de la sede indicada, ordenados por sede y modelo.
     * Si idSede es 0, retorna todos los equipos.
     *
     * Según la columna tipo, cree un objeto EquipoSwitch ('SWITCH') o EquipoAP ('AP').
     * Use PreparedStatement.
     */



    public ArrayList<EquipoRed> listarPorSede(int idSede) {
        ArrayList<EquipoRed> lista = new ArrayList<>();
        // TODO 2c
        try(Connection conn = this.getConnetion();Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM equipo");){
            while(rs.next()){
                EquipoRed equipoRed = new EquipoRed;
                equipoRed.get
            }
        }
        return lista;
    }
}
