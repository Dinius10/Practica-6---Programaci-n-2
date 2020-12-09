package com.dinius.dao;

import com.dinius.model.Coche;
import com.dinius.util.ConectorBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CocheDao {
    private Connection connection;

    public CocheDao(){
        connection = ConectorBD.getConnection();
    }

    public void addCoche(Coche coche){
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO coche (matricula, marca, modelo, color, precio,nif) VALUES (?, ?, ?, ?, ?,?)"
            );
            preparedStatement.setString(1, coche.getMatricula());
            preparedStatement.setString(2, coche.getMarca());
            preparedStatement.setString(3, coche.getModelo());
            preparedStatement.setString(4, coche.getColor());
            preparedStatement.setDouble(5, coche.getPrecio());
            preparedStatement.setString(6, coche.getCliente());
            preparedStatement.executeUpdate();

            System.out.println(coche +  " creado");
        }catch(SQLException e){
            System.out.println("Error al crear el cliente: " + e.getMessage());
        }
    }

    public void updateCoche(Coche coche){
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE coche SET matricula=?, marca=?, modelo=?, color=?, precio=?, nif=? WHERE matricula=?"
            );
            preparedStatement.setString(1, coche.getMatricula());
            preparedStatement.setString(2, coche.getMarca());
            preparedStatement.setString(3, coche.getModelo());
            preparedStatement.setString(4, coche.getColor());
            preparedStatement.setDouble(5, coche.getPrecio());
            preparedStatement.setString(6, coche.getCliente());

            preparedStatement.setString(7, coche.getMatricula());
            preparedStatement.executeUpdate();

            System.out.println(coche +  " editado");
        }catch(SQLException e){
            System.out.println("Error al editar el coche: " + e.getMessage());
        }
    }

    public void deleteCoche(String matricula){
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM coches WHERE matricula=?"
            );
            preparedStatement.setString(1, matricula);
            preparedStatement.executeUpdate();

            System.out.println(matricula +  " eliminado");
        }catch(SQLException e){
            System.out.println("Error al eliminar coche: " + e.getMessage());
        }
    }

    public List<Coche> getALLCoches(){
        List<Coche> coches = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM coches");
            while (resultSet.next()) {
                Coche coche = new Coche();
                coche.setMatricula(resultSet.getString("matricula"));
                coche.setMarca(resultSet.getString("marca"));
                coche.setModelo(resultSet.getString("modelo"));
                coche.setColor(resultSet.getString("color"));
                coche.setPrecio(resultSet.getDouble("precio"));
                coche.setCliente(resultSet.getString("nif"));

                coches.add(coche);

            }

        }catch (SQLException e){
            System.out.println("Error al listar los clientes: " + e.getMessage());
        }

        return coches;
    }
}
