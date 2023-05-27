package com.vm.registro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    ObservableList<Articulo> lista = FXCollections.observableArrayList(
            new Articulo(1,"Taza","Cocina","123412","1000"),
            new Articulo(2,"pistola","nose","19912","10")
    );
    //FXML variables
    @FXML private TextField addNombre, addStock, addSKU;
    @FXML private ComboBox <String> addCategorias;
    @FXML private TableColumn <Articulo, Integer> idTable;
    @FXML private TableColumn <Articulo, String> nombreTable, categoriaTable, skuTable,stockTable;
    @FXML private TableView <Articulo> mainTable;
    @FXML private AnchorPane mainPane, addPane;

    //FXML methods
    //Habilita el panel de tabla
    @FXML
    public void onClickDatabaseButton(MouseEvent event)
    {
        disableAllAddPanels();
        mainPane.setVisible(true);
    }

    //Vuelve visible el panel de add
    @FXML
    public void onClickAddButton(MouseEvent event)
    {
        disableAllAddPanels();
        addPane.setVisible(true);
    }

    //Sale del sistema
    @FXML
    public void onClickExitButton(MouseEvent event)
    {
        System.exit(0);
    }

    //Agrega datos a la tabla
    @FXML
    public void onSaveButtonClicked()
    {
        lista.add(new Articulo(3,addNombre.getText(),addCategorias.getValue(),addSKU.getText(),addStock.getText()));
        resetAddEntryOptions();
    }

    //Reinicia los Entry
    @FXML
    public void onCancelButtonClicked()
    {
        resetAddEntryOptions();
    }

    //Inicializador
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        addCategorias.getItems().addAll("Cocina","Electronicos"); //Agrega elementos al combobox
        //Trabaja la tabla
        idTable.setCellValueFactory(new PropertyValueFactory<Articulo, Integer>("id"));
        nombreTable.setCellValueFactory(new PropertyValueFactory<Articulo, String>("nombre"));
        categoriaTable.setCellValueFactory(new PropertyValueFactory<Articulo, String>("categoria"));
        skuTable.setCellValueFactory(new PropertyValueFactory<Articulo, String>("sku"));
        stockTable.setCellValueFactory(new PropertyValueFactory<Articulo, String>("stock"));
        mainTable.setItems(lista);
    }

    // Custom methods
    //Constructor
    public HelloController() {}

    public void resetAddEntryOptions()  //Reinicia los entry
    {
        addNombre.setText("");
        addCategorias.setId("");
        addStock.setText("");
        addSKU.setText("");
    }
    //Desabilita todos los paneles
    public void disableAllAddPanels()
    {
        mainPane.setVisible(false);
        addPane.setVisible(false);
    }

}