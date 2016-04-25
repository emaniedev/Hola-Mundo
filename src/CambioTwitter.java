
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.Twitter;
import twitter4j.TwitterException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mazhe
 */
public class CambioTwitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            TwitterJ prueba= new TwitterJ ("Prueba3");
        } catch (TwitterException ex) {
            Logger.getLogger(CambioTwitter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
