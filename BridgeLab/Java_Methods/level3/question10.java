package level3;

/*
 * Question 10: Collinear Points Check
 * Description: Checks if three points are collinear using slope and area of triangle methods.
 */
public class question10 {

    // Check using slope formula
    public static boolean areCollinearSlope(int x1,int y1,int x2,int y2,int x3,int y3){
        double slopeAB=(double)(y2-y1)/(x2-x1);
        double slopeBC=(double)(y3-y2)/(x3-x2);
        double slopeAC=(double)(y3-y1)/(x3-x1);
        return slopeAB==slopeBC && slopeAB==slopeAC;
    }

    // Check using area formula
    public static boolean areCollinearArea(int x1,int y1,int x2,int y2,int x3,int y3){
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area==0;
    }

    public static void main(String[] args){
        int x1=2,y1=4,x2=4,y2=6,x3=6,y3=8;
        System.out.println("Using Slope formula: "+areCollinearSlope(x1,y1,x2,y2,x3,y3));
        System.out.println("Using Area formula: "+areCollinearArea(x1,y1,x2,y2,x3,y3));
    }
}
