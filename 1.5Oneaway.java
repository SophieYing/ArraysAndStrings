// O n O 1
public static void main(String[] args) {
        FindBug b = new FindBug();
        System.out.println(b.oneaway("ab", "cab"));

    }

    public boolean oneaway(String s1, String s2) {
        int s1L = s1.length();
        int s2L = s2.length();
        if (s1L == s2L) {
            return oneReplace(s1, s2);
        } else if (s2L - s1L == 1) {
            return oneEdit(s1, s2);
        } else if (s1L - s2L == 1) {
            return oneEdit(s2, s1);
        } else {
            return false;
        }
    }

    public boolean oneReplace(String s1, String s2) {
        boolean foundNEquil = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundNEquil) {
                    return false;
                }
                foundNEquil = true;
            }
        }
        return true;
    }

    public boolean oneEdit(String s1, String s2) {
        boolean foundNEquil = false;
        int index1 = 0, index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (foundNEquil) {
                    return false;
                }
                foundNEquil = true;
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

//O n(shorter length) O 1
    public boolean oneaway(String s1, String s2) {
        int s1L = s1.length();
        int s2L = s2.length();
        String first = (s1L < s2L) ? s1 : s2;
        String second = (s1L < s2L) ? s2 : s1;
        int index1 = 0, index2 = 0;
        boolean foundNEquil = false;
        while (index1 < first.length() && index2 < second.length()) {
            if (first.charAt(index1) != second.charAt(index2)) {
                if (foundNEquil) {
                    return false;
                }
                if (first.length() == second.length()) {
                    index1++;
                }
                foundNEquil = true;
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }