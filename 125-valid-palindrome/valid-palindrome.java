class Solution {
    public boolean isPalindrome(String s) {

        String ne = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                ne += s.charAt(i);
            }
        }

        ne = ne.toLowerCase();

        int i = 0;
        int j = ne.length() - 1;

        while (i < j) {

            if (ne.charAt(i) != ne.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}