
import java.io.*;
//import java.lang.*;
//import java.util.*;
import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
//import javafx.scene.control.*;//imports controls
//import javafx.scene.Scene;
import javafx.scene.layout.GridPane; //adds the GridPane layout
//import javafx.scene.paint.Color;
//import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.geometry.Insets;
//import javafx.geometry.Insets;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
import javafx.geometry.Pos;          //allows alignment
 



public class Catering extends Application{
	
	

	public void start(Stage primaryStage) throws IOException{  
		
		
		Font labelFont = Font.font("Arial", FontWeight.BOLD, 16);
		
		GridPane mainPane = new GridPane();  // Position mainPane for center 
		mainPane.setPadding(new Insets(10, 10, 10, 10));
		//mainPane.setVgap(8);
		//mainPane.setHgap(10);
		mainPane.setAlignment(Pos.TOP_LEFT);   // Set spaces between controls            
	    mainPane.setHgap(10);   // Horizontal spacing to 20    
	    mainPane.setVgap(10);   // Horizontal spacing to 10
	    
	    
	    Scene ckScene = new Scene(mainPane, 700, 00); 
        primaryStage.setTitle("Juan's Catering Service");  
        
        primaryStage.setScene(ckScene); 
        primaryStage.show(); 
        
        
        Label lbCustomer = new Label("Customer Info");		
		lbCustomer.setFont(labelFont);


        TextField firstName = new TextField();
        TextField lastName = new TextField();
        TextField phoneNum = new TextField();
        TextField invitedGuests = new TextField();
        
     
        
        firstName.setAlignment(Pos.TOP_LEFT);
        lastName.setAlignment(Pos.TOP_LEFT);
		phoneNum.setAlignment(Pos.TOP_LEFT);
		invitedGuests.setAlignment(Pos.TOP_LEFT);
		
		Label lbFName = new Label("First");
		//lbFName.setPadding(new Insets(0, 0, 00, 150));
		Label lbLName = new Label("Last");
		//lbLName.setPadding(new Insets(0, 0, 00, 30));
		Label lbPNum = new Label("Phone Number");
		Label lbIG = new Label("Guests");
		//lbIG.setPadding(new Insets(0, -500, 0, 140));
        
		mainPane.add(lbFName, 0 , 0);
		mainPane.add(firstName, 1 , 0);
		mainPane.add(lbLName, 2 , 0);
		mainPane.add(lastName, 3 , 0);
		mainPane.add(lbPNum, 0 , 1);
		mainPane.add(phoneNum, 1 , 1);
		mainPane.add(lbIG, 2 , 1);
		mainPane.add(invitedGuests, 3 , 1);
		
		Label lbFood = new Label("Food");		
		lbFood.setFont(labelFont);
		mainPane.add(lbFood, 0 , 4);
		
				
        ComboBox<String> entrée = new ComboBox <> ();
        entrée.setEditable(false);
        entrée.setPromptText("Choose an entrée");
        entrée.getItems().addAll("Filet Mignon", "lemon Smoked Salmon", "Bacon Lovers Cheese Burger","Veggie Pizza");
        // gets input directly after selection
        //entrée.setOnAction( e -> System.out.println("User selected: " + entrée.getValue() ) );
        
        //shows to rows of the combo box
        entrée.setVisibleRowCount(3);
        
        mainPane.add(entrée, 0, 5); 
           
        /*
        First Side
        The customer must choose one entrée from a group of at least four choices.
        If the user attempts to choose more than two side dishes, remove all the current side dish selections so that the user can start over.
        
        Mine Does not validate like that, but it makes sure they can only pick two items
        */
        
        RadioButton rbFruit1 = new RadioButton("Fruit Salad");
        rbFruit1.setSelected(true);
        RadioButton rbSide1 = new RadioButton("Side Salad");
        RadioButton rbGBeans1 = new RadioButton("Green Beans");
        RadioButton rbAsparagus1 = new RadioButton("Asparagus"); 
       
        //creates a toggle group so one button can be selected
        ToggleGroup rbGroup1 = new ToggleGroup();
        
        rbFruit1.setToggleGroup(rbGroup1);
        rbSide1.setToggleGroup(rbGroup1);
        rbGBeans1.setToggleGroup(rbGroup1);
        rbAsparagus1.setToggleGroup(rbGroup1);

        
        mainPane.add(rbFruit1, 0, 8);
        mainPane.add(rbSide1, 1, 8);
        mainPane.add(rbGBeans1, 2, 8);
        mainPane.add(rbAsparagus1, 3, 8);

        
        RadioButton rbAsparagus = new RadioButton("Asparagus");

        RadioButton rbFruit = new RadioButton("Fruit Salad");

        RadioButton rbSide = new RadioButton("Side Salad");
        rbSide.setSelected(true);

        RadioButton rbGBeans = new RadioButton("Green Beans");

       
        //creates a toggle group so one buttin can be selected
        ToggleGroup rbGroup = new ToggleGroup();
        
        rbFruit.setToggleGroup(rbGroup);
        rbSide.setToggleGroup(rbGroup);
        rbGBeans.setToggleGroup(rbGroup);
        rbAsparagus.setToggleGroup(rbGroup);

        mainPane.add(rbFruit, 0, 9);
        mainPane.add(rbSide, 1, 9);
        mainPane.add(rbGBeans, 2, 9);
        mainPane.add(rbAsparagus, 3, 9);
      
        
        
        RadioButton rbChocolate = new RadioButton("Chocolate Cake");
        
        RadioButton rbKeyLime = new RadioButton("Key Lime Pie");

        RadioButton rbBannana = new RadioButton("Bannana Pudding");

        RadioButton rbIceCream = new RadioButton("Ice Creame");
        rbIceCream.setSelected(true);
       
        ToggleGroup rbDessert = new ToggleGroup();
        
        rbChocolate.setToggleGroup(rbDessert);
        rbKeyLime.setToggleGroup(rbDessert);
        rbBannana.setToggleGroup(rbDessert);
        rbIceCream.setToggleGroup(rbDessert);



        //mainPane.add(btFavorite, 0, 9);
        mainPane.add(rbChocolate, 0, 10);
        mainPane.add(rbKeyLime, 1, 10);
        mainPane.add(rbBannana, 2, 10);
        mainPane.add(rbIceCream, 3, 10);
       
        
        Button btCalc = new Button("Complete"); 
        mainPane.add(btCalc, 3	, 12); 
        TextField guestCost = new TextField();
        guestCost.setEditable(false);
        guestCost.setAlignment(Pos.BOTTOM_RIGHT);
        Label lbGuestCost = new Label("Your Total");
        mainPane.add(lbGuestCost, 0, 15);
        lbGuestCost.setFont(labelFont);
        
        TextField food = new TextField("Choosen Entrée: ");
        mainPane.add(food, 0, 16);
        
        TextField fSide1 = new TextField("Choosen Side: ");
        mainPane.add(fSide1, 0, 17);
        
        TextField fSide = new TextField("Choosen Side: ");
        mainPane.add(fSide, 0, 18);
        
        TextField D = new TextField("Choosen Dessert: ");
        mainPane.add(D, 0 , 19);
        
        Label lbYour = new Label("Your Total Is:");
        
        mainPane.add(lbYour, 0, 20);
        mainPane.add(guestCost, 1 , 20);
        
        
        
        
        
              
        btCalc.setOnAction(e -> {
        	
        	//code to validate first side
            String rbResult1;
            if(rbFruit1.isSelected())
               rbResult1 = "Fruits";
            else
              if (rbSide1.isSelected())
                  rbResult1 = "Salad";
              else
                if (rbGBeans1.isSelected())
                    rbResult1 = "Green Beans";
                else
                    rbResult1 = "Asparagus";     
             fSide1.setText( rbResult1);      
       
           //code to validate second side
             String rbResult2;
             if(rbFruit.isSelected())
                rbResult2 = "Fruits";
             else
               if (rbSide.isSelected())
                   rbResult2 = "Salad";
               else
                 if (rbGBeans.isSelected())
                     rbResult2 = "Green Beans";
                 else
                     rbResult2 = "Asoaragus"; 
                         
              fSide.setText( rbResult2);   
              
              
              String sweet;
              if(rbChocolate.isSelected())
            	  sweet = "Chocolate Cake";
              else
                if (rbKeyLime.isSelected())
                	sweet = "Key Lime Pie";
                else
                  if (rbBannana.isSelected())
                	  sweet = "Banana Pudding";
                  else
                	  sweet = "Ice Creame";     
               D.setText( sweet);      
            
               food.setText(entrée.getValue());
        	
        	
        	String name = firstName.getText();
        	String lName = lastName.getText();
        	String phoneNumber = phoneNum.getText();
        	String guests = invitedGuests.getText();
        	double invited = Double.parseDouble(invitedGuests.getText());
        	double total = 0;
        	if(invited >= 0 && invited <= 1000)
				 total = 35*invited;
			else
				 total = 0;
			DecimalFormat f = new DecimalFormat("##.00");
			guestCost.setText(f.format(total));
			String mainEntrée = entrée.getValue();
        	String side1 = fSide1.getText().replace("Chosen Entree: ", " ");
        	String side = fSide.getText().replace("Chosen Sides: ", " ");
        	String dessert = D.getText().replace("Choosen Dessert:  ", " ");
        	

        	String output = "Name: " + name + " " + lName + " - " + "Phone Number: " + phoneNumber + " - " + "Number of Guessts: " + guests 
        					+ " - " + "Main Entrée: " + mainEntrée + " - " + "Sides: " + side1 + ", " + side + " - " + "Dessert: " + dessert + 
        					" - "  + "Customer Total:  $" + total ;
        	

        	try(Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Event.txt"),"utf-8"))){
        	writer.write(output);
        	}
        	catch(IOException ex){
        	System.out.println("Problem writing to Event.txt");
        	}

        	});
        
        
        
	}
	
	
	

//public static void main(String[] args) { 
	
	
	//launch(args);
	
	


//}
}
