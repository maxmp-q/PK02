package ha06.a1;

public class DotProductThread extends Thread {

    private int[] v1;
    private int[] v2;
    private int dot;

    public DotProductThread(int[] v1, int[] v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public void run() {
        if(v1.length == v2.length) {
            for(int i = 0; i < v1.length; i++) {
                this.dot += this.v1[i] * this.v2[i];
            }
        }
    }

    public int getDot() {
        return dot;
    }
}
