/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.awt.*;

/**
 *
 * @author paul_
 */
public class VentanaAgenda extends Frame {

    public VentanaAgenda(String title) {

        this.setTitle(title);

        this.setSize(600, 500);
        this.setLocation(200, 200);

        Panel panelPrincipal = new Panel();
        Panel panelNorte = new Panel();
        Panel panelCentro = new Panel();
        Panel panelSur = new Panel();
        Panel panelRegistrar = new Panel();
        BorderLayout posicionesInterfaz = new BorderLayout();

        this.setLayout(posicionesInterfaz);

        Label entrada = new Label("Bienvenido al menu de Usuario");
        panelNorte.add(entrada);
        panelNorte.setBackground(Color.GRAY);
        entrada.setForeground(Color.WHITE);
        this.add(panelNorte, BorderLayout.NORTH);

        GridLayout malla1 = new GridLayout(5, 1);
        panelPrincipal.setLayout(malla1);
        panelCentro.setLayout(malla1);

        GridLayout malla2 = new GridLayout(6, 2, 7, 0);
        panelRegistrar.setLayout(malla2);

        Label ingresarTelefono = new Label("Ingrese el telefono");
        Label espacio = new Label("");
        Label codigoTelefono = new Label("Ingrese el codigo del telefono: \n");
        TextField codigo = new TextField("", 10);
        Label numeroTelefono = new Label("Ingrese el numero de telefono: \n");
        TextField numero = new TextField("", 10);
        Label tipoTelefono = new Label("Ingrese el tipo de telefono: \n");
        TextField tipo = new TextField("", 10);
        Label operadoraTelefono = new Label("Ingrese la operadora del telefono: \n");
        TextField operadora = new TextField("", 10);
        Button volver = new Button("Volver");
        volver.setBackground(Color.DARK_GRAY);
        volver.setForeground(Color.WHITE);
        Button registrar = new Button("Registrar");
        registrar.setBackground(Color.DARK_GRAY);
        registrar.setForeground(Color.WHITE);

        panelRegistrar.add(ingresarTelefono);
        panelRegistrar.add(espacio);
        panelRegistrar.add(codigoTelefono);
        panelRegistrar.add(codigo);
        panelRegistrar.add(numeroTelefono);
        panelRegistrar.add(numero);
        panelRegistrar.add(tipoTelefono);
        panelRegistrar.add(tipo);
        panelRegistrar.add(operadoraTelefono);
        panelRegistrar.add(operadora);
        panelRegistrar.add(volver);
        panelRegistrar.add(registrar);
        panelCentro.add(panelRegistrar);

        Panel editar = new Panel();
        Panel panelEditar = new Panel();

        GridLayout malla3 = new GridLayout(6, 2, 7, 0);
        panelEditar.setLayout(posicionesInterfaz);
        editar.setLayout(malla3);

        Label ingresarNuevoTelefono = new Label("Ingrese los datos del nuevo telefono");
        Label espacio1 = new Label("");
        Label codigoTelefonoNuevo = new Label("Ingrese el nuevo codigo del telefono: \n");
        TextField codigoNuevo = new TextField("", 10);
        Label numeroTelefonoNuevo = new Label("Ingrese el nuevo numero de telefono: \n");
        TextField numeroNuevo = new TextField("", 10);
        Label tipoTelefonoNuevo = new Label("Ingrese el nuevo tipo de telefono: \n");
        TextField tipoNuevo = new TextField("", 10);
        Label operadoraTelefonoNuevo = new Label("Ingrese la nueva operadora del telefono: \n");
        TextField operadoraNuevo = new TextField("", 10);
        Button volver1 = new Button("Volver");
        volver1.setBackground(Color.DARK_GRAY);
        volver1.setForeground(Color.WHITE);
        Button actualizar = new Button("Registrar");
        actualizar.setBackground(Color.DARK_GRAY);
        actualizar.setForeground(Color.WHITE);

        editar.add(ingresarNuevoTelefono, BorderLayout.NORTH);
        editar.add(espacio1);
        editar.add(codigoTelefonoNuevo);
        editar.add(codigoNuevo);
        editar.add(numeroTelefonoNuevo);
        editar.add(numeroNuevo);
        editar.add(tipoTelefonoNuevo);
        editar.add(tipoNuevo);
        editar.add(operadoraTelefonoNuevo);
        editar.add(operadoraNuevo);
        editar.add(volver1);
        editar.add(actualizar);
        panelCentro.add(editar);

        Panel panelEliminar = new Panel();
        GridLayout malla4 = new GridLayout(4, 1);
        panelEliminar.setLayout(malla4);

        Label eliminarTelefono = new Label("Eliminar Telefono");
        Label espacio2 = new Label("");
        Label codigoTelefonoEliminar = new Label("Ingrese el codigo del telefono a eliminar: \n");
        TextField codigoEliminar = new TextField("1", 5);
        Button eliminar = new Button("Eliminar");
        eliminar.setBackground(Color.DARK_GRAY);
        eliminar.setForeground(Color.WHITE);
        Button cancelar = new Button("Cancelar");
        cancelar.setBackground(Color.DARK_GRAY);
        cancelar.setForeground(Color.WHITE);

        panelEliminar.add(eliminarTelefono);
        panelEliminar.add(espacio2);
        panelEliminar.add(codigoTelefonoEliminar);
        panelEliminar.add(codigoEliminar);
        panelEliminar.add(eliminar);
        panelEliminar.add(cancelar);
        panelCentro.add(panelEliminar);

        Panel panelBuscar = new Panel();
        panelBuscar.setLayout(malla4);

        Label buscarTelefono = new Label("Busqueda de Telefono por codigo del Usuario");
        Label codigoTelefonoBuscar = new Label("Ingrese el codigo del telefono a buscar: \n");
        TextField codigoBuscar = new TextField("", 5);
        Button buscar = new Button("Buscar");
        buscar.setBackground(Color.DARK_GRAY);
        buscar.setForeground(Color.WHITE);
        buscar.setSize(100, 10);

        panelBuscar.add(buscarTelefono);
        panelBuscar.add(codigoTelefonoBuscar);
        panelBuscar.add(codigoBuscar);
        panelBuscar.add(buscar);
        panelCentro.add(panelBuscar);

        Panel panelListar = new Panel();
        GridLayout malla5 = new GridLayout(2, 1);
        panelListar.setLayout(malla5);

        Label listarTelefono = new Label("Lista de sus telefonos");
        Button listar = new Button("Listar");
        listar.setBackground(Color.DARK_GRAY);
        listar.setForeground(Color.WHITE);
        Label espacio3 = new Label("");
        Button volver2 = new Button("Volver");
        volver2.setBackground(Color.DARK_GRAY);
        volver2.setForeground(Color.WHITE);

        panelListar.add(listarTelefono);
        panelListar.add(espacio3);
        panelListar.add(listar);
        panelListar.add(volver2);

        panelCentro.add(panelListar);
        panelCentro.setBackground(Color.WHITE);
        panelCentro.setForeground(Color.BLACK);

        this.add(panelCentro, BorderLayout.CENTER);

        Panel panelSalir = new Panel();
        GridLayout malla6 = new GridLayout(1, 2, 7, 0);
        panelSalir.setLayout(malla6);

        Button inicio = new Button("Inicio");
        inicio.setBackground(Color.DARK_GRAY);
        inicio.setForeground(Color.WHITE);
        Button cerrarSesion = new Button("Cerrar Secion");
        cerrarSesion.setBackground(Color.DARK_GRAY);
        cerrarSesion.setForeground(Color.WHITE);
        Button salir = new Button("Salir");
        salir.setBackground(Color.DARK_GRAY);
        salir.setForeground(Color.WHITE);

        panelSalir.add(inicio);
        panelSalir.add(cerrarSesion);
        panelSalir.add(salir);

        this.add(panelSalir, BorderLayout.SOUTH);
        this.setVisible(true);

    }

}
