/*
 * This a quick & dirty tool to generate starter schemas in Mondrian 4
 * against mongoDB data sources.
 * 
 * Use this completely as-is on non-production systems to generate semamtic
 * models that get up & running on Mondrian with MongoDB. Use at your own risk!
 * 
 * Find the project on Github, send me messages on there, contribute to the
 * project and let me know how you make out!
*
* Module: MongoModel
* Primary class, start in main here
* 
 * Thanks, Mark Kromer
 * July 20, 2014 mark_kromer@mail.com
 * 
 */

package MongoModel;

import com.mongodb.MongoClient;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;



/**
 *
 * @author mkromer
 */
public class MongoModel extends JApplet  {
    
    private static final int JFXPANEL_WIDTH_INT = 300;
    private static final int JFXPANEL_HEIGHT_INT = 250;
    private static JFXPanel fxContainer;
    MongoClient mongoClient;       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        MainJFrame njf = new MainJFrame();
        njf.setVisible(true);
        
    }
    
    @Override
    public void init() {
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
        add(fxContainer, BorderLayout.CENTER);
        // create JavaFX scene
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                createScene();
            }
        });
    }
    
    private void createScene() {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        fxContainer.setScene(new Scene(root));
    }
}
