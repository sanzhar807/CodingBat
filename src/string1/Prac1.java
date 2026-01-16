package string1;

public class Prac1 {
    public static void main(String[] args) {
        System.out.println("1");
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        } else {
            return str.substring(str.length() - 2, str.length())
                    + str.substring(str.length() - 2, str.length()) +
                    str.substring(str.length() - 2, str.length());
        }
    }

    public String firstTwo(String str) {
        if (str.length()<2){
            return str;
        } else {
            return str.substring(0,2);
        }
    }

    public String firstHalf(String str) {
        int w1 = str.length() /2;
        return str.substring(0,w1);
    }

    public String withoutEnd(String str) {
        if (str.length()>2){
            return str.substring(1,str.length()-1);
        } else{
            return "";
        }
    }

    public String comboString(String a, String b) {
        if (a.length()>b.length()){
            return b+a+b;
        }
        return a+b+a;
    }

    public String nonStart(String a, String b) {
        String c = a + b;
        if (c.length()>1){
            return a.substring(1) + b.substring(1);
        }else {
            return a.substring(1) + b.substring(1);
        }
    }

    public String left2(String str) {
        if (str.length()>2){
            String word = str.substring(0,2);
            return str.substring(2)+word;
        }
        return str;
    }

    public String right2(String str) {
        if (str.length()>2){
            return str.substring(str.length()-2)+str.substring(0,str.length()-2);
        }return str;
    }

    public String theEnd(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        } else {
            return str.substring(str.length()-1,str.length());
        }
    }

    public String withouEnd2(String str) {
        if (str.length()<2){
            return "";
        }
        return str.substring(1,str.length()-1);
    }

    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }

    public boolean endsLy(String str) {
        if (str.endsWith("ly")){
            return true;
        }else {
            return false;
        }
    }

    public String nTwice(String str, int n) {
        return str.substring(0,n)+ str.substring(str.length()-n);
    }

    public String twoChar(String str, int index) {
        if (index+2>str.length() || index<0){
            return str.substring (0,2);
        }else {
            return str.substring (index,index+2);
        }
    }

    public String middleThree(String str) {
        int n = str.length();
        if (str.length()<4) {
            return str;
        }else{
            int mid = str.length() / 2;
            return str.substring(mid - 1, mid + 2);
        }
    }

    public boolean hasBad(String str) {
        if (str.length()<3){
            return false;
        } else {
            String w = str.substring(1);
            if (str.startsWith("b") && str.contains("bad")){
                return true;
            } else if (w.startsWith("b") && str.contains("bad")){
                return true;
            }
            return false;
        }
    }

    public String atFirst(String str) {
        if (str.length() == 0) return "@@";
        if (str.length()<2){
            return str.concat("@");
        } return str.substring(0,2);
    }

    public String conCat(String a, String b) {
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }

        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, str.length() - 2) +
                str.charAt(str.length() - 1) +
                str.charAt(str.length() - 2);
    }

    public String seeColor(String str) {
        if (str.startsWith("red")){
            return "red";
        }if (str.startsWith("blue")){
            return "blue";
        }else {
            return "";
        }
    }

    public boolean frontAgain(String str) {
        if (str.length()== 2){
            return true;
        }else if (str.length()<2){
            return false;
        }
        if (str.substring(0,2).equals(str.substring(str.length()-2))){
            return true;
        }
        return false;
    }

    public String minCat(String a, String b) {
        if (a.length() == b.length())
            return a+b;
        if (a.length() > b.length()){
            int diff = a.length() - b.length();
            return a.substring(diff, a.length()) + b;

        } else {
            int diff = b.length() - a.length();
            return a + b.substring(diff, b.length());
        }
    }

    public String extraFront(String str) {
        if (str.length()>2){
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }else {
            return str+str+str;
        }
    }

    public String without2(String str) {
        if(str.length() ==1) return str;
        if (str.length()<=2) return "";
        if (str.substring(0,2).equals(str.substring(str.length()-2))){
            return str.substring(2);
        }
        return str;
    }

    public String deFront(String str) {
        String w = str.substring(2);
        if (str.substring(0,2).equals("ab")) return str;
        else if (str.substring(0,1).equals("a")){
            return str.substring(0,1)+w;
        }else if (str.substring(1,2).equals("b")) return str.substring(1);
        return w;
    }

    public String startWord(String str, String word) {
        if (str.length() <=1 && word.length()!=1){
            return "";
        } else if (str.length() <=1 && word.length()==1){
            return str;}
        int i = word.length();
        String w = str.substring(0,i);
        String s1 = str.substring(1);
        String w1 = word.substring(1);
        if (w.equals(word)){ return word;
        }else if (s1.substring(0,w1.length()).equals(w1)) {return str.substring(0,i);
        } else {return "";}
    }

    public String withoutX(String str) {
        if (str.length()<=1) return "";
        if (str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x")){
            return str.substring(1,str.length()-1);
        }else if (str.startsWith("x")){
            return str.substring(1);
        } else if (str.substring(str.length()-1).equals("x")) return str.substring(0,
                str.length()-1);
        return str;
    }
}
