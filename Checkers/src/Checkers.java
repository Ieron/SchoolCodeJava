/*
 * David Smith
 * CSCI 1302-A
 * DEC. 3/2015
 */

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.EventHandler;
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

public class Checkers extends Application {

	BorderPane bp;
	GridPane pane;
	Button start;
	Scene scene;
	Circle ghostRed1, ghostRed2;
	Circle ghostBlk1, ghostBlk2;
	Circle ghostJRed1, ghostJRed2;
	Circle ghostJBlk1, ghostJBlk2;
	Circle ghostRedK1, ghostRedK2, ghostRedK3, ghostRedK4;
	Circle ghostBlkK1, ghostBlkK2, ghostBlkK3, ghostBlkK4;
	Circle ghostJRedK1, ghostJRedK2, ghostJRedK3, ghostJRedK4;
	Circle ghostJBlkK1, ghostJBlkK2, ghostJBlkK3, ghostJBlkK4;
	Circle redK, blkK;
	Circle red1, red2, red3, red4, red5, red6, red7, red8, red9, red10, red11, red12;
	Circle blk1, blk2, blk3, blk4, blk5, blk6, blk7, blk8, blk9, blk10, blk11, blk12;
	ArrayList<Circle> redA = new ArrayList<Circle>();
	ArrayList<Circle> blkA = new ArrayList<Circle>();
	ArrayList<Circle> redAK = new ArrayList<Circle>();
	ArrayList<Circle> blkAK = new ArrayList<Circle>();
	int pTurn = 1;
	Text turn = new Text();
	
	public static void main(String[] args) {

		launch(args);

	}
	
	//sets up pieces and game board
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		bp = new BorderPane();
		pane = new GridPane();
		start = new Button();
		
		scene = new Scene(bp, 423, 580);
		
		Text leftL = new Text();
		Text leftR = new Text();
		leftR.setText("  ");
		leftL.setText("\n  ");
		start.setText("Start");
		
		Text top = new Text();
		top.setText("\n		   Checkers!\n");
		top.setFill(Color.DARKGOLDENROD);
		top.setLineSpacing(5);
		top.setFont(Font.font(30));
		
		turn.setText("  Red Player's Turn\n");
		turn.setFill(Color.DARKGOLDENROD);
		turn.setLineSpacing(1);
		turn.setFont(Font.font(20));
		turn.setTextAlignment(TextAlignment.CENTER);
		
		bp.setPrefSize(400, 400);
		bp.setCenter(pane);
		bp.setTop(top);
		bp.setLeft(leftL);
		bp.setBottom(turn);
	
		primaryStage.setTitle("Checkerboard");
		primaryStage.setScene(scene);
		primaryStage.show();
				
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
	
		Circle ghostred1 = new Circle(); ghostred1.setCenterX(50); ghostred1.setCenterY(50); ghostred1.setRadius(25); ghostred1.setStroke(Color.WHITESMOKE); ghostred1.setStroke(Color.AQUAMARINE);		
		Circle ghostRed2 = new Circle(); ghostRed2.setCenterX(50); ghostRed2.setCenterY(50); ghostRed2.setRadius(25); ghostRed2.setStroke(Color.WHITESMOKE); ghostRed2.setStroke(Color.AQUAMARINE);
		
		Circle redK = new Circle(); redK.setCenterX(50); redK.setCenterY(50); redK.setRadius(25); redK.setStroke(Color.DARKGOLDENROD); redK.setFill(Color.RED);
		Circle blkK = new Circle(); blkK.setCenterX(50); blkK.setCenterY(50); blkK.setRadius(25); blkK.setStroke(Color.DARKGOLDENROD); blkK.setFill(Color.DARKGRAY);
		
		Circle red1 = new Circle(); red1.setCenterX(50); red1.setCenterY(50); red1.setRadius(25); red1.setStroke(Color.DARKGOLDENROD); red1.setFill(Color.DARKRED);
		Circle red2 = new Circle(); red2.setCenterX(50); red2.setCenterY(50); red2.setRadius(25); red2.setStroke(Color.DARKGOLDENROD); red2.setFill(Color.DARKRED);
		Circle red3 = new Circle(); red3.setCenterX(50); red3.setCenterY(50); red3.setRadius(25); red3.setStroke(Color.DARKGOLDENROD); red3.setFill(Color.DARKRED);
		Circle red4 = new Circle(); red4.setCenterX(50); red4.setCenterY(50); red4.setRadius(25); red4.setStroke(Color.DARKGOLDENROD); red4.setFill(Color.DARKRED);
		Circle red5 = new Circle(); red5.setCenterX(50); red5.setCenterY(50); red5.setRadius(25); red5.setStroke(Color.DARKGOLDENROD); red5.setFill(Color.DARKRED);
		Circle red6 = new Circle(); red6.setCenterX(50); red6.setCenterY(50); red6.setRadius(25); red6.setStroke(Color.DARKGOLDENROD); red6.setFill(Color.DARKRED);
		Circle red7 = new Circle(); red7.setCenterX(50); red7.setCenterY(50); red7.setRadius(25); red7.setStroke(Color.DARKGOLDENROD); red7.setFill(Color.DARKRED);
		Circle red8 = new Circle(); red8.setCenterX(50); red8.setCenterY(50); red8.setRadius(25); red8.setStroke(Color.DARKGOLDENROD); red8.setFill(Color.DARKRED);
		Circle red9 = new Circle(); red9.setCenterX(50); red9.setCenterY(50); red9.setRadius(25); red9.setStroke(Color.DARKGOLDENROD); red9.setFill(Color.DARKRED);
		Circle red10 = new Circle(); red10.setCenterX(50); red10.setCenterY(50); red10.setRadius(25); red10.setStroke(Color.DARKGOLDENROD); red10.setFill(Color.DARKRED);
		Circle red11 = new Circle(); red11.setCenterX(50); red11.setCenterY(50); red11.setRadius(25); red11.setStroke(Color.DARKGOLDENROD); red11.setFill(Color.DARKRED);
		Circle red12 = new Circle(); red12.setCenterX(50); red12.setCenterY(50); red12.setRadius(25); red12.setStroke(Color.DARKGOLDENROD); red12.setFill(Color.DARKRED);
		
		redA.add(red1);
		redA.add(red2);
		redA.add(red3);
		redA.add(red4);
		redA.add(red5);
		redA.add(red6);
		redA.add(red7);
		redA.add(red8);
		redA.add(red9);
		redA.add(red10);
		redA.add(red11);
		redA.add(red12);
		
		pane.add(red1, 0, 0);
		pane.add(red2, 2, 0);
		pane.add(red3, 4, 0);
		pane.add(red4, 6, 0);
		pane.add(red5, 1, 1);
		pane.add(red6, 3, 1);
		pane.add(red7, 5, 1);
		pane.add(red8, 7, 1);
		pane.add(red9, 0, 2);
		pane.add(red10, 2, 2);
		pane.add(red11, 4, 2);
		pane.add(red12, 6, 2);
		
		red1.setOnMouseClicked(new MouseClick01());
		red2.setOnMouseClicked(new MouseClick01());
		red3.setOnMouseClicked(new MouseClick01());
		red4.setOnMouseClicked(new MouseClick01());
		red5.setOnMouseClicked(new MouseClick01());
		red6.setOnMouseClicked(new MouseClick01());
		red7.setOnMouseClicked(new MouseClick01());
		red8.setOnMouseClicked(new MouseClick01());
		red9.setOnMouseClicked(new MouseClick01());
		red10.setOnMouseClicked(new MouseClick01());
		red11.setOnMouseClicked(new MouseClick01());
		red12.setOnMouseClicked(new MouseClick01());
		
		Circle blk1 = new Circle(); blk1.setCenterX(50); blk1.setCenterY(50); blk1.setRadius(25); blk1.setStroke(Color.DARKGOLDENROD); blk1.setFill(Color.DIMGREY);
		Circle blk2 = new Circle(); blk2.setCenterX(50); blk2.setCenterY(50); blk2.setRadius(25); blk2.setStroke(Color.DARKGOLDENROD); blk2.setFill(Color.DIMGREY);
		Circle blk3 = new Circle(); blk3.setCenterX(50); blk3.setCenterY(50); blk3.setRadius(25); blk3.setStroke(Color.DARKGOLDENROD); blk3.setFill(Color.DIMGREY);
		Circle blk4 = new Circle(); blk4.setCenterX(50); blk4.setCenterY(50); blk4.setRadius(25); blk4.setStroke(Color.DARKGOLDENROD); blk4.setFill(Color.DIMGREY);
		Circle blk5 = new Circle(); blk5.setCenterX(50); blk5.setCenterY(50); blk5.setRadius(25); blk5.setStroke(Color.DARKGOLDENROD); blk5.setFill(Color.DIMGREY);
		Circle blk6 = new Circle(); blk6.setCenterX(50); blk6.setCenterY(50); blk6.setRadius(25); blk6.setStroke(Color.DARKGOLDENROD); blk6.setFill(Color.DIMGREY);
		Circle blk7 = new Circle(); blk7.setCenterX(50); blk7.setCenterY(50); blk7.setRadius(25); blk7.setStroke(Color.DARKGOLDENROD); blk7.setFill(Color.DIMGREY);
		Circle blk8 = new Circle(); blk8.setCenterX(50); blk8.setCenterY(50); blk8.setRadius(25); blk8.setStroke(Color.DARKGOLDENROD); blk8.setFill(Color.DIMGREY);
		Circle blk9 = new Circle(); blk9.setCenterX(50); blk9.setCenterY(50); blk9.setRadius(25); blk9.setStroke(Color.DARKGOLDENROD); blk9.setFill(Color.DIMGREY);
		Circle blk10 = new Circle(); blk10.setCenterX(50); blk10.setCenterY(50); blk10.setRadius(25); blk10.setStroke(Color.DARKGOLDENROD); blk10.setFill(Color.DIMGREY);
		Circle blk11 = new Circle(); blk11.setCenterX(50); blk11.setCenterY(50); blk11.setRadius(25); blk11.setStroke(Color.DARKGOLDENROD); blk11.setFill(Color.DIMGREY);
		Circle blk12 = new Circle(); blk12.setCenterX(50); blk12.setCenterY(50); blk12.setRadius(25); blk12.setStroke(Color.DARKGOLDENROD); blk12.setFill(Color.DIMGREY);
		
		blkA.add(blk1);
		blkA.add(blk2);
		blkA.add(blk3);
		blkA.add(blk4);
		blkA.add(blk5);
		blkA.add(blk6);
		blkA.add(blk7);
		blkA.add(blk8);
		blkA.add(blk9);
		blkA.add(blk10);
		blkA.add(blk11);
		blkA.add(blk12);
		
		pane.add(blk1, 1, 5);
		pane.add(blk2, 3, 5);
		pane.add(blk3, 5, 5);
		pane.add(blk4, 7, 5);
		pane.add(blk5, 0, 6);
		pane.add(blk6, 2, 6);
		pane.add(blk7, 4, 6);
		pane.add(blk8, 6, 6);
		pane.add(blk9, 1, 7);
		pane.add(blk10, 3, 7);
		pane.add(blk11, 5, 7);
		pane.add(blk12, 7, 7);
		
		blk1.setOnMouseClicked(new MouseClick02());
		blk2.setOnMouseClicked(new MouseClick02());
		blk3.setOnMouseClicked(new MouseClick02());
		blk4.setOnMouseClicked(new MouseClick02());
		blk5.setOnMouseClicked(new MouseClick02());
		blk6.setOnMouseClicked(new MouseClick02());
		blk7.setOnMouseClicked(new MouseClick02());
		blk8.setOnMouseClicked(new MouseClick02());
		blk9.setOnMouseClicked(new MouseClick02());
		blk10.setOnMouseClicked(new MouseClick02());
		blk11.setOnMouseClicked(new MouseClick02());
		blk12.setOnMouseClicked(new MouseClick02());
		
				
	}
	
	//when red clicked
	class MouseClick01 implements EventHandler <MouseEvent>{
		@Override
		public void handle(MouseEvent e) {	
	
			Circle c = (Circle)(e.getSource());
			
			pane.getChildren().remove(ghostRed1);
			pane.getChildren().remove(ghostRed2);
			pane.getChildren().remove(ghostJRed1);
			pane.getChildren().remove(ghostJRed2);
			
			ghostRed1 = new Circle(); ghostRed1.setCenterX(50); ghostRed1.setCenterY(50); ghostRed1.setRadius(25); ghostRed1.setStroke(Color.WHITESMOKE); ghostRed1.setStroke(Color.AQUAMARINE);		
			ghostRed2 = new Circle(); ghostRed2.setCenterX(50); ghostRed2.setCenterY(50); ghostRed2.setRadius(25); ghostRed2.setStroke(Color.WHITESMOKE); ghostRed2.setStroke(Color.AQUAMARINE);
			ghostJRed1 = new Circle(); ghostJRed1.setCenterX(50); ghostJRed1.setCenterY(50); ghostJRed1.setRadius(25); ghostJRed1.setStroke(Color.WHITESMOKE); ghostJRed1.setStroke(Color.AQUAMARINE);		
			ghostJRed2 = new Circle(); ghostJRed2.setCenterX(50); ghostJRed2.setCenterY(50); ghostJRed2.setRadius(25); ghostJRed2.setStroke(Color.WHITESMOKE); ghostJRed2.setStroke(Color.AQUAMARINE);
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			if (pTurn == 1){
				
				if (GridPane.getColumnIndex(c) != 7 && checkBR(c, redA) == false && checkBR(c, blkA) == false) {
						
					pane.add(ghostRed2, x + 1, y + 1);
					ghostRed2.setOnMouseClicked(new ghostRed2());	
							
				}
				
				if (GridPane.getColumnIndex(c) != 0 && checkBL(c, redA) == false && checkBL(c, blkA) == false){
				
					pane.add(ghostRed1, x - 1, y + 1);
					ghostRed1.setOnMouseClicked(new ghostRed1());
				
				}	
					
				if(GridPane.getColumnIndex(c) != 1 && GridPane.getRowIndex(c) != 6 && checkBL(c, blkA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false){
				
					pane.add(ghostJRed1, x - 2, y + 2);
					ghostJRed1.setOnMouseClicked(new ghostJRed1());
						
				
				}
			
				if(GridPane.getColumnIndex(c) != 6 && GridPane.getRowIndex(c) != 6 && checkBR(c, blkA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false){
					
					pane.add(ghostJRed2, x + 2, y + 2);
					ghostJRed2.setOnMouseClicked(new ghostJRed2());
						
						
				}
			
						
			}
			
			
			//System.out.println("red circle clicked");

		}
	}
	
	//when blk clicked
	class MouseClick02 implements EventHandler <MouseEvent>{
		@Override
		public void handle(MouseEvent e) {	
			
			pane.getChildren().remove(ghostBlk1);
			pane.getChildren().remove(ghostBlk2);
			pane.getChildren().remove(ghostJBlk1);
			pane.getChildren().remove(ghostJBlk2);
			
			Circle c = (Circle)(e.getSource());
			
			ghostBlk1 = new Circle(); ghostBlk1.setCenterX(50); ghostBlk1.setCenterY(50); ghostBlk1.setRadius(25); ghostBlk1.setStroke(Color.WHITESMOKE); ghostBlk1.setStroke(Color.AQUAMARINE);		
			ghostBlk2 = new Circle(); ghostBlk2.setCenterX(50); ghostBlk2.setCenterY(50); ghostBlk2.setRadius(25); ghostBlk2.setStroke(Color.WHITESMOKE); ghostBlk2.setStroke(Color.AQUAMARINE);
			ghostJBlk1 = new Circle(); ghostJBlk1.setCenterX(50); ghostJBlk1.setCenterY(50); ghostJBlk1.setRadius(25); ghostJBlk1.setStroke(Color.WHITESMOKE); ghostJBlk1.setStroke(Color.AQUAMARINE);		
			ghostJBlk2 = new Circle(); ghostJBlk2.setCenterX(50); ghostJBlk2.setCenterY(50); ghostJBlk2.setRadius(25); ghostJBlk2.setStroke(Color.WHITESMOKE); ghostJBlk2.setStroke(Color.AQUAMARINE);
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			if (pTurn == 2){
			if (GridPane.getColumnIndex(c) != 0 && checkTL(c, blkA) == false && checkTL(c, redA) == false){
				
				pane.add(ghostBlk1, x - 1, y - 1);
				ghostBlk1.setOnMouseClicked(new ghostBlk1());
				
				
			}
			
			if (GridPane.getColumnIndex(c) != 7 && checkTR(c, blkA) == false && checkTR(c, redA) == false){
				
				pane.add(ghostBlk2, x + 1, y - 1);
				ghostBlk2.setOnMouseClicked(new ghostBlk2());
				
				
			}
			
			if(GridPane.getColumnIndex(c) != 1 && GridPane.getRowIndex(c) != 1 && checkTL(c, redA) == true && checkJTL(c, redA) == false && checkJTL(c, blkA) == false){
				
				pane.add(ghostJBlk1, x - 2, y - 2);
				ghostJBlk1.setOnMouseClicked(new ghostJBlk1());
				
			}
			
			if(GridPane.getColumnIndex(c) != 6 && GridPane.getRowIndex(c) != 1 && checkTR(c, redA) == true && checkJTR(c, redA) == false && checkJTR(c, blkA) == false){
				
				pane.add(ghostJBlk2, x + 2, y - 2);
				ghostJBlk2.setOnMouseClicked(new ghostJBlk2());
				
			}
			
			}
			
			//System.out.println("blk circle clicked");

		}
	}
	
	//redKing clicked
	class MouseClick03 implements EventHandler <MouseEvent>{
		@Override
		public void handle(MouseEvent e) {	
	
			Circle c = (Circle)(e.getSource());
			
			pane.getChildren().remove(ghostRedK1);
			pane.getChildren().remove(ghostRedK2);
			pane.getChildren().remove(ghostRedK3);
			pane.getChildren().remove(ghostRedK4);
			pane.getChildren().remove(ghostJRedK1);
			pane.getChildren().remove(ghostJRedK2);
			pane.getChildren().remove(ghostJRedK3);
			pane.getChildren().remove(ghostJRedK4);
					
			ghostRedK1 = new Circle(); ghostRedK1.setCenterX(50); ghostRedK1.setCenterY(50); ghostRedK1.setRadius(25); ghostRedK1.setStroke(Color.WHITESMOKE); ghostRedK1.setStroke(Color.AQUAMARINE);		
			ghostRedK2 = new Circle(); ghostRedK2.setCenterX(50); ghostRedK2.setCenterY(50); ghostRedK2.setRadius(25); ghostRedK2.setStroke(Color.WHITESMOKE); ghostRedK2.setStroke(Color.AQUAMARINE);
			ghostRedK3 = new Circle(); ghostRedK3.setCenterX(50); ghostRedK3.setCenterY(50); ghostRedK3.setRadius(25); ghostRedK3.setStroke(Color.WHITESMOKE); ghostRedK3.setStroke(Color.AQUAMARINE);
			ghostRedK4 = new Circle(); ghostRedK4.setCenterX(50); ghostRedK4.setCenterY(50); ghostRedK4.setRadius(25); ghostRedK4.setStroke(Color.WHITESMOKE); ghostRedK4.setStroke(Color.AQUAMARINE);
			ghostJRedK1 = new Circle(); ghostJRedK1.setCenterX(50); ghostJRedK1.setCenterY(50); ghostJRedK1.setRadius(25); ghostJRedK1.setStroke(Color.WHITESMOKE); ghostJRedK1.setStroke(Color.AQUAMARINE);		
			ghostJRedK2 = new Circle(); ghostJRedK2.setCenterX(50); ghostJRedK2.setCenterY(50); ghostJRedK2.setRadius(25); ghostJRedK2.setStroke(Color.WHITESMOKE); ghostJRedK2.setStroke(Color.AQUAMARINE);
			ghostJRedK3 = new Circle(); ghostJRedK3.setCenterX(50); ghostJRedK3.setCenterY(50); ghostJRedK3.setRadius(25); ghostJRedK3.setStroke(Color.WHITESMOKE); ghostJRedK3.setStroke(Color.AQUAMARINE);		
			ghostJRedK4 = new Circle(); ghostJRedK4.setCenterX(50); ghostJRedK4.setCenterY(50); ghostJRedK4.setRadius(25); ghostJRedK4.setStroke(Color.WHITESMOKE); ghostJRedK4.setStroke(Color.AQUAMARINE);
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			if (pTurn == 1){
				
				if (GridPane.getRowIndex(c) != 7 && GridPane.getColumnIndex(c) != 0 && checkBL(c, redA) == false && checkBL(c, blkA) == false){
				
					pane.add(ghostRedK1, x - 1, y + 1);
					ghostRedK1.setOnMouseClicked(new ghostRedK1());
				
				}	
									
				if (GridPane.getRowIndex(c) != 7 && GridPane.getColumnIndex(c) != 7 && checkBR(c, redA) == false && checkBR(c, blkA) == false) {
						
					pane.add(ghostRedK2, x + 1, y + 1);
					ghostRedK2.setOnMouseClicked(new ghostRedK2());	
							
				}
				
	
				if (GridPane.getRowIndex(c) != 0 && GridPane.getColumnIndex(c) != 0 && checkTL(c, blkA) == false && checkTL(c, redA) == false){
						
					pane.add(ghostRedK3, x - 1, y - 1);
					ghostRedK3.setOnMouseClicked(new ghostRedK3());
						
						
				}
					
				if (GridPane.getRowIndex(c) != 0 && GridPane.getColumnIndex(c) != 7 && checkTR(c, blkA) == false && checkTR(c, redA) == false){
						
					pane.add(ghostRedK4, x + 1, y - 1);
					ghostRedK4.setOnMouseClicked(new ghostRedK3());
						
						
				}
					
				if(GridPane.getColumnIndex(c) != 0 && GridPane.getRowIndex(c) != 6 && checkBL(c, blkA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false){
						
					pane.add(ghostJRedK1, x - 2, y + 2);
					ghostJRedK1.setOnMouseClicked(new ghostJRedK1());
						
				
				}
			
				if(GridPane.getColumnIndex(c) != 7 && GridPane.getRowIndex(c) != 6 && checkBR(c, blkA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false){
					
					pane.add(ghostJRedK2, x + 2, y + 2);
					ghostJRedK2.setOnMouseClicked(new ghostJRedK2());
						
						
				}

				if(GridPane.getColumnIndex(c) != 0 && GridPane.getRowIndex(c) != 1 && checkTL(c, blkA) == true && checkJTL(c, blkA) == false && checkJTL(c, redA) == false){
						
					pane.add(ghostJRedK3, x - 2, y - 2);
					ghostJRedK3.setOnMouseClicked(new ghostJRedK3());
						
				}
					
				if(GridPane.getColumnIndex(c) != 7 && GridPane.getRowIndex(c) != 1 && checkTR(c, blkA) == true && checkJTR(c, blkA) == false && checkJTR(c, redA) == false){
						
					pane.add(ghostJRedK4, x + 2, y - 2);
					ghostJRedK4.setOnMouseClicked(new ghostJRedK4());
						
				}	
			
				
			
			}
			
			//System.out.println("red circle clicked");

		}
	}
	
	//black king clicked
	class MouseClick04 implements EventHandler <MouseEvent>{
		@Override
		public void handle(MouseEvent e) {	
	
			Circle c = (Circle)(e.getSource());
			
			pane.getChildren().remove(ghostBlkK1);
			pane.getChildren().remove(ghostBlkK2);
			pane.getChildren().remove(ghostBlkK3);
			pane.getChildren().remove(ghostBlkK4);
			pane.getChildren().remove(ghostJBlkK1);
			pane.getChildren().remove(ghostJBlkK2);
			pane.getChildren().remove(ghostJBlkK3);
			pane.getChildren().remove(ghostJBlkK4);
			
			ghostBlkK1 = new Circle(); ghostBlkK1.setCenterX(50); ghostBlkK1.setCenterY(50); ghostBlkK1.setRadius(25); ghostBlkK1.setStroke(Color.WHITESMOKE); ghostBlkK1.setStroke(Color.AQUAMARINE);		
			ghostBlkK2 = new Circle(); ghostBlkK2.setCenterX(50); ghostBlkK2.setCenterY(50); ghostBlkK2.setRadius(25); ghostBlkK2.setStroke(Color.WHITESMOKE); ghostBlkK2.setStroke(Color.AQUAMARINE);
			ghostBlkK3 = new Circle(); ghostBlkK3.setCenterX(50); ghostBlkK3.setCenterY(50); ghostBlkK3.setRadius(25); ghostBlkK3.setStroke(Color.WHITESMOKE); ghostBlkK3.setStroke(Color.AQUAMARINE);		
			ghostBlkK4 = new Circle(); ghostBlkK4.setCenterX(50); ghostBlkK4.setCenterY(50); ghostBlkK4.setRadius(25); ghostBlkK4.setStroke(Color.WHITESMOKE); ghostBlkK4.setStroke(Color.AQUAMARINE);
			ghostJBlkK1 = new Circle(); ghostJBlkK1.setCenterX(50); ghostJBlkK1.setCenterY(50); ghostJBlkK1.setRadius(25); ghostJBlkK1.setStroke(Color.WHITESMOKE); ghostJBlkK1.setStroke(Color.AQUAMARINE);		
			ghostJBlkK2 = new Circle(); ghostJBlkK2.setCenterX(50); ghostJBlkK2.setCenterY(50); ghostJBlkK2.setRadius(25); ghostJBlkK2.setStroke(Color.WHITESMOKE); ghostJBlkK2.setStroke(Color.AQUAMARINE);
			ghostJBlkK3 = new Circle(); ghostJBlkK3.setCenterX(50); ghostJBlkK3.setCenterY(50); ghostJBlkK3.setRadius(25); ghostJBlkK3.setStroke(Color.WHITESMOKE); ghostJBlkK3.setStroke(Color.AQUAMARINE);		
			ghostJBlkK4 = new Circle(); ghostJBlkK4.setCenterX(50); ghostJBlkK4.setCenterY(50); ghostJBlkK4.setRadius(25); ghostJBlkK4.setStroke(Color.WHITESMOKE); ghostJBlkK4.setStroke(Color.AQUAMARINE);
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			if (pTurn == 2){
						
				if (GridPane.getRowIndex(c) != 7 && GridPane.getColumnIndex(c) != 0 && checkBL(c, blkA) == false && checkBL(c, redA) == false){
					
					pane.add(ghostBlkK1, x - 1, y + 1);
					ghostBlkK1.setOnMouseClicked(new ghostBlkK1());
				
				}	
									
				if (GridPane.getRowIndex(c) != 7 && GridPane.getColumnIndex(c) != 7 && checkBR(c, blkA) == false && checkBR(c, redA) == false) {
						
					pane.add(ghostBlkK2, x + 1, y + 1);
					ghostBlkK2.setOnMouseClicked(new ghostBlkK2());	
							
				}
				
	
				if (GridPane.getRowIndex(c) != 0 && GridPane.getColumnIndex(c) != 0 && checkTL(c, blkA) == false && checkTL(c, redA) == false){
						
					pane.add(ghostBlkK3, x - 1, y - 1);
					ghostBlkK3.setOnMouseClicked(new ghostBlkK3());
						
						
				}
					
				if (GridPane.getRowIndex(c) != 0 && GridPane.getColumnIndex(c) != 7 && checkTR(c, blkA) == false && checkTR(c, redA) == false){
						
					pane.add(ghostBlkK4, x + 1, y - 1);
					ghostBlkK4.setOnMouseClicked(new ghostBlkK4());
						
						
				}
					
				if(GridPane.getColumnIndex(c) != 1 && GridPane.getRowIndex(c) != 6 && checkBL(c, redA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false){
						
					pane.add(ghostJBlkK1, x - 2, y + 2);
					ghostJBlkK1.setOnMouseClicked(new ghostJBlkK1());
						
				
				}
			
				if(GridPane.getColumnIndex(c) != 7 && GridPane.getRowIndex(c) != 6 && checkBR(c, redA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false){
					
					pane.add(ghostJBlkK2, x + 2, y + 2);
					ghostJBlkK2.setOnMouseClicked(new ghostJBlkK2());
						
						
				}

				if(GridPane.getColumnIndex(c) != 1 && GridPane.getRowIndex(c) != 1 && checkTL(c, redA) == true && checkJTL(c, blkA) == false && checkJTL(c, redA) == false){
						
					pane.add(ghostJBlkK3, x - 2, y - 2);
					ghostJBlkK3.setOnMouseClicked(new ghostJBlkK3());
						
				}
					
				if(GridPane.getColumnIndex(c) != 7 && GridPane.getRowIndex(c) != 1 && checkTR(c, redA) == true && checkJTR(c, blkA) == false && checkJTR(c, redA) == false){
						
					pane.add(ghostJBlkK4, x + 2, y - 2);
					ghostJBlkK4.setOnMouseClicked(new ghostJBlkK4());
						
				}	
				
			
			}
			
			//System.out.println("red circle clicked");

		}
	}
	
	class ghostRed1 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			redK = new Circle(); redK.setCenterX(50); redK.setCenterY(50); redK.setRadius(25); redK.setStroke(Color.DARKGOLDENROD); redK.setFill(Color.RED);
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x + 1) {
						
						if(y == 7){
							
							pane.add(redK, x, y);
							redK.setOnMouseClicked(new MouseClick03());
							pane.getChildren().remove(redA.get(i));
							redA.remove(i);
							redA.add(redK);
						}
						
						else {
							
							GridPane.setColumnIndex(redA.get(i), x);
							GridPane.setRowIndex(redA.get(i), y);
						}
						
					}
				}
			}

			pTurn = 2;
			pane.getChildren().remove(ghostRed2);
			pane.getChildren().remove(ghostJRed2);
			pane.getChildren().remove(c);
			turn.setText("  Black Player's Turn\n");
					
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostJRed1 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			redK = new Circle(); redK.setCenterX(50); redK.setCenterY(50); redK.setRadius(25); redK.setStroke(Color.DARKGOLDENROD); redK.setFill(Color.RED);
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y - 2) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x + 2) {
						
						if(y == 7){
							
							pane.add(redK, x, y);
							redK.setOnMouseClicked(new MouseClick03());
							pane.getChildren().remove(redA.get(i));
							redA.remove(i);
							redA.add(redK);
							
						}
						
						else {
							
							GridPane.setColumnIndex(redA.get(i), x);
							GridPane.setRowIndex(redA.get(i), y);
						}
						
					}
				}
			}
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x + 1) {
						
						pane.getChildren().remove(blkA.get(i));
						blkA.remove(i);
						
					}
				}
			}
			
			if((checkBL(c, blkA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||(checkBR(c, blkA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false)){
				
			pTurn = 1;	
				
			}
			
			else{
				
				pTurn = 2;
				turn.setText("  Black Player's Turn\n");
				
			}
			
			pane.getChildren().remove(ghostRed2);
			pane.getChildren().remove(ghostJRed2);
			pane.getChildren().remove(c);
			
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostRed2 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			redK = new Circle(); redK.setCenterX(50); redK.setCenterY(50); redK.setRadius(25); redK.setStroke(Color.DARKGOLDENROD); redK.setFill(Color.RED);
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x - 1) {
						
						if(y == 7){
							
							pane.add(redK, x, y);
							redK.setOnMouseClicked(new MouseClick03());
							pane.getChildren().remove(redA.get(i));
							redA.remove(i);
							redA.add(redK);
							
						}
						
						else {
												
							GridPane.setColumnIndex(redA.get(i), x);
							GridPane.setRowIndex(redA.get(i), y);
						}
					}
				}
			}
		
			pTurn = 2;
			pane.getChildren().remove(ghostRed1);
			pane.getChildren().remove(ghostJRed1);
			pane.getChildren().remove(c);
			turn.setText("  Black Player's Turn\n");
			
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostJRed2 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			redK = new Circle(); redK.setCenterX(50); redK.setCenterY(50); redK.setRadius(25); redK.setStroke(Color.DARKGOLDENROD); redK.setFill(Color.RED);
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y - 2) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x - 2) {
						
						if(y == 7){
							
							pane.add(redK, x, y);
							redK.setOnMouseClicked(new MouseClick03());
							pane.getChildren().remove(redA.get(i));
							redA.remove(i);
							redA.add(redK);
							
						}
						
						else {
							
							GridPane.setColumnIndex(redA.get(i), x);
							GridPane.setRowIndex(redA.get(i), y);
						}
						
					}
				}
			}
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x - 1) {
						
						pane.getChildren().remove(blkA.get(i));
						blkA.remove(i);
						
					}
				}
			}
			
			if((checkBL(c, blkA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||(checkBR(c, blkA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false)){
				
			pTurn = 1;	
				
			}
			
			else{
				
				pTurn = 2;
				turn.setText("  Black Player's Turn\n");
				
			}
			
			pane.getChildren().remove(ghostRed1);
			pane.getChildren().remove(ghostJRed1);
			pane.getChildren().remove(c);

			
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	//ghosts for Red Kings
	class ghostRedK1 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x + 1) {
							
							GridPane.setColumnIndex(redA.get(i), x);
							GridPane.setRowIndex(redA.get(i), y);
							
						}
						
					}
				}
			
			pTurn = 2;
			pane.getChildren().remove(ghostJRedK1);
			pane.getChildren().remove(ghostJRedK2);
			pane.getChildren().remove(ghostJRedK3);
			pane.getChildren().remove(ghostJRedK4);
			pane.getChildren().remove(ghostRedK2);
			pane.getChildren().remove(ghostRedK3);
			pane.getChildren().remove(ghostRedK4);
			pane.getChildren().remove(c);
			turn.setText("Black Player's Turn   ");
			
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostRedK2 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x - 1) {
	
							GridPane.setColumnIndex(redA.get(i), x);
							GridPane.setRowIndex(redA.get(i), y);
						
					}
				}
			}
			
			pTurn = 2;
			pane.getChildren().remove(ghostJRedK1);
			pane.getChildren().remove(ghostJRedK2);
			pane.getChildren().remove(ghostJRedK3);
			pane.getChildren().remove(ghostJRedK4);
			pane.getChildren().remove(ghostRedK1);
			pane.getChildren().remove(ghostRedK3);
			pane.getChildren().remove(ghostRedK4);
			pane.getChildren().remove(c);
			turn.setText("  Black Player's Turn\n");
			
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostRedK3 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x + 1) {
						
						GridPane.setColumnIndex(redA.get(i), x);
						GridPane.setRowIndex(redA.get(i), y);
						
					}
				}
			}
			
			pTurn = 2;
			pane.getChildren().remove(ghostJRedK1);
			pane.getChildren().remove(ghostJRedK2);
			pane.getChildren().remove(ghostJRedK3);
			pane.getChildren().remove(ghostJRedK4);
			pane.getChildren().remove(ghostRedK2);
			pane.getChildren().remove(ghostRedK1);
			pane.getChildren().remove(ghostRedK4);
			pane.getChildren().remove(c);
			turn.setText("  Black Player's Turn\n");
			
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostRedK4 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
			
			
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x - 1) {
						
						GridPane.setColumnIndex(redA.get(i), x);
						GridPane.setRowIndex(redA.get(i), y);
						
					}
				}
			}
			
			pTurn = 2;
			pane.getChildren().remove(ghostJRedK1);
			pane.getChildren().remove(ghostJRedK2);
			pane.getChildren().remove(ghostJRedK3);
			pane.getChildren().remove(ghostJRedK4);
			pane.getChildren().remove(ghostRedK2);
			pane.getChildren().remove(ghostRedK3);
			pane.getChildren().remove(ghostRedK1);
			pane.getChildren().remove(c);
			turn.setText("  Black Player's Turn\n");
			
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostJRedK1 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y - 2) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x + 2) {
							
							GridPane.setColumnIndex(redA.get(i), x);
							GridPane.setRowIndex(redA.get(i), y);
							
						}
						
					}
				}
			
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x + 1) {
						
						pane.getChildren().remove(blkA.get(i));
						blkA.remove(i);
						
					}
				}
			}
			
			if((checkBL(c, blkA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||(checkBR(c, blkA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false) || 
					(checkTL(c, blkA) == true && checkJTL(c, blkA) == false && checkJTL(c, redA) == false) || (checkTR(c, blkA) == true && checkJTR(c, blkA) == false && checkJTR(c, redA) == false)){
				
			pTurn = 1;	
				
			}
			
			else{
				
				pTurn = 2;
				turn.setText("  Black Player's Turn\n");
				
			}
			
			pane.getChildren().remove(ghostJRedK1);
			pane.getChildren().remove(ghostJRedK2);
			pane.getChildren().remove(ghostJRedK3);
			pane.getChildren().remove(ghostJRedK4);
			pane.getChildren().remove(ghostRedK2);
			pane.getChildren().remove(ghostRedK3);
			pane.getChildren().remove(ghostRedK4);
			pane.getChildren().remove(c);
			
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostJRedK2 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y - 2) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x - 2) {
	
							GridPane.setColumnIndex(redA.get(i), x);
							GridPane.setRowIndex(redA.get(i), y);
						
					}
				}
			}
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x - 1) {
						
						pane.getChildren().remove(blkA.get(i));
						blkA.remove(i);
						
					}
				}
			}
			
			if((checkBL(c, blkA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||(checkBR(c, blkA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false) || 
					(checkTL(c, blkA) == true && checkJTL(c, blkA) == false && checkJTL(c, redA) == false) || (checkTR(c, blkA) == true && checkJTR(c, blkA) == false && checkJTR(c, redA) == false)){

				
			pTurn = 1;	
				
			}
			
			else{
				
				pTurn = 2;
				turn.setText("  Black Player's Turn\n");

			}
			
			pane.getChildren().remove(ghostJRedK1);
			pane.getChildren().remove(ghostJRedK2);
			pane.getChildren().remove(ghostJRedK3);
			pane.getChildren().remove(ghostJRedK4);
			pane.getChildren().remove(ghostRedK1);
			pane.getChildren().remove(ghostRedK3);
			pane.getChildren().remove(ghostRedK4);
			pane.getChildren().remove(c);
			
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostJRedK3 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y + 2) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x + 2) {
						
						GridPane.setColumnIndex(redA.get(i), x);
						GridPane.setRowIndex(redA.get(i), y);
						
					}
				}
			}
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x + 1) {
						
						pane.getChildren().remove(blkA.get(i));
						blkA.remove(i);
						
					}
				}
			}
			
			if((checkBL(c, blkA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||(checkBR(c, blkA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false) || 
					(checkTL(c, blkA) == true && checkJTL(c, blkA) == false && checkJTL(c, redA) == false) || (checkTR(c, blkA) == true && checkJTR(c, blkA) == false && checkJTR(c, redA) == false)){

				
			pTurn = 1;	
				
			}
			
			else{
				
				pTurn = 2;
				turn.setText("  Black Player's Turn\n");
				
			}
			
			pane.getChildren().remove(ghostJRedK1);
			pane.getChildren().remove(ghostJRedK2);
			pane.getChildren().remove(ghostJRedK3);
			pane.getChildren().remove(ghostJRedK4);
			pane.getChildren().remove(ghostRedK2);
			pane.getChildren().remove(ghostRedK1);
			pane.getChildren().remove(ghostRedK4);
			pane.getChildren().remove(c);
			
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostJRedK4 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
			
			
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y + 2) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x - 2) {
						
						GridPane.setColumnIndex(redA.get(i), x);
						GridPane.setRowIndex(redA.get(i), y);
						
					}
				}
			}
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x - 1) {
						
						pane.getChildren().remove(blkA.get(i));
						blkA.remove(i);
						
					}
				}
			}
			
			if((checkBL(c, blkA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||(checkBR(c, blkA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false) || 
					(checkTL(c, blkA) == true && checkJTL(c, blkA) == false && checkJTL(c, redA) == false) || (checkTR(c, blkA) == true && checkJTR(c, blkA) == false && checkJTR(c, redA) == false)){

				
			pTurn = 1;	
				
			}
			
			else{
				
				pTurn = 2;
				turn.setText("  Black Player's Turn\n");

			}
			
			pane.getChildren().remove(ghostJRedK1);
			pane.getChildren().remove(ghostJRedK2);
			pane.getChildren().remove(ghostJRedK3);
			pane.getChildren().remove(ghostJRedK4);
			pane.getChildren().remove(ghostRedK2);
			pane.getChildren().remove(ghostRedK3);
			pane.getChildren().remove(ghostRedK1);
			pane.getChildren().remove(c);
			
			if (blkA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Red Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostBlk1 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			blkK = new Circle(); blkK.setCenterX(50); blkK.setCenterY(50); blkK.setRadius(25); blkK.setStroke(Color.DARKGOLDENROD); blkK.setFill(Color.DARKGRAY);

			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x + 1) {
						
						if(y == 0){
							
							pane.add(blkK, x, y);
							blkK.setOnMouseClicked(new MouseClick04());
							pane.getChildren().remove(blkA.get(i));
							blkA.remove(i);
							blkA.add(blkK);
						}
						
						else {
							
						GridPane.setColumnIndex(blkA.get(i), x);
						GridPane.setRowIndex(blkA.get(i), y);}
					
					}
				}
			}
			
			pTurn = 1;
			pane.getChildren().remove(ghostBlk2);
			pane.getChildren().remove(ghostJBlk2);
			pane.getChildren().remove(c);
			turn.setText("  Red Player's Turn\n");	
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostJBlk1 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			blkK = new Circle(); blkK.setCenterX(50); blkK.setCenterY(50); blkK.setRadius(25); blkK.setStroke(Color.DARKGOLDENROD); blkK.setFill(Color.DARKGRAY);
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
				
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y + 2) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x + 2) {
						
						if(y == 0){
							
							pane.add(blkK, x, y);
							blkK.setOnMouseClicked(new MouseClick04());
							pane.getChildren().remove(blkA.get(i));
							blkA.remove(i);
							blkA.add(blkK);
						}
						
						else {
							
						GridPane.setColumnIndex(blkA.get(i), x);
						GridPane.setRowIndex(blkA.get(i), y);}
											
					}
				}
			}
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x + 1) {
						
						pane.getChildren().remove(redA.get(i));
						redA.remove(i);
						
					}
				}
			}
			
			if((GridPane.getColumnIndex(c) != 1 && GridPane.getRowIndex(c) != 6 && checkBL(c, blkA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||
					(GridPane.getColumnIndex(c) != 6 && GridPane.getRowIndex(c) != 6 && checkBR(c, blkA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false)){
				
			pTurn = 2;	
				
			}
			
			else{
				
				pTurn = 1;
				turn.setText("  Red Player's Turn\n");
				
			}
			
			pane.getChildren().remove(ghostJBlk2);
			pane.getChildren().remove(ghostBlk2);
			pane.getChildren().remove(c);
			turn.setText("  Red Player's Turn\n");	
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostBlk2 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			blkK = new Circle(); blkK.setCenterX(50); blkK.setCenterY(50); blkK.setRadius(25); blkK.setStroke(Color.DARKGOLDENROD); blkK.setFill(Color.DARKGRAY);

			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x - 1) {
						
						if(y == 0){
							
							pane.add(blkK, x, y);
							blkK.setOnMouseClicked(new MouseClick04());
							pane.getChildren().remove(blkA.get(i));
							blkA.remove(i);
							blkA.add(blkK);
						}
						
						else {
							
						GridPane.setColumnIndex(blkA.get(i), x);
						GridPane.setRowIndex(blkA.get(i), y);}
				
					}
				}
			}
			
			pTurn = 1;
			pane.getChildren().remove(ghostBlk1);
			pane.getChildren().remove(ghostJBlk1);
			pane.getChildren().remove(c);
			turn.setText("  Red Player's Turn\n");	
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostJBlk2 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			blkK = new Circle(); blkK.setCenterX(50); blkK.setCenterY(50); blkK.setRadius(25); blkK.setStroke(Color.DARKGOLDENROD); blkK.setFill(Color.DARKGRAY);

			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y + 2) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x - 2) {
						
						if(y == 0){
							
							pane.add(blkK, x, y);
							blkK.setOnMouseClicked(new MouseClick04());
							pane.getChildren().remove(blkA.get(i));
							blkA.remove(i);
							blkA.add(blkK);
						}
						
						else {
							
						GridPane.setColumnIndex(blkA.get(i), x);
						GridPane.setRowIndex(blkA.get(i), y);}
						
					}
				}
			}
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x - 1) {
						
						pane.getChildren().remove(redA.get(i));
						redA.remove(i);
						
					}
				}
			}
			
			if((GridPane.getColumnIndex(c) != 1 && GridPane.getRowIndex(c) != 6 && checkBL(c, blkA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||
					(GridPane.getColumnIndex(c) != 6 && GridPane.getRowIndex(c) != 6 && checkBR(c, blkA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false)){
				
			pTurn = 2;	
				
			}
			
			else{
				
				pTurn = 1;
				turn.setText("  Red Player's Turn\n");
				
			}
			
			pane.getChildren().remove(ghostJBlk1);
			pane.getChildren().remove(ghostBlk1);
			pane.getChildren().remove(c);
			turn.setText("  Red Player's Turn\n");	
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
				
			}
			
		}
	}

	class ghostBlkK2 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());

			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x - 1) {
						
						GridPane.setColumnIndex(blkA.get(i), x);
						GridPane.setRowIndex(blkA.get(i), y);
						
					}
				}
			}
			
			pTurn = 1;
			pane.getChildren().remove(ghostJBlkK1);
			pane.getChildren().remove(ghostJBlkK2);
			pane.getChildren().remove(ghostJBlkK3);
			pane.getChildren().remove(ghostJBlkK4);
			pane.getChildren().remove(ghostBlkK1);
			pane.getChildren().remove(ghostBlkK3);
			pane.getChildren().remove(ghostBlkK4);
			pane.getChildren().remove(c);
			turn.setText("  Red Player's Turn\n");	
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostBlkK1 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());

			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x + 1) {
						
						GridPane.setColumnIndex(blkA.get(i), x);
						GridPane.setRowIndex(blkA.get(i), y);
						
					}
				}
			}
			
			pTurn = 1;
			pane.getChildren().remove(ghostJBlkK1);
			pane.getChildren().remove(ghostJBlkK2);
			pane.getChildren().remove(ghostJBlkK3);
			pane.getChildren().remove(ghostJBlkK4);
			pane.getChildren().remove(ghostBlkK2);
			pane.getChildren().remove(ghostBlkK3);
			pane.getChildren().remove(ghostBlkK4);
			pane.getChildren().remove(c);
			turn.setText("  Red Player's Turn\n");	
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostBlkK3 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());

			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x + 1) {
						
						GridPane.setColumnIndex(blkA.get(i), x);
						GridPane.setRowIndex(blkA.get(i), y);
						
					}
				}
			}
			
			pTurn = 1;
			pane.getChildren().remove(ghostJBlkK1);
			pane.getChildren().remove(ghostJBlkK2);
			pane.getChildren().remove(ghostJBlkK3);
			pane.getChildren().remove(ghostJBlkK4);
			pane.getChildren().remove(ghostBlkK1);
			pane.getChildren().remove(ghostBlkK2);
			pane.getChildren().remove(ghostBlkK4);
			pane.getChildren().remove(c);
			turn.setText("  Red Player's Turn\n");	
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostBlkK4 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());

			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x - 1) {
						
						GridPane.setColumnIndex(blkA.get(i), x);
						GridPane.setRowIndex(blkA.get(i), y);
						
					}
				}
			}
			
			pTurn = 1;
			pane.getChildren().remove(ghostJBlkK1);
			pane.getChildren().remove(ghostJBlkK2);
			pane.getChildren().remove(ghostJBlkK3);
			pane.getChildren().remove(ghostJBlkK4);
			pane.getChildren().remove(ghostBlkK1);
			pane.getChildren().remove(ghostBlkK2);
			pane.getChildren().remove(ghostBlkK3);
			pane.getChildren().remove(c);
			turn.setText("  Red Player's Turn\n");	
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostJBlkK1 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y - 2) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x + 2) {
							
							GridPane.setColumnIndex(blkA.get(i), x);
							GridPane.setRowIndex(blkA.get(i), y);
							
						}
						
					}
				}
			
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x + 1) {
						
						pane.getChildren().remove(redA.get(i));
						redA.remove(i);
						
					}
				}
			}
			
			if((checkBL(c, redA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||(checkBR(c, redA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false) || 
					(checkTL(c, redA) == true && checkJTL(c, blkA) == false && checkJTL(c, redA) == false) || (checkTR(c, redA) == true && checkJTR(c, blkA) == false && checkJTR(c, redA) == false)){
				
			pTurn = 2;	
				
			}
			
			else{
				
				pTurn = 1;
				turn.setText("  Red Player's Turn\n");
				
			}
			
			pane.getChildren().remove(ghostJBlkK2);
			pane.getChildren().remove(ghostJBlkK3);
			pane.getChildren().remove(ghostJBlkK4);
			pane.getChildren().remove(ghostBlkK1);
			pane.getChildren().remove(ghostBlkK2);
			pane.getChildren().remove(ghostBlkK3);
			pane.getChildren().remove(ghostBlkK4);
			pane.getChildren().remove(c);
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostJBlkK2 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y - 2) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x - 2) {
	
							GridPane.setColumnIndex(blkA.get(i), x);
							GridPane.setRowIndex(blkA.get(i), y);
						
					}
				}
			}
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y - 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x - 1) {
						
						pane.getChildren().remove(redA.get(i));
						redA.remove(i);
						
					}
				}
			}
			
			if((checkBL(c, redA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||(checkBR(c, redA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false) || 
					(checkTL(c, redA) == true && checkJTL(c, blkA) == false && checkJTL(c, redA) == false) || (checkTR(c, redA) == true && checkJTR(c, blkA) == false && checkJTR(c, redA) == false)){
				
			pTurn = 2;	
				
			}
			
			else{
				
				pTurn = 1;
				turn.setText("  Red Player's Turn\n");
				
			}
			
			pane.getChildren().remove(ghostJBlkK1);
			pane.getChildren().remove(ghostJBlkK3);
			pane.getChildren().remove(ghostJBlkK4);
			pane.getChildren().remove(ghostBlkK1);
			pane.getChildren().remove(ghostBlkK2);
			pane.getChildren().remove(ghostBlkK3);
			pane.getChildren().remove(ghostBlkK4);
			pane.getChildren().remove(c);
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
			}
			
		}
	}
	
	class ghostJBlkK3 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
	
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y + 2) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x + 2) {
						
						GridPane.setColumnIndex(blkA.get(i), x);
						GridPane.setRowIndex(blkA.get(i), y);
						
					}
				}
			}
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x + 1) {
						
						pane.getChildren().remove(redA.get(i));
						redA.remove(i);
						
					}
				}
			}
			
			if((checkBL(c, redA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||(checkBR(c, redA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false) || 
					(checkTL(c, redA) == true && checkJTL(c, blkA) == false && checkJTL(c, redA) == false) || (checkTR(c, redA) == true && checkJTR(c, blkA) == false && checkJTR(c, redA) == false)){
				
			pTurn = 2;	
				
			}
			
			else{
				
				pTurn = 1;
				turn.setText("  Red Player's Turn\n");				
			}
			
			pane.getChildren().remove(ghostJBlkK1);
			pane.getChildren().remove(ghostJBlkK2);
			pane.getChildren().remove(ghostJBlkK4);
			pane.getChildren().remove(ghostBlkK1);
			pane.getChildren().remove(ghostBlkK2);
			pane.getChildren().remove(ghostBlkK3);
			pane.getChildren().remove(ghostBlkK4);
			pane.getChildren().remove(c);
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
				
			}
			
		}
	}
	
	class ghostJBlkK4 implements EventHandler <MouseEvent>{

		@Override
		public void handle(MouseEvent e2) {
			
			
			Circle c = (Circle)(e2.getSource());
			
			int x = GridPane.getColumnIndex(c);
			int y = GridPane.getRowIndex(c);
			
			for(int i = 0; i < blkA.size(); i++){
				
				if(GridPane.getRowIndex(blkA.get(i)) == y + 2) {
					
					if(GridPane.getColumnIndex(blkA.get(i)) == x - 2) {
						
						GridPane.setColumnIndex(blkA.get(i), x);
						GridPane.setRowIndex(blkA.get(i), y);
						
					}
				}
			}
			
			for(int i = 0; i < redA.size(); i++){
				
				if(GridPane.getRowIndex(redA.get(i)) == y + 1) {
					
					if(GridPane.getColumnIndex(redA.get(i)) == x - 1) {
						
						pane.getChildren().remove(redA.get(i));
						redA.remove(i);
						
					}
				}
			}
			
			if((checkBL(c, redA) == true && checkJBL(c, blkA) == false && checkJBL(c, redA) == false) ||(checkBR(c, redA) == true && checkJBR(c, blkA) == false && checkJBR(c, redA) == false) || 
					(checkTL(c, redA) == true && checkJTL(c, blkA) == false && checkJTL(c, redA) == false) || (checkTR(c, redA) == true && checkJTR(c, blkA) == false && checkJTR(c, redA) == false)){
				
			pTurn = 2;	
				
			}
			
			else{
				
				pTurn = 1;
				turn.setText("  Red Player's Turn\n");
				
			}
			
			pane.getChildren().remove(ghostJBlkK1);
			pane.getChildren().remove(ghostJBlkK2);
			pane.getChildren().remove(ghostJBlkK3);
			pane.getChildren().remove(ghostBlkK1);
			pane.getChildren().remove(ghostBlkK2);
			pane.getChildren().remove(ghostBlkK3);
			pane.getChildren().remove(ghostBlkK4);
			pane.getChildren().remove(c);
			
			if (redA.isEmpty() == true) {
				
				pTurn = 3;
				turn.setText("  Black Player Wins!\n");
				
			}
			
		}
	}
	
	//methods that check if a piece is bl, br, tr, tl, from another piece and two spaces in each direction as well
	public boolean checkBL (Circle c, ArrayList<Circle> a){
		
		for(int i = 0; i<a.size(); i++){
			
			if(GridPane.getRowIndex(a.get(i)) == GridPane.getRowIndex(c) + 1) {
				
				if(GridPane.getColumnIndex(a.get(i)) == GridPane.getColumnIndex(c) - 1) {
					
					return true;
					
				}
			}
		}
		
		return false;
		
	}
	
	public boolean checkBR (Circle c, ArrayList<Circle> a){
		
		for(int i = 0; i<a.size(); i++){
			
			if(GridPane.getRowIndex(a.get(i)) == GridPane.getRowIndex(c) + 1) {
				
				if(GridPane.getColumnIndex(a.get(i)) == GridPane.getColumnIndex(c) + 1) {
					
					return true;
					
				}
			}
		}
		
		return false;
		
	}

	public boolean checkTR (Circle c, ArrayList<Circle> a){
		
		for(int i = 0; i<a.size(); i++){
			
			if(GridPane.getRowIndex(a.get(i)) == GridPane.getRowIndex(c) - 1) {
				
				if(GridPane.getColumnIndex(a.get(i)) == GridPane.getColumnIndex(c) + 1) {
					
					return true;
					
				}
			}
		}
		
		return false;
		
	}

	public boolean checkTL (Circle c, ArrayList<Circle> a){
	
		for(int i = 0; i<a.size(); i++){
		
			if(GridPane.getRowIndex(a.get(i)) == GridPane.getRowIndex(c) - 1) {
			
				if(GridPane.getColumnIndex(a.get(i)) == GridPane.getColumnIndex(c) - 1) {
				
					return true;
				
				}
			}
		}
	
		return false;
	
	}

	public boolean checkJBL (Circle c, ArrayList<Circle> a){
	
		for(int i = 0; i<a.size(); i++){
		
			if(GridPane.getRowIndex(a.get(i)) == GridPane.getRowIndex(c) + 2) {
			
				if(GridPane.getColumnIndex(a.get(i)) == GridPane.getColumnIndex(c) - 2) {
					
					return true;
				
				}
			}
		}
	
		return false;
	
	}

	public boolean checkJBR (Circle c, ArrayList<Circle> a){
	
		for(int i = 0; i<a.size(); i++){
			
			if(GridPane.getRowIndex(a.get(i)) == GridPane.getRowIndex(c) + 2) {
			
				if(GridPane.getColumnIndex(a.get(i)) == GridPane.getColumnIndex(c) + 2) {
				
					return true;
				
				}
			}
		}
	
		return false;
	
	}

	public boolean checkJTR (Circle c, ArrayList<Circle> a){
	
		for(int i = 0; i<a.size(); i++){
		
			if(GridPane.getRowIndex(a.get(i)) == GridPane.getRowIndex(c) - 2) {
			
				if(GridPane.getColumnIndex(a.get(i)) == GridPane.getColumnIndex(c) + 2) {
				
					return true;
				}
			}
		}
	
		return false;
	
	}

	public boolean checkJTL (Circle c, ArrayList<Circle> a){

		for(int i = 0; i<a.size(); i++){
	
			if(GridPane.getRowIndex(a.get(i)) == GridPane.getRowIndex(c) - 2) {
		
				if(GridPane.getColumnIndex(a.get(i)) == GridPane.getColumnIndex(c) - 2) {
			
					return true;
			
				}
			}
		}

		return false;

	}

}
