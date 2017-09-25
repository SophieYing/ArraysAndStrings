//whitespace and case sensitive

//O n O n
    public static void main(String[] args) {
        FindBug b = new FindBug();
        String m = "H ghogo";
        String n = "l o tg h e                      ";
        System.out.println(b.palindromePermutation(m));
    }

    public boolean palindromePermutation(String m) {
        m = m.toLowerCase();
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < m.length(); i++) {
            char cur = m.charAt(i);
            if (cur != ' ') {
                if (!set.add(cur)) {
                    set.remove(cur);
                }
            }
        }
        if (set.size() == 1 || set.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

//O n O n
    public static void main(String[] args) {
        FindBug b = new FindBug();
        System.out.println(b.palindromePermutation2("abewibea"));

    }

    public boolean palindromePermutation2(String m) {
        int[] alpab = new int[26];
        int oddcount = 0;
        for (int i = 0; i < m.length(); i++) {
            char c = m.charAt(i);
            if (c != ' ') {
                int num = c - 'a';
                alpab[num]++;
                if (alpab[num] % 2 != 0) {
                    oddcount++;
                } else {
                    oddcount--;
                }
            }
        }
        return oddcount <= 1;
    }


//O n O 1
    public static void main(String[] args) {
        FindBug b = new FindBug();
        String m = "abpowbapo";
        m = m.toLowerCase();
        System.out.println(b.palindromePermutation2(m));
    }

    public boolean palindromePermutation3(String m) {
        int bitVector = strToBitInt(m);
        return bitVector == 0 || onlyOneHasNum(bitVector);
    }

    public int strToBitInt(String m) {
        int bitVector = 0;
        for (char c : m.toCharArray()) {
        	if(c!=' '){
            	bitVector = toggle(bitVector, (int) c);
            }
        }
        return bitVector;
    }

    public int toggle(int bitVector, int i) {
        if (i < 0) {
            return bitVector;
        }
        int num = 1 << i;
        if ((bitVector & num) == 0) {
            bitVector |= num;
        } else {
            bitVector &= (~num);
        }
        return bitVector;
    }

    public boolean onlyOneHasNum(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;

    }

