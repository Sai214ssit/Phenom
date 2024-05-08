public class Assignment {
        public static String toUpperCase(String str){
        String result="";
        for(int i=0,e=str.length();i < e; ++i){
             if(Character.isLowerCase(str.charAt(i)) && Character.isLetter(str.charAt(i))){
                 result+= (char) (str.charAt(i)-32);
             }
             else{
                 result+= (str.charAt(i));
             }
        }
        return result;
    }
public static boolean tc1() {
        String input="pRudHVI";
        String expected="PRUDHVI";
        String result = toUpperCase(input);
        return result.equals(expected);
    }
public static boolean tc2() {
    String input="SAi PrudhVI";
    String expected="SAI PRUDHVI";
    String result = toUpperCase(input);
    return result.equals(expected);
}
public static boolean tc3() {
    String input=null;
    String expected=null;
    String result = toUpperCase(input);
    return result.equals(expected);
}
public static boolean tc4() {
    String input="23234i34H98";
    String expected="23234I34H98";
    String result = toUpperCase(input);
    return result.equals(expected);
}
public static boolean tc5() {
    String input="Prudhvi@gmail.com";
    String expected="PRUDHVI@GMAIL.COM";
    String result = toUpperCase(input);
    return result.equals(expected);
}

    public static void main(String[] args) {

            System.out.println(tc1());
            System.out.println(tc2());
            System.out.println(tc3());
            System.out.println(tc4());
            System.out.println(tc5());
    }
}
