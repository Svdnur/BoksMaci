public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("A",30,130,69,30,0);
        Fighter f2 = new Fighter("B",40,100,80,40,1);


        Ring r = new Ring(f1,f2,100,50);
        r.run();



    }
}
