public class printLCS {
    
    public static String print(String a,String b,int n,int m){
        int[][] t = new int[n + 1][m + 1];

        // Initialize the matrix
        for (int i = 0; i <= n; i++) {
            t[i][0] = 0;
        }
        for (int j = 0; j <= m; j++) {
            t[0][j] = 0;
        }

        // Fill the matrix according to LCS logic
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        // Build the LCS string
        StringBuilder sb = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                sb.append(a.charAt(i - 1));
                i--;
                j--;
            } else {
                if (t[i][j - 1] > t[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }

        // Since we built the LCS from the end, reverse it before returning
        return sb.reverse().toString();
    }
       
    

    public static void main(String[] args) {
        String a="acbcf";
        String b="abcdaf";
        int n=a.length();
        int m=b.length();
        System.out.println(print(a, b, n, m));
    }
}
