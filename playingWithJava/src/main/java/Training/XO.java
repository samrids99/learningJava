package Training;

public class XO {
    public static boolean getXO (String str) {

        // Good Luck!!
        String lowerString = str.toLowerCase();
        int xCount = 0;
        int oCount = 0;

        for(int i = 0; i < lowerString.length(); i++){
            if(lowerString.charAt(i) == 'x'){
                xCount++;
            } else if(lowerString.charAt(i) == 'o'){
                oCount++;
            }
        }
        return xCount == oCount;
    }

    public static void main(String[] args) {
        boolean xOrO = getXO("xxooXgjOOOxO");
        System.out.println(xOrO);
    }
}
