package recovery;

import java.util.Random;

/**
 *
 * @author Angel Colina
 */
public class generador_codigo {
    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final Random rnd = new Random();

    String randomString( int len ) {
        
       StringBuilder sb = new StringBuilder( len );
       for( int i = 0; i < len; i++ ) 
          sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
       return sb.toString();
    }
}
