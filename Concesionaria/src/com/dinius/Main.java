package com.dinius;

import com.dinius.dao.ClienteDao;
import com.dinius.dao.CocheDao;
import com.dinius.dao.RevisionDao;
import com.dinius.model.Cliente;
import com.dinius.model.Coche;
import com.dinius.model.Revision;
import com.dinius.util.ConectorBD;
import sun.util.cldr.CLDRLocaleDataMetaInfo;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("1455", "Carlos Perez", "Cochabamba", "Av. Beiging s/n", 4244584);
        //Cliente juan = new Cliente("1455", "Juan Claros", "Cochabamba", "Av. Beiging s/n", 4478424);
        //Cliente pedro = new Cliente("1555", "Pedro Gutierrez", "Santa Cruz", "Av. ayacucho s/n", 4424679);
        //Cliente diego = new Cliente("1655", "Diego Cossio", "Sucre", "Av. aroma s/n", 4457315);
        //Cliente david = new Cliente("1755", "David Vargas", "La Paz", "Av. jojos s/n", 4489673);
        //Cliente lorena = new Cliente("10455", "Lorena Salva", "Tarija", "Av. principal s/n", 4458137);
        //Cliente maria = new Cliente("1855", "Maria Suarez", "Oruro", "Av. peque s/n", 4412784);
        //Cliente alvaro = new Cliente("1955", "Alvaro Rojas", "Cochabamba", "Av. Beiging s/n", 454673);

        //CRUD CLIENTES
        //ClienteDao clienteDao = new ClienteDao();
        //CREATE
        //clienteDao.addCliente(juan);
        //clienteDao.addCliente(pedro);
        //clienteDao.addCliente(diego);
        //clienteDao.addCliente(david);
        //clienteDao.addCliente(lorena);
        //clienteDao.addCliente(maria);
        //clienteDao.addCliente(alvaro);

        //READ
        /*
        List<Cliente> clientes = clienteDao.getALLClientes();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);

            System.out.println(cliente);
        }
        */

        //UPDATE
        //Cliente cliente = new Cliente("1455", "Fernando Torrico", "La Paz", "Av. 6 de Agosto s/n", 4444445);
        //clienteDao.updateCliente(cliente);

        //DELETE
        //clienteDao.deleteCliente("1455");
        //clienteDao.deleteCliente("1555");
     //----------------------------------------------------------------------------------------------------------

        //Coche coche = new Coche("2255", "TOYOTA", "1999", "Rojo", 55000,"1455");
        //Coche aaa = new Coche("3355", "SUZUKI", "2001", "Amarillo", 400000,"1555");
        //Coche bbb = new Coche("4455", "TOYOTA ", "2020", "Verde", 15000,"1655");
        //Coche ccc = new Coche("6655", "YUNDAI", "2005", "Rojo", 12000,"1755");
        //Coche ddd = new Coche("7755", "SUZUKI", "2010", "Negro", 30000,"");
        //Coche eee = new Coche("7722", "LAMBORGINI", "2015", "Negro", 500000,"10455");
        //Coche fff = new Coche("8855", "TOYOTA", "2016", "Negro", 8000,"1855");
        //Coche ggg = new Coche("9955", "TOYOTA", "2020", "Blanco", 10000,"1955");

        //CRUD COCHES
       // CocheDao cocheDao = new CocheDao();
        //CREATE
        //cocheDao.addCoche(aaa);
        //cocheDao.addCoche(bbb);
        //cocheDao.addCoche(ccc);
        //cocheDao.addCoche(ddd);
        //cocheDao.addCoche(eee);
        //cocheDao.addCoche(fff);
        //cocheDao.addCoche(ggg);

        //READ
        /*
        List<Coche> coches = cocheDao.getALLCoches();
        for (int i = 0; i < coches.size(); i++) {
            Coche coche = coches.get(i);

            System.out.println(coche);
        }
        */

        //UPDATE
        //Coche coche = new Coche("2255", "TOYOTA", "1999", "Rojo", 55000,"1455");
        //cocheDao.updateCoche(coche);

        //DELETE
        //cocheDao.deleteCoche("3355");
        //cocheDao.deleteCoche("4455");
     // ----------------------------------------------------------------------------------------------------------
        Revision revision = new Revision("3333", "si", "no", "Buenos", "2255");
        Revision aaaa = new Revision("4444", "si", "no", "Buenos", "3355");
        Revision bbbb = new Revision("5555", "no ", "si", "Malos", "4455");


        //CRUD REVISIONES
         RevisionDao revisionDao = new RevisionDao();
        //CREATE
        revisionDao.addRevision(aaaa);
        revisionDao.addRevision(bbbb);

        //READ

        List<Revision> revisiones = revisionDao.getALLRevisiones();
        for (int i = 0; i < revisiones.size(); i++) {
            revision = revisiones.get(i);

            System.out.println(revision);
        }


        //UPDATE
        aaaa = new Revision("4444", "si", "no", "Buenos", "3355");
        revisionDao.updateRevision(aaaa);

        //DELETE
        revisionDao.deleteRevision("4444");
        revisionDao.deleteRevision("5555");
    }
}
