package singleton;

public class Fruta {

    private static Fruta fruta;
    private String name;

    private Fruta(){

    }

    private Fruta(String name){
        this.name = name;
    }

    public static Fruta getIntance(String name){
        return (fruta == null) ? fruta = new Fruta(name) : fruta;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}