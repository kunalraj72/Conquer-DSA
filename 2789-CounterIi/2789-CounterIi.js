// Last updated: 16/10/2025, 04:24:14
/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */

//Best Solution
var createCounter = function(init) {
    let temp = init;
        const increment = () => ++init;
        const decrement = () => --init;
        const reset     = () => init = temp;
    //returning an object;
    return {increment,decrement,reset};
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */