package ud3ejercicios2buclesalpha;


import javax.swing.JOptionPane;

public class Alpha01
{
    public static void main(String[] args) {
        
        String texto = JOptionPane.showInputDialog("texto");
        System.out.println(texto);
        
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        
        for(int i = -999999; i <= 999999; i++){
            System.out.println(i);
        }
        
    }
}
