package clasificacionAnimal;

public abstract class Invertebrado extends ReinoAnimal {
    private Integer nroHueso;

    public Integer getNroHueso() {
        return nroHueso;
    }

    public void setNroHueso(Integer nroHueso) {
        this.nroHueso = nroHueso;
    }

    public Invertebrado(){
        nroHueso = 0;
    }



}
