
import Database.Metodos.CarritoIm;
import javax.swing.JOptionPane;

/**
 *
 * @author O-5-K
 */
public class PruebaLogin {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CarritoIm car= new CarritoIm();
        
        
        String id= JOptionPane.showInputDialog("Ingresa id");
        
        String[] res=car.Nombre(id);
        String[] cant=car.Cantidad(id);
        String[] pres=car.Precio(id);
        
        for(int i=0; i<res.length;i++){
            System.out.println(res[i]);
            System.out.println(cant[i]);
            System.out.println(pres[i]);
            
        }
    }
    
}
