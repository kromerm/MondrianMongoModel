/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MongoModel;

/**
 *
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
 
public class ConfigurationManager {

    private String configFilePath;
    private Properties properties = new Properties();    
    
    public ConfigurationManager(String configFilePath) throws IOException {
        this.configFilePath = configFilePath;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(configFilePath);
            properties.loadFromXML(fis);
        } catch (FileNotFoundException ex) {
            // creates the configuration file and set default properties
            setDefaults();
            save();
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
    }
    
    private void setDefaults() {
        properties.put("olap4j", "C:\\Pentaho\\server\\biserver-ee\\pentaho-solutions\\system\\");
        properties.put("mondrian", "C:\\Pentaho\\server\\biserver-ee\\pentaho-solutions\\system\\");
    }
    
    public void save() throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(configFilePath);
            properties.storeToXML(fos, "Mongo Model Settings");
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }
    
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
    
    public String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }
    
    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
    }
}   
