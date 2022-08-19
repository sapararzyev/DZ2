public abstract class Country implements Printable {
    public String name;
    public String adres;

    public Country(String name, String adres) {
        this.name = name;
        this.adres = adres;
    }


    @Override
    public void print() {
        System.out.println(
                "\nстрана"+ name +
                "\nадрес"+ adres);
    }
}
