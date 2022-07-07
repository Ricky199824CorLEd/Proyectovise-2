package modelo;

public class Persona {

    int id;
    String nom;
    String Correo;
    int tel;

    public Persona() {
    }

    public Persona(int id, String nom, String correo, int tel) {
        this.id = id;
        this.nom = nom;
        this.Correo = correo;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nom=" + nom + ", Correo=" + Correo + ", tel=" + tel + '}';
    }
}
