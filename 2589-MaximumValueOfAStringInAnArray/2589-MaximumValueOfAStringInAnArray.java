// Last updated: 8/6/2025, 6:59:27 PM
class Solution {
    public int maximumValue(String[] strs) {
        return value(strs);
    }

    public static boolean isInteger(String n){
        return n.matches("^[+-]?\\d+$");
    }

    public static int value(String[] arr){
        int[] arr1 = new int[arr.length];
        int i = 0;
        int _max = 0;
        for(String item : arr){
            if(isInteger(item)){
                
                _max = Math.max(_max,Integer.parseInt(item));

            }
            else{
                _max = Math.max(_max,item.length());

            }
        }
        return _max;


    }
}