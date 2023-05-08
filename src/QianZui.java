public class QianZui {
    public static void main(String[] args) {
        QianZui h = new QianZui();
        String[] strs = {"", "", ""};
        System.out.println(h.longgestCommonPrefix(strs));

    }

    public String longgestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        int f = strs[0].length();
        for (int i = 0; i < f; i++) {

            char h = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != h) {
                    return strs[0].substring(0, i);

                }

            }

        }return strs[0];
    }

}
