// https://www.linkedin.com/in/surikunal28/

public class questions {
    // 2011 ====================================
    public int finalValueAfterOperations(String[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            if ( str.equals("X++") || str.equals("++X") ) {
                ans++;
            } else {
                ans--;
            }
        }
        return ans;
    }

    // 1108 ====================================
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if ( ch == '.' ) {
                ans.append("[.]");
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    // 1528 ======================================================
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[ s.length() ];
        for (int i = 0; i < indices.length; i++) {
            char c = s.charAt(i);
            int idx = indices[i];
            
            ans[idx] = c;
        }
        return new String(ans);
    }

    // 1929 ========================================================
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[ 2 * nums.length ];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }
        return ans;
    }
}
