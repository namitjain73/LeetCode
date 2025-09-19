// Last updated: 9/19/2025, 3:55:12 PM
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
        boolean s1b = true;
        String s2 = "";
        boolean s2b = true;
        int i = 0;
        while(i < formula.length()){
            char ch = formula.charAt(i);
            if(ch == '+') break;
            else if(ch != '='){
                if(!((ch-'0') >= 0 && (ch-'0') <= 9)) s1b = false;
                s1 += Character.toString(ch);
            }
            i++;
        }
        i++;
        while(i < formula.length()){
            char ch = formula.charAt(i);
            s2 += Character.toString(ch);
            if(!((ch-'0') >= 0 && (ch-'0') <= 9)) s2b = false;
            i++;
        }

        int sum = 0;

        if(s1b) sum += Integer.parseInt(s1);
        else{
            char ch = s1.charAt(0);
            int n = Integer.parseInt(s1.substring(1));
            sum += arr[n-1][ch-'A'];
        }
        if(s2b) sum += Integer.parseInt(s2);
        else{
            char ch = s2.charAt(0);
            int n = Integer.parseInt(s2.substring(1));
            sum += arr[n-1][ch-'A'];
        }
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