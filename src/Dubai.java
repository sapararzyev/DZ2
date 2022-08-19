public final class Dubai extends Country  {
    public String weather;

    public Dubai(String name, String adres, String weather) {
        super(name, adres);
        this.weather = weather;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("погода" + weather);
    }
}
