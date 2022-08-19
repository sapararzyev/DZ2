public class Italy extends Country{
    public int time;

    public Italy(String name, String adres, int time) {
        super(name, adres);
        this.time = time;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("время" + time);
    }
}
