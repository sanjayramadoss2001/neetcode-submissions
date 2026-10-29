class Solution {
    public int badSensor(int[] sensor1, int[] sensor2) {
        int i=0, j=0;
        while(i<sensor1.length -1 && j < sensor2.length) {
            if(sensor1[i] == sensor2[j]) {
                i++;
                j++;
            } else if(sensor1[i] != sensor2[j]) {
                if(sensor1[i+1] == sensor2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        int res = -1;
            if (j>i) {
                res = 1;
            } else if (i>j) {
                res = 2;
            }
            return res;
    }
}
