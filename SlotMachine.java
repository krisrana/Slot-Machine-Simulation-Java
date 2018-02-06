import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.Random;
public class SlotMachine extends Application
{
	//controls decelarations
		private Label message, prompt, message2, message3;
		private Image apple, banana, cherries, grapes, lemon, lime, orange, pear, strawberry, watermelon;
		private ImageView imageView, imageView2, imageView3;
		private TextField amountInserted;
		private GridPane grid;
		private HBox box, box2, box3;
		double coins, spinWon, totalWon;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		//1. Controls
			message = new Label("Let's Win some money $$$");
			prompt = new Label("Amount Inserted: $");
			message2 = new Label("Amount Won this spin: $");
			message3 = new Label("Total Won amount: $");
			amountInserted = new TextField();
		
		//load images
			apple = new Image("File:Apple.PNG");
			banana = new Image("File:Banana.PNG");
			cherries = new Image("File:Cherries.PNG");
			grapes = new Image("File:Grapes.PNG");
			lemon = new Image("File:Lemon.PNG");
			lime = new Image("File:Lime.PNG");
			orange = new Image("File:Orange.PNG");
			pear = new Image("File:Pear.PNG");
			strawberry = new Image("File:Strawberry.PNG");
			watermelon = new Image("File:Watermelon.PNG");
		
		//set imageview control
			imageView = new ImageView(apple);
			imageView2 = new ImageView(watermelon);
			imageView3 = new ImageView(orange);
		
		//button handler
			Button myButton = new Button("Spin");
			myButton.setOnAction(new ButtonClickHandler());
		
		//Container handler
			box = new HBox(50, imageView);
			box2 = new HBox(50, imageView2);
			box3 = new HBox(50, imageView3);
			box.setAlignment(Pos.CENTER);
			
		//GridPane container
			grid = new GridPane();
			
			grid.add(message, 0, 0);
			grid.add(box, 0, 1);
			grid.add(box2, 1, 1);
			grid.add(box3, 2, 1);
			grid.add(prompt, 0, 2);
			grid.add(amountInserted, 1, 2);
			grid.add(message2, 2, 2);
			grid.add(message3, 2, 3);
			grid.add(myButton, 1, 4);
			grid.setAlignment(Pos.CENTER);
			
			//Setting gap and padding
			grid.setVgap(2);
			grid.setHgap(5);
			grid.setPadding(new Insets(10));
			grid.setAlignment(Pos.TOP_LEFT);
		//Scene Object
		Scene scene = new Scene(grid, 500, 250);
		
		
		//Stage Object
		stage.setScene(scene);
		
		
		//set title for the stage
		stage.setTitle("Slot Machine");
		
		//show the stage
		stage.show();
		
		
		
		
	}
	
	
	class ButtonClickHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent event)
		{
			Random random = new Random();
			int number = random.nextInt(10);
			int number2 = random.nextInt(10);
			int number3 = random.nextInt(10);
			String moneyInserted;
			
			//conversion from string to double
			moneyInserted = amountInserted.getText();
			coins = Double.parseDouble(moneyInserted);
			
			//condition for wins
			if(number == number2 && number2 == number3)
			{
				double threeTime = 0;
				threeTime = coins * 3;
				spinWon = coins + threeTime;
				totalWon = spinWon + totalWon;
			}
			else if(number == number2 || number2 == number3 || number3 == number)
			{
				double twoTime = 0;
				twoTime = coins * 2;
				spinWon = coins + twoTime;
				totalWon = spinWon + totalWon;
			}
			else
			{
				spinWon = 0;
				totalWon = spinWon + totalWon;
			}
			
			message2.setText("Amount Won this spin: $" + spinWon);
			message3.setText("Total Won amount: $" + totalWon);
			
			
			
		//random generator for 1st block
			if(number == 0)
				imageView.setImage(apple);
			else if(number == 1)
				imageView.setImage(banana);
			else if(number == 2)
				imageView.setImage(cherries);
			else if(number == 3)
				imageView.setImage(grapes);
			else if(number == 4)
				imageView.setImage(lemon);
			else if(number == 5)
				imageView.setImage(lime);
			else if(number == 6)
				imageView.setImage(orange);
			else if(number == 7)
				imageView.setImage(pear);
			else if(number == 8)
				imageView.setImage(strawberry);
			else if(number == 9)
				imageView.setImage(watermelon);
			
		//random generator for 2nd block
			if(number2 == 0)
				imageView2.setImage(apple);
			else if(number2 == 1)
				imageView2.setImage(banana);
			else if(number2 == 2)
				imageView2.setImage(cherries);
			else if(number2 == 3)
				imageView2.setImage(grapes);
			else if(number2 == 4)
				imageView2.setImage(lemon);
			else if(number2 == 5)
				imageView2.setImage(lime);
			else if(number2 == 6)
				imageView2.setImage(orange);
			else if(number2 == 7)
				imageView2.setImage(pear);
			else if(number2 == 8)
				imageView2.setImage(strawberry);
			else if(number2 == 9)
				imageView2.setImage(watermelon);
			
		//random generator for 3nd block
			if(number3 == 0)
				imageView3.setImage(apple);
			else if(number3 == 1)
				imageView3.setImage(banana);
			else if(number3 == 2)
				imageView3.setImage(cherries);
			else if(number3 == 3)
				imageView3.setImage(grapes);
			else if(number3 == 4)
				imageView3.setImage(lemon);
			else if(number3 == 5)
				imageView3.setImage(lime);
			else if(number3 == 6)
				imageView3.setImage(orange);
			else if(number3 == 7)
				imageView3.setImage(pear);
			else if(number3 == 8)
				imageView3.setImage(strawberry);
			else if(number3 == 9)
				imageView3.setImage(watermelon);
		}
	}

}
