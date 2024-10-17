var twoSum = function (nums, target) {
  for (let i = 0; i < nums.length - 1; i++) {
    const map = new Map();
    for(let i = 0; i < nums.length; i++) {
        let needed = target - nums[i];
        let = indexOfNeeded = map.get(needed);
        if(indexOfNeeded >= 0){
            return [i, indexOfNeeded];
        }
        map.set(nums[i], i);
    }
  }
};
