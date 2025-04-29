public class LogicalOperator {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //logical and
        System.out.println((3>2) && (5>0)); // output = true
        System.out.println((3<2) && (4>1)); // output = false

        //logical or
        System.out.println((3>2) || (5>0)); // output = true
        System.out.println((3<2) || (4>1)); // output = true
        System.out.println((1>2) || (4<1)); // output = false

        //logical not
        System.out.println(!(5>0)); // output = false
    }
}
