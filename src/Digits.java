import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits (int num) {
        if (num < 0) {
            throw new IllegalArgumentException("The number passed to the constructor (" + num + ") cannot be negative!");
        }
        digitList = new ArrayList<>();
        String str = num + "";
        for (int i = 0; i < str.length(); i++) {
            int single = Integer.parseInt(str.substring(i, i+1));
            digitList.add(single);
        }
    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size()-1; i++) {
            int val = digitList.get(i);
            if (digitList.get(i+1) <= val) {
                return false;
            }
        }
        return true;
    }
}
