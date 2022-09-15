public class PJava implements Programa {
    private static final String fala = "*Escrutinar em Java*";
    private String name;

    public PJava(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String speak(){
        return PJava.fala;
    }

}
