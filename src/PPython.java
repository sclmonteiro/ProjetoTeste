public class PPython implements Programa {
    private static final String fala = "*Escrutinar em Python*";
    private String name;

    public PPython(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String speak(){
        return PPython.fala;
    }
}
