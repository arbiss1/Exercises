package enums;

public enum Enums {
    PESHA(1),
    MOSHA(24),
    NGJYRA("e zeze");

    private int pesha;
    private String ngjyra;

    Enums(int pesha){
        this.pesha = pesha;
    }
    Enums(String ngjyra){
        this.ngjyra = ngjyra;
    }

    public int getPesha() {
        return pesha;
    }

    public String getNgjyra() {
        return ngjyra;
    }
}
