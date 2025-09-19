// Last updated: 9/19/2025, 3:52:25 PM
class Spreadsheet {
int[][] arr;
    public Spreadsheet(int rows) {
        arr = new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        char ch = cell.charAt(0);
        int n = Integer.parseInt(cell.substring(1));
        arr[n-1][ch-'A'] = value;
    }
    
    public void resetCell(String cell) {
        char ch = cell.charAt(0);
        int n = Integer.parseInt(cell.substring(1));
        arr[n-1][ch-'A'] = 0;
    }
    
    public int getValue(String formula) {
        String s1 = "";
        String s2 = "";
        int i = 0;
        while(i < formula.length()){
            char ch = formula.charAt(i);
            if(ch == '+') break;
            else if(ch != '='){
                s1 += Character.toString(ch);
            }
            i++;
        }
        i++;
        while(i < formula.length()){
            char ch = formula.charAt(i);
            s2 += Character.toString(ch);
            i++;
        }

        int sum = 0;

        if(Character.isDigit(s1.charAt(0))) sum += Integer.parseInt(s1);
        else{
            char ch = s1.charAt(0);
            int n = Integer.parseInt(s1.substring(1));
            sum += arr[n-1][ch-'A'];
        }
        if(Character.isDigit(s2.charAt(0))) sum += Integer.parseInt(s2);
        else{
            char ch = s2.charAt(0);
            int n = Integer.parseInt(s2.substring(1));
            sum += arr[n-1][ch-'A'];
        }
        System.out.println(s1 + " " + s2);
        return sum;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */