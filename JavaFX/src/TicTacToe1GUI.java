import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe1GUI extends Application{

	public static void main(String[] args) {
		launch();
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		//grid pane;
		GridPane pane =new GridPane();
		
		Scene scene = new Scene(pane, 500, 500);
		
		Button b00 = new Button("b00");
		b00.setOnAction(new Button00());
		Button b01 = new Button("b01");
		b01.setOnAction(new Button00());
		Button b02 = new Button("b02");
		b02.setOnAction(new Button00());
		
		Button b10 = new Button("b10");
		b10.setOnAction(new Button00());
		Button b11 = new Button("b11");
		b11.setOnAction(new Button00());
		Button b12 = new Button("b12");
		b12.setOnAction(new Button00());
		
		Button b20 = new Button("b20");
		b20.setOnAction(new Button00());
		Button b21 = new Button("b21");
		b21.setOnAction(new Button00());
		Button b22 = new Button("b22");
		b22.setOnAction(new Button00());
		
		pane.add(b00, 0, 0);
		pane.add(b01, 0, 1);
		pane.add(b02, 0, 2);
		
		pane.add(b10, 1, 0);
		pane.add(b11, 1, 1);
		pane.add(b12, 1, 2);
		
		pane.add(b20, 2, 0);
		pane.add(b21, 2, 1);
		pane.add(b22, 2, 2);
		
		primaryStage.setTitle("My Game");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	private int turn = 1;
	
	class Button00 implements EventHandler<ActionEvent>{
		
		@Override
		public void handle(ActionEvent e) {

			Button b = (Button)(e.getSource());
			
			if (turn == 1){
				
				System.out.println("0's turn");
				b.setText("X");
				
				turn += 1;
			
			}
			
			else{
				
				System.out.println("X's turn");
				b.setText("0");
				
				turn -= 1;
				
			}
			
		
		}
		
	}
	
}
