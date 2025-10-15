// Last updated: 16/10/2025, 04:24:12
/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let ans = 0;
    let hasBeenCalled = false;
    return function(...args){
        if(!hasBeenCalled){
            ans = fn(...args);
            hasBeenCalled = true;
            return ans;
        }
        else{
            return undefined;
        }
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
