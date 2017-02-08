
package roulettegame;

/**
 *
 * @author zacharybechhoefer
 */
public class RouletteGame {

    public static void main(String[] args) {
        RouletteTable table1 = new RouletteTable(8);
        table1.RouletteSpin();
        System.out.println("First spin: " + table1.getPos());
        table1.TestRun();
    }
    
}
