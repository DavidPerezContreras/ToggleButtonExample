import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		
		ToggleButton wifi = new ToggleButton("Wifi");
		
		System.out.println(wifi.getInsets().toString());
		
		ToggleButton modoAvion = new ToggleButton("Modo Avion");
		
		
		
		//Añade wifi y modoAvion al mismo ToggleGroup.
		//A partir de ahora sólo permite seleccionar uno de ellos simultáneamente. Son excluyentes.
		
		ToggleGroup tgrp = new ToggleGroup();
		wifi.setToggleGroup(tgrp);
		modoAvion.setToggleGroup(tgrp);
		
		
		
		
		wifi.setOnAction(event -> {
			
			if(wifi.isSelected()) {
				System.out.println("WIFI ENCENDIDO");

	       	}else {
	       		System.out.println("WIFI APAGADO");
	       	}
		});
		
		
		
		//ToggleGroup
		//De los ToggleButton que añadimos a un ToggleGroup, solo podríamos tener uno seleccionado, 
		//o ninguno porque son excluyentes.
		
		
		
		
		
		root.getChildren().addAll(wifi,modoAvion);
		root.setPadding(new Insets(40));
		//Crea la escena y la muestra
		Scene sc1 = new Scene(root,600,420);
		
		primaryStage.setScene(sc1);
		
		primaryStage.show();
		
		
	}
	
	
	
	

}
