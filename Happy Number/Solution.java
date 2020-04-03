class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        Solution s = new Solution();
        int val = 0;
        
        //set.add(n);
        
        while(!set.contains(n)) {
            set.add(n);
            val = 0;
            int length = s.findLength(n);
            while(length > 0) {
            	int placeholder = (int) (n/Math.pow(10, length - 1)); 
                val += Math.pow(placeholder, 2);
                n = (int) (n - Math.pow(10, length - 1)*placeholder);
                length--;
            }
            if(val == 1) {
                return true;
            } 
            n = val;
        }
        return false;
    }
    
    public int findLength(int num) {
        return (int) (Math.log10(num) + 1);
    }

}