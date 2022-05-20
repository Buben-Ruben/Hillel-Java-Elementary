package HW14;

import java.util.HashSet;

public class HappyNum {

    private int toSquare(int num) {
        int square = 0;
        while (num > 0)
        {
            int digit = num % 10;
            square += digit * digit;
            num = num / 10;
        }
        return square;
    }

    public boolean isHappy(int num)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        s.add(num);

        while (true)
        {
            if (num == 1) return true;
            num = toSquare(num);
            if ((s.contains(num) && num != (int)s.toArray()[ s.size()-1 ] )) return false;
            s.add(num);
        }
    }
}
