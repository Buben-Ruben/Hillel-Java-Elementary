package HW12;

public class JewelsAndStones {

    public int numberOfJewels(String jewels, String stones) {
        int num = 0;
        for(int i = 0; i < stones.length(); i++){
            for(int j = 0; j < jewels.length(); j++){
                if(stones.charAt(i) == jewels.charAt(j)) num++;
            }
        }
        return num;
    }
}
