public class PickRandomCode {

    public static void main(String[] args) {
        System.out.println(String.format("%1$4s", Integer.toBinaryString((int) Math.pow(2, 2))).replace(' ','0'));
    }
}
