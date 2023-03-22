public class Lesson_2 {
    public static void main(String[] args) {
        towerOfHanoi();
    }

    // TOWER OF HANOI
    public static void towerOfHanoi() {
        System.out.println(moves(3, 'A', 'B', 'C'));
    }

    public static String moves(int n, char s, char e, char t) {
        if (n == 1) return "Transfer disk 1 from " + s + " to " + t;
        return moves(n - 1, s, t, e) + "\nTransfer disk " + n + " from " + s + " to " + t + "\n" 
                + moves(n - 1, e, s, t);
    }
}