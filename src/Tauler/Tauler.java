package Tauler;

/**
 *
 * @author marij
 */
public class Tauler {
    private final int SIZE;
    private final int [][] MAT;
    
    public Tauler(int size){
        SIZE = size;
        MAT = new int[SIZE][SIZE];
    }
    
    public int[][] getMatrix(){
        return MAT;
    }
    public int getSize(){
        return SIZE;
    }
}
