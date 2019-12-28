package loginClasses;

import java.util.Locale;
import java.util.logging.Logger;

import chatroom.ServiceLocator;
import chatroom.abstractClasses.View;
import chatroom.appClasses.App_Model;
import chatroom.commonClasses.Translator;
import chatroom.server.message.Login;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login_View extends View<App_Model>{
	    
	    Label lblName;
	    TextField tfName;
	    Label lblPassword;
	    TextField tfPassword;
	    Button btnApply;
	    HBox loginBox = new HBox();

		public Login_View(Stage stage, App_Model model) {
	        super(stage, model);
	        ServiceLocator.getServiceLocator().getLogger().info("Application view initialized");
	    }

		@Override
		protected Scene create_GUI() {
		    ServiceLocator sl = ServiceLocator.getServiceLocator();  
		    Logger logger = sl.getLogger();
		    
	       for (Locale locale : sl.getLocales()) {
	           MenuItem language = new MenuItem(locale.getLanguage());
	           menuFileLanguage.getItems().add(language);
	           language.setOnAction( event -> {
					sl.getConfiguration().setLocalOption("Language", locale.getLanguage());
	                sl.setTranslator(new Translator(locale.getLanguage()));
	                updateTexts();
	            });
	        }
		    
			
		    HBox root = new HBox();
			Label lblName = new Label ("Benutzername: ");
			TextField tfName = new TextField ("");
			Label lblPassword = new Label ("Kennwort: ");
			TextField tfPassword = new TextField ("");


	        
	        updateTexts();
			
	        Scene scene = new Scene(root);
	        scene.getStylesheets().add(
	                getClass().getResource("app.css").toExternalForm());
	        return scene;
		}
		
		   protected void updateTexts() {
		       Translator t = ServiceLocator.getServiceLocator().getTranslator();
		        
		        
		        // Other controls
	           btnClick.setText(t.getString("button.clickme"));
	           
	           stage.setTitle(t.getString("program.name"));
		    }
	}
	
	
	
	
	
}
