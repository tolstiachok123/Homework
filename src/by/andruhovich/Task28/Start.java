package by.andruhovich.Task28;

public class Start {
    public static void main(String[] args) {
        Depository depository = new Depository();
        depository.addObject(new String("mom washed the window"));
        depository.addObject(334);
        System.out.println(depository.toString());
        System.out.println(depository.getByPosition(1));
    }
}
