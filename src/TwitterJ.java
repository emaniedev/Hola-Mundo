/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mazhe
 */
    import java.util.List;  
    import twitter4j.*;
    
public class TwitterJ {
    
    private TwitterFactory tf;
    private Configuracion conf = new Configuracion();
    private Twitter twitter;
    
       public TwitterJ(String cambio) throws TwitterException {
           TwitterFactory tf = new TwitterFactory();
           tf = new TwitterFactory(conf.cb.build());
           twitter=tf.getInstance();
           
           twitter.updateStatus(new StatusUpdate(cambio));     
    }
    
    
    
}    

