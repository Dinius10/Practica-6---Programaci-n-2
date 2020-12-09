package com.dinius.dao;

import com.dinius.model.Revision;
import com.dinius.util.ConectorBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RevisionDao {
    private Connection connection;


    public RevisionDao(){
        connection = ConectorBD.getConnection();
    }

    public void addRevision(Revision revision){
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO revision (codigo, filtro, aceite, frenos, matricula) VALUES (?, ?, ?, ?, ?)"
            );
            preparedStatement.setString(1, revision.getCodigo());
            preparedStatement.setString(2, revision.getFiltros());
            preparedStatement.setString(3, revision.getAceite());
            preparedStatement.setString(4, revision.getFrenos());
            preparedStatement.setString(5, revision.getCoche());
            preparedStatement.executeUpdate();

            System.out.println(revision +  " revisado");
        }catch(SQLException e){
            System.out.println("Error al crear revision: " + e.getMessage());
        }
    }

    public void updateRevision(Revision revision){
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE revisiones SET codigo=?, filtro=?, aceite=?, frenos=?, matricula=?WHERE codigo=?"
            );
            preparedStatement.setString(1, revision.getCodigo());
            preparedStatement.setString(2, revision.getFiltros());
            preparedStatement.setString(3, revision.getAceite());
            preparedStatement.setString(4, revision.getFrenos());
            preparedStatement.setString(5, revision.getCoche());

            preparedStatement.setString(6, revision.getCodigo());
            preparedStatement.executeUpdate();

            System.out.println(revision +  " editado");
        }catch(SQLException e){
            System.out.println("Error al editar la revision: " + e.getMessage());
        }
    }

    public void deleteRevision(String codigo){
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM revisiones WHERE codigo=?"
            );
            preparedStatement.setString(1, codigo);
            preparedStatement.executeUpdate();

            System.out.println(codigo +  " eliminado");
        }catch(SQLException e){
            System.out.println("Error al eliminar revision: " + e.getMessage());
        }
    }

    public List<Revision> getALLRevisiones(){
        List<Revision> revisiones = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM revisiones");
            while (resultSet.next()) {
                 Revision revision= new Revision();
                revision.setCodigo(resultSet.getString("codigo"));
                revision.setFiltros(resultSet.getString("filtros"));
                revision.setAceite(resultSet.getString("aceite"));
                revision.setFrenos(resultSet.getString("frenos"));
                revision.setCoche(resultSet.getString("codigo"));

                revisiones.add(revision);

            }

        }catch (SQLException e){
            System.out.println("Error al listar los clientes: " + e.getMessage());
        }

        return revisiones;
    }
}
