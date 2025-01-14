package project.template;

import java.io.File;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;

public class StatusBar extends HBox{

	
	public StatusBar(){
            
                
		statusBarGp = new GridPane();
                ImageView view=new ImageView("file:///C:/Users/Avi/Desktop/icon.jpg");
                view.setFitHeight(25+20);
                view.setFitWidth(25+25+5);
                resetButton = new Button(null,view);
                //resetButton.setPrefSize(0.5,0.5);
                
		whitePlayerAlert = new Label("");
		blackPlayerAlert = new Label("");
		whitePlayerTimer = new Label("");
		blackPlayerTimer = new Label("");
                Alert=new Label("");
                Alert1=new Label("");
		winner = new Label("");
                //resetButton.setMaxSize(0.2, 0.2);
                 
                resetButton.setStyle("-fx-background-radius: 10, 10, 10, 10; ");
                
                //statusBarGp.setGridLinesVisible(true);
		ColumnConstraints column = new ColumnConstraints();
		column.setPercentWidth(50);
		statusBarGp.getColumnConstraints().add(column);
		column = new ColumnConstraints();
		column.setPercentWidth(30);
		statusBarGp.getColumnConstraints().add(column);
		column = new ColumnConstraints();
		column.setPercentWidth(50);
		statusBarGp.getColumnConstraints().add(column);
		statusBarGp.setPrefSize(2000, 10);
		statusBarGp.getRowConstraints().add(new RowConstraints(70/2));
		statusBarGp.addRow(0, whitePlayerAlert, resetButton, blackPlayerAlert);
		for (Node n: statusBarGp.getChildren()) {
			GridPane.setHalignment(n, HPos.CENTER);
			GridPane.setValignment(n, VPos.CENTER);
			if (n instanceof Label) {
				n.setStyle("-fx-font-size: 20pt; -fx-font-weight: bold; -fx-opacity: 2.0;");
			}
		}
		statusBarGp.setVgap(10);
		statusBarGp.setHgap(10);
                
		statusBarGp.setPadding(new Insets(10, 10, 10, 10));
                
		
                
		statusBarGp.setStyle("-fx-background-color: BURLYWOOD; -fx-border-color:BLUE; -fx-border-width: 1px; -fx-effect: innershadow(gaussian, rgba(0,0,0,0.4), 75, 0.5, 0, 10);");
		statusBarGp.setSnapToPixel(false);
                statusBarGp.setEffect(new DropShadow());
                
                
		getChildren().add(statusBarGp);
	}
	
	public void resize(double width, double height){
		super.resize(width, height); 
		setWidth(width);
		setHeight(height);
	}
	
	private Button 	resetButton;
	public Label	whitePlayerAlert;
	public Label	blackPlayerAlert;
	public Label	whitePlayerTimer;
	public Label	blackPlayerTimer;
	public Label	winner;
        public Label    Alert;
        public Label    Alert1;
        
	private GridPane statusBarGp;

	public Button getResetButton() {
		return resetButton;
	}

	public void setResetButton(Button resetButton) {
		this.resetButton = resetButton;
                
	}	
}