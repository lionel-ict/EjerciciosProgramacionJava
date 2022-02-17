package ud7excepciones.ejemplopersona;

public class Main {

    public static void main(String[] args) {

        try {
            
            Persona p = new Persona("Lionel", -100);
            System.out.println("FIN DEL PROGRAMA");

        } catch (PersonaException e){
            
        } catch (NullPointerException e) {
            
        }catch (Exception e) {
            //System.err.println(e.getMessage());
            e.printStackTrace();
        }
        
        System.out.println("FIN DEL PROGRAMA!!!");

    }
}