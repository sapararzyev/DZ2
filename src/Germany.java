public class Germany extends Country{
    public String language;

    public Germany(String name, String adres, String language) {
        super(name, adres);
        this.language = language;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("язык" + language);
    }
}
