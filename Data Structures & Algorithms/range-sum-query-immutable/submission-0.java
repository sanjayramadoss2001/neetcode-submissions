class NumArray {
	List<Integer> list;
	public NumArray(int[] nums){    
		list = new ArrayList<>();
        int total = 0;
	    for(int n: nums) {
			list.add(total+=n);
	    }
    }
	public int sumRange(int left, int right){
	    int preLeft = (left == 0) ? 0 : list.get(left-1);
        return (list.get(right) - preLeft);
    }
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */