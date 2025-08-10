class Solution {
    public boolean reorderedPowerOf2(int n) {

        int num = 1;
        String s = "" + n;
        char[] Char = s.toCharArray();  
        Arrays.sort(Char);                
        String newS = new String(Char); 
        while(num <= 1000000000){
            String str = "" + num;
            char[] chars = str.toCharArray();  
            Arrays.sort(chars);                
            String sortedStr = new String(chars); 
            if(newS.equals(sortedStr)) return true;
            num *= 2;
        }
        return false;
    }
}
        
