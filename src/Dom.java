public class Dom implements Budynek {
    private double powierzchnia;
    private int długość;
    private int szerokość;
    private int liczbaOkien;
    private int liczbaMieszkancow;


    @Override
    public void setdługość(int długość) {
        this.długość = długość;
    }

    @Override
    public void setszerokość(int szerokość) {
        this.szerokość = szerokość;
    }

    @Override
    public void powierzchnia(double pow) {
        this.powierzchnia = pow;
    }

    @Override
    public String adresBudynku(String adres) {
        return adres;
    }

    @Override
    public void liczbaOkien(int value) {
        this.liczbaOkien = value;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        this.liczbaMieszkancow = value;

    }

    @Override
    public void kolorDomu(KolorEnum kolor) {


    }


    @Override
    public void Info() {
        System.out.println("Pole całkowite: " + długość * szerokość);
    }


    public int getDługość() {
        return długość;
    }

    public void setDługość(int długość) {
        this.długość = długość;
    }

    public int getSzerokość() {
        return szerokość;
    }

    public void setSzerokość(int szerokość) {
        this.szerokość = szerokość;
    }

    public void Cena(int Cena) {
        System.out.println("Cena: " + Cena);
    }

    @Override
    public String toString() {
        return "Dom{" +
                "powierzchnia=" + powierzchnia +
                ", długość=" + długość +
                ", szerokość=" + szerokość +
                ", liczbaOkien=" + liczbaOkien +
                ", liczbaMieszkancow=" + liczbaMieszkancow +
                '}';
    }
}