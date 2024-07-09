package Training;

public class Loops {
    //demonstrating the different varieties of loops we see in java
    // while:
    public static void main(String[] args) {
        int wishes = 3;
        while (wishes > 0){
            System.out.println("You have used a wish!");
            System.out.println("Don't worry you still have " + wishes + " left!");
            wishes --;
        }
    }

}
