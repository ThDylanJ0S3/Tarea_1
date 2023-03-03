package Controlador;



import Modelo.Persona;
import Modelo.AlertW;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Dylan Meza
 */
public class Main extends Application{
   Stage ventana;
   
    public static void main(String[] args) {
        launch(args);
    
    }
    
    //Variables locales
    private int cont = 0;
    private int result = 0;
    private final ChoiceBox<String> choiceBox = new ChoiceBox<>();
    private final ChoiceBox<Persona> choiceBox1 = new ChoiceBox<>();
    private final ChoiceBox<Persona> choiceBox2 = new ChoiceBox<>();

    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        ventana = primaryStage;
        ventana.setTitle("Calculadora");
        
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

            
        //Resultado
        TextArea resultInput = new TextArea("Resultado: "+ result);
        GridPane.setConstraints(resultInput, 2, 0);
        GridPane.setColumnSpan(resultInput, 3);
        resultInput.setPrefWidth(200);
        resultInput.setPrefHeight(10);
        
        //Nombre
        Label nameLabel = new Label("Nombre:");
        GridPane.setConstraints(nameLabel, 0, 2);
        nameLabel.setPrefHeight(10);
              
        //Ingrese Nombre
        TextField nameInput = new TextField();
        nameInput.setPromptText("Ingrese el nombre");
        GridPane.setConstraints(nameInput, 1, 2);
        
        //Edad
        Label ageLabel = new Label("Edad:");
        GridPane.setConstraints(ageLabel, 0, 4);
               
        //Ingrese Edad
        TextField ageInput = new TextField();
        ageInput.setPromptText("Ingrese la edad");
        GridPane.setConstraints(ageInput, 1, 4);
        
        //Provincia
        Label provLabel = new Label("Provincia:");
        GridPane.setConstraints(provLabel, 0, 3);
        
        //DropDownBox Provincias
        choiceBox.setValue("San José");
        choiceBox.getItems().addAll("San José","Alajuela","Cartago","Heredia","Guanacaste","Puntarenas","Limón");
        GridPane.setConstraints(choiceBox, 1, 3);
      
        // Boton Agregar
        Button boton = new Button();
        boton.setText("Agregar");
        boton.setOnAction((e) -> {
            //Ciclo while que limita la creacionde personas
            while(cont<=4){
            int edadPer = Integer.parseInt(ageInput.getText());
                if (!nameInput.getText().isBlank() && !ageInput.getText().isBlank() && edadPer>0){
                            cont ++;
                            Persona persona = new Persona(nameInput.getText(),choiceBox.getValue(),edadPer);
                            choiceBox1.getItems().add(persona);
                            choiceBox2.getItems().add(persona);
                            break;
                        }
                        else{ 
                            AlertW.display("ERROR","Debe ingresar los datos solicitados y la edad debe ser distinta a 0");
                            break;}    
                    }
            if (cont>4) AlertW.display("ERROR","No puede añadir más personas");

        });
        
        // Boton suma
        Button botonSum = new Button();
        botonSum.setText("Suma");
        botonSum.setOnAction((e) -> {
            result = 0;
            result = choiceBox1.getSelectionModel().getSelectedItem().getEdad() + choiceBox2.getSelectionModel().getSelectedItem().getEdad();
            resultInput.setText("Resultado: " + result);    
        });
        
        // Boton resta
        Button botonRes = new Button();
        botonRes.setText("Resta");
        botonRes.setOnAction((e) -> {
            result = 0;
            result = choiceBox1.getSelectionModel().getSelectedItem().getEdad() - choiceBox2.getSelectionModel().getSelectedItem().getEdad();
            resultInput.setText("Resultado: " + result);
        });
                
        // Boton dividir
        Button botonDiv = new Button();
        botonDiv.setText("Division");
        botonDiv.setOnAction((c) -> {
            result = 0;
            result = choiceBox1.getSelectionModel().getSelectedItem().getEdad() / choiceBox2.getSelectionModel().getSelectedItem().getEdad();
            resultInput.setText("Resultado: " + result);
        });
        
        // Boton multiplicar
        Button botonMult = new Button();
        botonMult.setText("Multiplicacion");
        botonMult.setOnAction((a) -> {
            result = 0;
            result = choiceBox1.getSelectionModel().getSelectedItem().getEdad() * choiceBox2.getSelectionModel().getSelectedItem().getEdad();
            resultInput.setText("Resultado: " + result);         
        });
        
        //Divide la interfaz en filas y columnas, y le da un ancho y un largo a cada boton y Choice Box
        GridPane.setConstraints(boton, 1, 6); 
        GridPane.setConstraints(botonSum, 4, 5);
        GridPane.setConstraints(botonRes, 4, 6);       
        GridPane.setConstraints(botonDiv, 5, 5);       
        GridPane.setConstraints(botonMult, 5, 6);            
        GridPane.setConstraints(choiceBox1, 5, 2);
        GridPane.setConstraints(choiceBox2, 5, 3);
        boton.setPrefWidth(150);
        boton.setPrefHeight(10);
        botonSum.setPrefWidth(200);
        botonSum.setPrefHeight(10);
        botonRes.setPrefWidth(200);
        botonRes.setPrefHeight(10);
        botonDiv.setPrefWidth(200);
        botonDiv.setPrefHeight(10);
        botonMult.setPrefWidth(200);
        botonMult.setPrefHeight(10);
        choiceBox.setPrefWidth(200);
        choiceBox.setPrefHeight(10);
        choiceBox1.setPrefWidth(200);
        choiceBox1.setPrefHeight(10);
        choiceBox2.setPrefWidth(200);
        choiceBox2.setPrefHeight(10);
        
        //Muestra todos los objetos en la interfaz
        grid.getChildren().addAll(botonSum,botonRes,botonDiv,botonMult, resultInput, nameLabel,nameInput,provLabel,boton, ageLabel, ageInput, choiceBox,choiceBox1,choiceBox2);
        Scene scene = new Scene(grid, 800, 250);
        ventana.setScene(scene);
        ventana.show();
    }  
}