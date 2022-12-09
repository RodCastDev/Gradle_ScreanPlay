package SpAcademyCucumber;

public class Usuario {

    int intId;
    String strNombre;
    double dblSaldo;


    public Usuario(int intId, String strNombre, Double dblSaldo){
        this.intId = intId;
        this.strNombre = strNombre;
        this.dblSaldo = dblSaldo;
    }

    public int getIntId() {
        return intId;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public Double getDblSaldo() {
        return dblSaldo;
    }

}
