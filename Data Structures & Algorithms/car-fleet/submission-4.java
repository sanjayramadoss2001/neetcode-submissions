class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // Create the sorted array 
        int[] sortedArr = new int[target];
        // set all unused positions to -1
        for(int i = 0; i < target; i++){
            sortedArr[i] = -1;
        }
        for(int i = 0; i < position.length; i++){
            sortedArr[position[i]] = speed[i];
        }

        // walk through the sorted array and add new fleet everytime we see a worse arrival speed - as this car will now match this speed
        int fleetAmount = 0;
        float previousArrival = 0;
        for(int i = target-1; i >= 0; i--){
            int carSpeed = sortedArr[i];
            if(carSpeed == -1){
                continue;
            }
            float arrivalTime = (float)(target - i) / sortedArr[i];
            if (arrivalTime > previousArrival){
                fleetAmount++;
                previousArrival = arrivalTime;
            }
            
        }
        return fleetAmount;
    }
}
