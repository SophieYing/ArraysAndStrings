//case sensitive, whitespace!!!


//O n, O c
    public boolean checkpermutaion(String s1, String s2) {
        int[] alphabetic = new int[128];
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            alphabetic[s1.charAt(i)]++;
            alphabetic[s2.charAt(i)]--;
        }
        for (int i = 0; i < 128; i++) {
            if (alphabetic[i] != 0) {
                return false;
            }
        }
        return true;
    }

//O nlgn, O 1
    public boolean checkpermutaion2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (sortString(s1).equals(sortString(s2))) {
            return true;
        } else {
            return false;
        }
    }

    public String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}