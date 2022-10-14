public class RTRunner {
    public static void main (String[]args){
    RightTriangle tri1 = new RightTriangle(3,4);
    RightTriangle tri2 = new RightTriangle(6.5,10.7);
    double hypo1 = tri1.hypo();
    double hypo2 = tri2.hypo();
    System.out.println(hypo1);
    System.out.println(hypo2);
}
}