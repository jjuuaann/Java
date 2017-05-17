import javafx.application.Application;
import javafx.stage.Stage;
//import javafx.scene.control.Button;
import javafx.scene.control.*;  //imports the TextField, Label & Button
import javafx.scene.Scene;
import javafx.scene.layout.GridPane; //adds the GridPane layout
import javafx.geometry.Pos; //allows alignment
import javafx.scene.paint.Color;  // To set the text on the button to red


public class Tip extends Application {
	
	@Override // Override the start method in the Application class
    public void start(Stage primaryStage) {   
		
		GridPane tipPane = new GridPane();   
		tipPane.setAlignment(Pos.CENTER);   // Position tipPane for center
		tipPane.setVgap(10); // Veritical spacing to 10
		tipPane.setHgap(5); // Horizontal spacing to 5
		
		// Create text fields to input data
		TextField tfCheck = new TextField();
		TextField tfPercent = new TextField();
		TextField tfTotal = new TextField();
		
		tfTotal.setEditable(false); // tfTotal is set so that the result of calculation cannot be changed

		
		// position for data alignment with field (Right because numeric data).
		tfCheck.setAlignment(Pos.BOTTOM_RIGHT);
		tfPercent.setAlignment(Pos.BOTTOM_RIGHT);
		tfTotal.setAlignment(Pos.BOTTOM_RIGHT);

		
		Label lbCheck = new Label("Check Amount");
		Label lbPercent = new Label("Tip Percent");
		Label lbTotal = new Label("Total Amount");
		
		Button btCalc = new Button("Calculate"); // Creates button to execute calculation of tip
		btCalc.setTextFill(Color.RED); //set the text on the button to red
			
		
		/*
		 * GridPane layout adds all of the nodes and controls 
		 * that were created 
		 		 */
		 tipPane.add(lbCheck, 0 , 0);
		 tipPane.add(tfCheck, 1 , 0);
		 tipPane.add(lbPercent, 0 , 1);
		 tipPane.add(tfPercent, 1 , 1);
		 tipPane.add(lbTotal, 0 , 2);
		 tipPane.add(tfTotal, 1 , 2);
		 tipPane.add(btCalc, 1 , 4); 

		 btCalc.setOnAction(e ->
		 {
		 // Java code to execute when the event is fired
		 double check = Double.parseDouble(tfCheck.getText());
		 double percent = Double.parseDouble(tfPercent.getText());
		 percent = percent / 100;
		 double total = check + check * percent;
		 tfTotal.setText(Double.toString(total));
		 }); 
		 
		 Scene tipScene = new Scene(tipPane, 400, 300);

		 
		 primaryStage.setTitle("Gratuity");
		 primaryStage.setScene(tipScene); 
		 primaryStage.show();
	
		 
	}
	public static void main(String[] args) {
		 launch(args);
		 }
		 
	
}