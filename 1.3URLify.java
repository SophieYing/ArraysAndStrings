    public static void main(String[] args) {
        FindBug b = new FindBug();
        String m = "helogt";
        String n = "l o tg h e                      ";
        System.out.println(b.URLify(n.toCharArray(), 10));
    }

    public String URLify(char[] str, int trueLen) {
        int spaceCount = 0;
        for (int i = 0; i < trueLen; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        int index = trueLen + spaceCount * 2;
        for (int i = trueLen - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        return new String(str);
    }