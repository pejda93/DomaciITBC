package prvi;

public class Poruka {
    private String poruka;
    private String posiljalac;
    private String primalac;
    int suma;
    int id;

    /*Konstruktori*/

    public Poruka(String poruka, String posiljalac, String primalac, int suma, int id) {
        this.poruka = poruka;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.suma = suma;
        this.id = id;
    }
    /*Metode*/
    // TODO: setter i getter


    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public String getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(String posiljalac) {
        this.posiljalac = posiljalac;
    }

    public String getPrimalac() {
        return primalac;
    }

    public void setPrimalac(String primalac) {
        this.primalac = primalac;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // U konzoli ispisuje, ako je suma nenegativna:
    // {posiljalac} salje {suma} para {primalac}-u, uz poruku:
    // {poruka}
    // a ako je suma negativna:
    // {posiljalac} primac {suma} para od {primalac}-a, uz poruku:
    // {poruka}
    public void posalji(){
        //TODO: Implement me
        if (suma>0){
            System.out.println(this.posiljalac+" salje "+this.suma+" para "+primalac+"-u"+" uz poruku "+this.poruka);
        }else{
            System.out.println(this.posiljalac+" prima "+this.suma*(-1)+" para "+primalac+"-u"+" uz poruku "+poruka);
        }
    }

    // Ispisuje:
    // {posiljalac} i {prilamalac} vrse tranzakciju od {suma}, uz poruku: {poruka} ({id})

    @Override
    public String toString() {
        return posiljalac + " i " + primalac + " vrse tranzakciju od " + suma + ", uz poruku: "+poruka+" "+"("+id+")\n";
    }
}
