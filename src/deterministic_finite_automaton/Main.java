//package deterministic_finite_automaton;
//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		 int state = Automaton.get_coin();
//		 System.out.println(state);
//		 while(state != 7){
//		 state = Automaton.get_coin();
//		 System.out.println(state);}
//		 
//
//	}}

package deterministic_finite_automaton;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


public class Main extends Application {
	private static final  Integer[][] states = new Integer[][]{
		{1,2,5},
		{2,3,6},
		{3,4,7},
		{4,5,0},
		{5,6,0},
		{6,7,0},
		{7,0,0},
		{0,0,0},
	};
	Text T = new Text("xD");
	private final static List<Integer> coins_list = Arrays.asList(1, 2, 5);
	public static int state = 0;
		
	@Override
	public void start(Stage primaryStage) {
		try {
			T.setStyle("-fx-font: 40 arial;");
			Button button1 = new Button();
			Button button2 = new Button();
			Button button3 = new Button();
			button1.setText("1");
			button2.setText("2");
			button3.setText("5");
			HBox hbox = new HBox(30);
			
		    button1.setOnAction(new EventHandler<ActionEvent>() {
		      public void handle(ActionEvent event) {
		    	  int coin_enum = 0;
				  state=states[state][coin_enum];
				  T.setText(String.valueOf(state));
				  check_status(state);		    	  
		      }
		    });
		    button2.setOnAction(new EventHandler<ActionEvent>() {
			      public void handle(ActionEvent event) {
			    	  int coin_enum = 1;
					  state=states[state][coin_enum];
					  
					  T.setText(String.valueOf(state));
					  check_status(state);
			      }
			    }); 
		    button3.setOnAction(new EventHandler<ActionEvent>() {
			      public void handle(ActionEvent event) {
			    	  int coin_enum = 2;
					  state=states[state][coin_enum];
					  
					  T.setText(String.valueOf(state));
					  check_status(state);
			      }
			    });
		       
		    hbox.setAlignment(Pos.CENTER);	    
		    hbox .getChildren().add(button1);
		    hbox .getChildren().add(button2);
		    hbox .getChildren().add(button3);
		    
			BorderPane root = new BorderPane();
			root.setPadding(new Insets(50));
			root.setBottom(hbox);
			root.setCenter(T);
			Scene scene = new Scene(root,600,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void check_status(int status){
	    	if(status == 7){
	    		T.setText("State achieved.");	    		
	    		;}
	    	
	    	else if(status == 0){
	    		T.setText("Too much cash, try again.");
	    		;}
	    	};
}
