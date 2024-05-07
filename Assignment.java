class Assignment {
    public static void main(String[] args) {
        String str="Prudhvi";
        String result="";
        for(int i=0,e=str.length();i < e; ++i){
             if(Character.isLowerCase(str.charAt(i)) && Character.isLetter(str.charAt(i))){
                 result+= (char) (str.charAt(i)-32);
             }
             else{
                 result+= (char)(str.charAt(i));
             }
        }
       System.out.println(result);
    }
}