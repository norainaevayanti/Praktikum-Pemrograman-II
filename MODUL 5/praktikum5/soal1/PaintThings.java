package praktikum5.soal1;
import java.text.DecimalFormat;
public class PaintThings {
	public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck = new Rectangle(20.0, 30.0);
        Sphere bigBall = new Sphere(15.0);
        Cylinder tank = new Cylinder(10.0, 30.0);
        double deckAmt, ballAmt, tankAmt;

        // Compute the amount of paint needed for each shape
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        // Print the amount of paint for each.
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("Number of liters of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}