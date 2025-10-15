// Last updated: 16/10/2025, 04:24:17
/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var ans = [];
    for(let i=0;i<arr.length;i++){
        ans.push(fn(arr[i],i));
    }
    return ans;
};