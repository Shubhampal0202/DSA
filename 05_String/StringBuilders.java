public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        char ch = sb.charAt(0);
        System.out.println(ch);
        sb.setCharAt(0, 'd');
        System.out.println(sb);
        sb.insert(2, 'y');
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.append('g');
        System.out.println(sb);

        int n = 100;
        // String s = "";
        StringBuffer sb2 = new StringBuffer();
        long start = System.currentTimeMillis();
        // for (int i = 0; i < n; i++) {
        // s += i;
        // }

        for (int i = 0; i < n; i++) {
            sb2.append(i);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}
