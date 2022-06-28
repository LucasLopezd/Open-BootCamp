import singleton.Fruta;

public class App {
    public static void main(String[] args) throws Exception {
       
        Fruta fruta = Fruta.getIntance("Frutilla");
        System.out.println("\nla fruta1 es: " + fruta.getName() + ", y esta en la zona de memoria: " + fruta);

        Fruta fruta2 = Fruta.getIntance("Naranja");        
        System.out.println("la fruta2 es: " + fruta2.getName() + ", y esta en la zona de memoria: " + fruta2);

        System.out.println("\nsolo se puede instanciar una vez, por eso no puedo asignarle un nuevo valor al nombre.");

        fruta2.setName("Naranja");
        System.out.println("\nla fruta2 es: " + fruta2.getName() + ", y esta en la zona de memoria: " + fruta2);
        System.out.println("\nusando el setter se puede asiganrle el nuevo valor al nombre a la misma instancia.");
    }
}
