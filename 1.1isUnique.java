public class FindBug {

    public static void main(String[] args) {
        FindBug b = new FindBug();
        String m = "helogte";
        System.out.println(b.isUnique(m));
        System.out.println(b.isUnique2(m));
    }

    public boolean isUnique(String m) {
        char[] n = m.toCharArray();
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        for (int i = 0; i < n.length - 1; i++) {
            if ((((int) (n[i])) ^ ((int) (n[i + 1]))) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isUnique2(String m) {
        boolean[] alphabetic = new boolean[128];
        char[] n = m.toCharArray();
        for (int i = 0; i < n.length; i++) {
            if (alphabetic[(int) n[i]]) {
                return false;
            }
            alphabetic[(int) n[i]] = true;
        }
        return true;
    }

    public boolean isUnique3(String m) {
        int checker = 0;
        for (int i = 0; i < m.length(); i++) {
            int val = (m.charAt(i) - 'a');
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}