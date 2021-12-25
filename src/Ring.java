import java.util.Random;


public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    public Ring(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run() {
        if (checkWeight()) {
            while (f1.weight > 0 && f2.weight > 0) {

                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }


                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                printScore();

            }

        }

    }

    public boolean checkWeight() {
        return (this.f1.weight < maxWeight && this.f1.weight > minWeight) && (this.f2.weight < maxWeight && this.f2.weight > minWeight
        );
    }


    public boolean isWin() {
        System.out.println("=========");
        if (f1.health == 0) {
            System.out.println("f2 kazandı");
            return true;
        } else if (f2.health == 0) {
            System.out.println("f1 maçı kazandı");
            return true;
        }
        return false;
    }

    boolean whoFirst(){
        Random ran = new Random();
        int x = ran.nextInt(2);
        if(x == f1.first){

            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("-----------------");
        System.out.println(this.f1.name + " Kalan can :" + this.f1.health);
        System.out.println(this.f2.name + " Kalan can :" + this.f2.health);


    }

}
