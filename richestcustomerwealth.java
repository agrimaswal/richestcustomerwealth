class Solution {
    public int maximumWealth(int[][] accounts) {
        int richestWealth = 0;
        
        for (int[] customerAccounts : accounts) {
            int wealth = 0;
            for (int account : customerAccounts) {
                wealth += account;
            }
            richestWealth = Math.max(richestWealth, wealth);
        }
        
        return richestWealth;
    }
}
