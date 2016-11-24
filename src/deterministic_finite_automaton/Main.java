package deterministic_finite_automaton;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	public void start(Stage primaryStage) {
		try {
			
			Automaton automaton = new Automaton();
			Text initial_text = new Text("Welcome to the parking meter\nfinite automaton model.\nThrow a coin in.\n"
					+ "You can use coins 1,2 or 5\nto achieve a sum of coins equal to 7.");
			initial_text.setStyle("-fx-font: 40 arial;");
			Button button1 = new Button();
			Button button2 = new Button();
			Button button3 = new Button();
			button1.setText("Throw 1 coin in");
			button2.setText("Throw 2 coin in");
			button3.setText("Throw 5 coin in");
			HBox hbox = new HBox(30);
			
		    button1.setOnAction(new EventHandler<ActionEvent>() {
		      public void handle(ActionEvent event) {
		    	  int coin_enum = 0;
		    	  String state = automaton.define_state(coin_enum);
				  initial_text.setText(state);
		    	  
		      }
		    });
		    button2.setOnAction(new EventHandler<ActionEvent>() {
			      public void handle(ActionEvent event) {
			    	  int coin_enum = 1;
			    	  String state = automaton.define_state(coin_enum);
					  initial_text.setText(state);

			      }
			    }); 
		    button3.setOnAction(new EventHandler<ActionEvent>() {
			      public void handle(ActionEvent event) {
			    	  int coin_enum = 2;
			    	  String state = automaton.define_state(coin_enum);
					  initial_text.setText(state);

			      }
			    });
		       
		    hbox.setAlignment(Pos.CENTER);	    
		    hbox .getChildren().add(button1);
		    hbox .getChildren().add(button2);
		    hbox .getChildren().add(button3);
		    
			BorderPane root = new BorderPane();
			root.setPadding(new Insets(50));
			root.setBottom(hbox);
			
			root.setCenter(initial_text);
			Scene scene = new Scene(root,800,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
