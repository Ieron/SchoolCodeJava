/* ~things to do~
 * 
 * !board!
 * -all squares fit and scale to the window when resized
 * -add in pieces (may need a separate class)
 * -make a space at bottom of window for dialog
 * -knows what spaces are valid
 * 
 * !game play!
 * -add in drag&drop
 * -win/lose states
 * -alternate between players
 * -delete pieces that are jumped
 * -making a king
 * -what if there's a tie
 * -
 * 
 * !al!
 * -Decide who's first
 * -his first move (random?)
 * -second move base off user
 * -
 * 
 * !piece class!
 * -extend circle
 * -king method
 * -color method
 * -?delete method?
 * 
 */

//put methods at end of main, edit check class, add each separate circle

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class Board extends Application{
	
	BorderPane bp = new BorderPane();
	GridPane pane = new GridPane();
	Button start = new Button();
	
	public static void main(String[] args) {
		
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		Text leftL = new Text();
		Text leftR = new Text();
		leftR.setText("  ");
		leftL.setText("\n  ");
		start.setText("Start");
		
		Text top = new Text();
		top.setText("\n Welcome!\n");
		top.setFill(Color.DARKGOLDENROD);
		top.setLineSpacing(10);
		top.setFont(Font.font(20));
		
		bp.setPrefSize(700, 700);
		bp.setCenter(pane);
		bp.setTop(top);
		bp.setLeft(leftL);		
		
		Scene scene = new Scene(bp, 800, 800);
				
		primaryStage.setTitle("Checkerboard");
		primaryStage.setScene(scene);
		
		for(int i = 0; i < 8; i++){
			
			for(int j = 0; j < 8; j++){
				
				Rectangle rec = new Rectangle();
				rec.setWidth(50);
				rec.setHeight(50);
				
				rec.setStroke(Color.DARKGOLDENROD);
				
				if ((i + j) % 2==1){
					
					rec.setFill(Color.BURLYWOOD);
					
				}
				
				else {
					
					rec.setFill(Color.BLACK);
					
				}
				
				pane.add(rec, i, j);
				
			}
			
		}
		
		
		
		for (int i=0;i<8;i++){
			
			for (int j=0;j<3;j++){
				
				Circle ghostRed1 = new Circle();
				ghostRed1.setCenterX(50);
				ghostRed1.setCenterY(50);
				ghostRed1.setRadius(25);
				ghostRed1.setStroke(Color.WHITESMOKE);
				ghostRed1.setStroke(Color.AQUAMARINE);
				
				Circle ghostRed2 = new Circle();
				ghostRed2.setCenterX(50);
				ghostRed2.setCenterY(50);
				ghostRed2.setRadius(25);
				ghostRed2.setStroke(Color.WHITESMOKE);
				ghostRed2.setStroke(Color.AQUAMARINE);
				
				Circle red = new Circle();
				red.setCenterX(50);
				red.setCenterY(50);
				red.setRadius(25);
				red.setStroke(Color.DARKGOLDENROD);
				red.setFill(Color.DARKRED);
				
				if ((i%2==0)&&(j%2==0)){
					
					pane.add(red, i, j);
					
				}
				
				else if ((i%2==1)&&(j%2==1)){
					
					pane.add(red, i, j);
					
				}
				
				red.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler <MouseEvent>(){
					@Override
					public void handle(MouseEvent e) {	
				
						Circle c = (Circle)(e.getSource());				
						
						int x = GridPane.getColumnIndex(c);
						int y = GridPane.getRowIndex(c);
						
						pane.add(ghostRed2, x + 1, y + 1);
						pane.add(ghostRed1, x - 1, y + 1);
							//pane.add(ghostRed1, x - 1, y + 1);
						//}
						//if (pane.getChildren() == false){
							
						//}
						
						if(GridPane.getColumnIndex(red) == x + 1){
							if(GridPane.getColumnIndex(red) == y - 1){
							
								pane.getChildren().remove(ghostRed1);
						
							}
						}
							
							
						
				
						// create an invisible circle where you want it to move, change border pane color, if new circle is clicked, old will move, new circle deleted
				
						System.out.println("red circle clicked");

					}
				});
		
				ghostRed1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler <MouseEvent>(){

					@Override
					public void handle(MouseEvent e2) {
				
						Circle c2 = (Circle)(e2.getSource());
						//if(c2.){
						int x = GridPane.getColumnIndex(c2);
						int y = GridPane.getRowIndex(c2);
						GridPane.setColumnIndex(red, x);
						GridPane.setRowIndex(red, y);
						
						pane.getChildren().remove(ghostRed2);
						pane.getChildren().remove(c2);
						
						
						//pane.add(red, x, y);		
								
						
						//int x = GridPane.getColumnIndex(c) - 1;
						//int y = GridPane.getRowIndex(c) - 1;
						 
						//Circle red = new Circle();
						//red.setCenterX(50);
						//red.setCenterY(50);
						//red.setRadius(25);
						//red.setStroke(Color.DARKGOLDENROD);
						//red.setFill(Color.DARKRED);
						//red.relocate(GridPane.getColumnIndex(c2)-1, GridPane.getRowIndex(c2)-1);
						
					}
					
				});
				
				ghostRed2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler <MouseEvent>(){

					@Override
					public void handle(MouseEvent e2) {
				
						Circle c2 = (Circle)(e2.getSource());
						//if(c2.){
						int x = GridPane.getColumnIndex(c2);
						int y = GridPane.getRowIndex(c2);
						GridPane.setColumnIndex(red, x);
						GridPane.setRowIndex(red, y);
						
						
						
						pane.getChildren().remove(ghostRed1);
						pane.getChildren().remove(c2);
						
						
						//pane.add(red, x, y);		
								
						
						//int x = GridPane.getColumnIndex(c) - 1;
						//int y = GridPane.getRowIndex(c) - 1;
						 
						//Circle red = new Circle();
						//red.setCenterX(50);
						//red.setCenterY(50);
						//red.setRadius(25);
						//red.setStroke(Color.DARKGOLDENROD);
						//red.setFill(Color.DARKRED);
						//red.relocate(GridPane.getColumnIndex(c2)-1, GridPane.getRowIndex(c2)-1);
						
					}
					
				});
			
			}
		}
				
		
				/*red.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler <MouseEvent>(){
							@Override
							public void handle(MouseEvent e) {
						
						//red = (Circle)e.getSource();
						
								Circle c = (Circle)(e.getSource());
						//Rectangle r = (Rectangle)(e.getSource());
								int x = GridPane.getColumnIndex(c);
								int y = GridPane.getRowIndex(c);
						//Circle old = new Circle();
						//pane.getChildren().remove(c);
						//if (c.contains(x2 + 1, y2 + 1) == false){
							
							
								pane.add(goastRed, x + 1, y + 1);
								
								pane.getChildren().remove(red);

						//}
						
							//c.relocate(x + 1, y + 1);
						
						// create an invisible circle where you want it to move, change border pane color, if new circle is clicked, old will move, new circle deleted
						
						System.out.println("red circle clicked");

							}
						});*/

		
	
		
		
		/*red.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler <MouseEvent>(){
			@Override
			public void handle(MouseEvent e) {
		
		//red = (Circle)e.getSource();
		
				Circle c = (Circle)(e.getSource());
		//Rectangle r = (Rectangle)(e.getSource());
		
		
				int x = GridPane.getColumnIndex(c);
				int y = GridPane.getRowIndex(c);
		//Circle old = new Circle();
		//pane.getChildren().remove(c);
		//if (c.contains(x2 + 1, y2 + 1) == false){
			
			
				pane.add(goastRed, x + 1, y + 1);
			//pane.getChildren().remove(red);

		//}
		
			//c.relocate(x + 1, y + 1);
		
		// create an invisible circle where you want it to move, change border pane color, if new circle is clicked, old will move, new circle deleted
		
		System.out.println("red circle clicked");

			}
		});*/
		
		/*goastRed.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler <MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				Circle c = (Circle)(e.getSource());
				Circle old = new Circle();
				int x = GridPane.getColumnIndex(c) - 1;
				int y = GridPane.getRowIndex(c) - 1;
				 
				Circle red = new Circle();
				red.setCenterX(50);
				red.setCenterY(50);
				red.setRadius(25);
				red.setStroke(Color.DARKGOLDENROD);
				red.setFill(Color.DARKRED);
				c.relocate(GridPane.getColumnIndex(c), GridPane.getRowIndex(c));
				pane.getChildren().remove(c);
				
				pane.getChildren().remove(old);
				
			}
			
		});*/
		
		Circle goastBlack = new Circle();
		goastBlack.setCenterX(50);
		goastBlack.setCenterY(50);
		goastBlack.setRadius(25);
		goastBlack.setStroke(Color.WHITESMOKE);
		goastBlack.setStroke(Color.AQUAMARINE);
		
		for (int i=0;i<8;i++){
			
			for (int j=5;j<8;j++){
				//create a circle
				Circle black=new Circle();
				black.setCenterX(50);
				black.setCenterY(50);
				black.setRadius(25);
				black.setStroke(Color.DARKGOLDENROD);
				black.setFill(Color.DIMGREY);
				//add it to the black squares only
				if ((i%2==0)&&(j%2==0)) pane.add(black, i, j);
				else if ((i%2==1)&&(j%2==1)) pane.add(black, i, j);
				
				black.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler <MouseEvent>(){
					@Override
					public void handle(MouseEvent e) {
					
					//red = (Circle)e.getSource();
					
					//Circle c = (Circle)(e.getSource());
					//GridPane p = (GridPane)(e.getSource());
					
					// create an invisible circle where you want it to move, change border pane color, if new circle is clicked, old will move, new circle deleted
					
					
						
					System.out.println("black circle clicked");
			
			}
			});
				
			}
			
		}
		
	
		
		/*if (pane.getChildren().contains(red)){
		
			red.getOnMouseClicked();
			
		}*/
		
		
		primaryStage.show();
		
	
	}
	
	public boolean checkRedBL (Circle c, ArrayList<Circle> a){
		
		for(int i = 0; i<a.size(); i++){
			if(GridPane.getRowIndex(a.get(i)) == GridPane.getRowIndex(c) + 1 ) {
				if(GridPane.getColumnIndex(a.get(i)) == GridPane.getColumnIndex(c) - 1 ) {
					
					return true;
				}
			
				if(GridPane.getColumnIndex(a.get(i)) == GridPane.getColumnIndex(c) + 1 ) {
					
					return true;
				}
				
			}
		}
		return false;
		
	}
	
}
	
	/*class MouseClick00 implements EventHandler <MouseEvent>{
		
		@Override
		public void handle(MouseEvent e) {
			
			Circle c = (Circle)(e.getSource());
			GridPane p = (GridPane)(e.getSource());
				
			int x = GridPane.getColumnIndex(c) + 1;
			int y = GridPane.getRowIndex(c) + 1;
			
			p.add(c, x, y);
			p.getChildren().remove(c);
			System.out.println("circle moved");
		
	}
	
	/*class MouseClick01 implements EventHandler <MouseEvent>{
		
		@Override
		public void handle(MouseEvent e) {
			
			Circle c = (Circle)(e.getSource());
			GridPane p = (GridPane)(e.getSource());
			
					
			
		}		*/
	


/*class MouseClick1 implements EventHandler <MouseEvent>{

	public void handle(MouseEvent e) {

//red = (Circle)e.getSource();

Circle c = (Circle)(e.getSource());
//Rectangle r = (Rectangle)(e.getSource());
GridPane pane = (GridPane)(e.getSource());

int x = GridPane.getColumnIndex(c);
int y = GridPane.getRowIndex(c);
//Circle old = new Circle();
//pane.getChildren().remove(c);
//if (c.contains(x2 + 1, y2 + 1) == false){
	
Circle goastRed = new Circle();
goastRed.setCenterX(50);
goastRed.setCenterY(50);
goastRed.setRadius(25);
goastRed.setStroke(Color.WHITESMOKE);
goastRed.setStroke(Color.AQUAMARINE);

	pane.add(goastRed, x + 1, y + 1);
	//pane.getChildren().remove(red);

//}

	//c.relocate(x + 1, y + 1);

// create an invisible circle where you want it to move, change border pane color, if new circle is clicked, old will move, new circle deleted

System.out.println("red circle clicked");

}
}
}*/
