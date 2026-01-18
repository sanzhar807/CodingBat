package string3;

public class string3 {
    public static void main(String[] args) {
        string3 obj = new string3();
    }

    public int countYZ(String str) {
        int count = 0;
        String s = str.concat(" ");
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isLetter(s.charAt(i)) && !Character.isLetter(s.charAt(i + 1))) {
                if (s.charAt(i) == 'y' || s.charAt(i) == 'z') count++;
                if (s.charAt(i) == 'Y' || s.charAt(i) == 'Z') count++;
            }
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        int i1 = base.length();
        int i2 = remove.length();
        String str1 = base.toLowerCase();
        String str2 = remove.toLowerCase();
        String res = "";
        for (int i = 0; i < i1; i++) {
            if (i <= i1 - i2) {
                String temp = str1.substring(i, i + i2);
                if (!temp.equals(str2))
                    res += base.substring(i, i + 1);
                else
                    i += i2 - 1;
            } else {
                String temp2 = str1.substring(i, i + 1);
                if (!temp2.equals(str2))
                    res += base.substring(i, i + 1);
            }
        }
        return res;
    }

    public boolean equalIsNot(String str) {
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') c1++;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't') c2++;
        }
        if (c1 % 2 == 0 && c2 % 2 == 0) return true;
        return false;
    }

    public boolean gHappy(String str) {
        boolean b = false;
        if (str.length() < 1) return true;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == 'g' && str.charAt(i - 1) == 'g') b = true;
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g') b = false;
        }
        return b;
    }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) count++;
        }
        return count;
    }

    public int sumDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return count;
    }

    public String sameEnds(String string) {
        int i = string.length() / 2;
        int j = 0;
        if (string.length() % 2 == 0) {
            j = string.length() / 2;
        } else {
            j = string.length() / 2;
            j++;
        }
        String res = "";
        while (i > 0) {
            if (string.substring(0, i).equals(string.substring(j))) {
                res = string.substring(0, i);
                break;
            }
            i--;
            j++;
        }
        return res;
    }

    public String mirrorEnds(String string) {
        int i = string.length() / 2;
        int j = 0;
        if (string.length() % 2 == 0) {
            j = string.length() / 2;
        } else {
            j = string.length() / 2;
            j++;
        }
        String res = "";
        StringBuilder str = new StringBuilder(string);
        str.reverse();
        if (string.equals(str.toString())) return string;
        while (i > 0 && j < string.length()) {
            String str1 = string.substring(j);
            str = new StringBuilder(str1);
            str.reverse();
            if (string.substring(0, i).equals(str.toString())) {
                res = string.substring(0, i);
                break;
            }
            i--;
            j++;
        }
        return res;
    }

    public int sumNumbers(String str) {
        int count = 0;
        int l = -1;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) && l == -1){
                l = i;
            }else if (l != -1 && !Character.isDigit(str.charAt(i))){
                count += Integer.parseInt(str.substring(l,i));
                l = -1;
            }
        }
        if (l != -1) {
            count += Integer.parseInt(str.substring(l));
        }
        return count;
    }

    public String notReplace(String str) {
        if (str.contains("is")){
            str.replace("is","is not");
        }
        return str;
    }

}
