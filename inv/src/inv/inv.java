package inv;

import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
import javafx.scene.control.*;  //imports the TextField, Label & Button
//import javafx.scene.Scene;
import javafx.scene.layout.GridPane; //adds the GridPane layout
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Pos; //allows alignment
//import javafx.scene.paint.Color;  // To set the text on the button to red


public class inv extends Application {
	
	//private Node lbCheck;

	@Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
		
		GridPane tipPane = new GridPane();   
		tipPane.setAlignment(Pos.CENTER);   // Position tipPane for center
		tipPane.setVgap(10); // Veritical spacing to 10
		tipPane.setHgap(5); // Horizontal spacing to 5
		
		
		Rectangle rec = new Rectangle();
        rec.setWidth(12);
        rec.setHeight(12);
        rec.setFill(Color.ORANGE);
       
    
		// Create text fields to input data
		TextField invAmount = new TextField();
		TextField aIntRate = new TextField();
		TextField nYear = new TextField();
		TextField fValue = new TextField();
		
		fValue.setEditable(false);
		
		invAmount.setAlignment(Pos.BOTTOM_RIGHT);
		aIntRate.setAlignment(Pos.BOTTOM_RIGHT);
		nYear.setAlignment(Pos.BOTTOM_RIGHT);
		fValue.setAlignment(Pos.BOTTOM_RIGHT);
		
		
		
		Label lbInv = new Label("Invest");
		Label lbIntRate = new Label("Annual Interest Rate");
		Label lbYear = new Label("Number of Years");
		Label lbValue = new Label("Future Investment Value");
		
		Button btCalc = new Button("Calculate"); // Creates button to execute calculation of tip
		btCalc.setTextFill(Color.RED); //set the text on the button to red
		
		/*
		 * GridPane layout adds all of the nodes and controls 
		 * that were created 
		 		 */
		 tipPane.add(lbInv, 0 , 0);
		 tipPane.add(invAmount, 1 , 0);
		 tipPane.add(lbIntRate, 0 , 1);
		 tipPane.add(aIntRate, 1 , 1);
		 tipPane.add(lbYear, 0 , 2);
		 tipPane.add(nYear, 1 , 2);
		 tipPane.add(lbValue, 0 , 3);
		 tipPane.add(fValue, 1 , 3);
		 tipPane.add(btCalc, 1 , 4); 
		
		btCalc.setOnAction(e ->
		
		{
			 // Java code to execute when the event is fired
			 double investment = Double.parseDouble(invAmount.getText());
			 double interest = Double.parseDouble(aIntRate.getText());
			 double years = Double.parseDouble(nYear.getText());			 
			 //percent = percent / 100;
			 //double total = investment*(Math.pow((1+interest),(2*years)));
			 double total = (Math.pow((1+interest*0.01),(12*years))*investment);
			 DecimalFormat f = new DecimalFormat("##.00");
			 
			 //fValue.setText(Double.toString(total));
			 fValue.setText(f.format(total));
			 
			 }); 
		
		
		Scene invScene = new Scene(tipPane, 400, 300);

		 
		 primaryStage.setTitle("Investment");
		 primaryStage.setScene(invScene); 
		 primaryStage.show();
	
		
		
	}
	
	public static void main(String[] args) {
		 launch(args);
		 }
}