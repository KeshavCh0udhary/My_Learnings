class arr {
    constructor() {
        this.length = 0;
        this.arr = [];

    }
    push(...arr1) {
        arr1.forEach((el) => {
            this.arr[this.length] = el;
            this.length++
        })

    }
    pop() {
        delete (this.arr[this.length - 1])
        this.arr.length--
        this.length--
    }
}
// 
Array.prototype.myReduce = function (func) {
    let ac = 0;
    //let res;
    for (let i = 0; i < this.length; i++) {
        let ele = this[i];

        // console.log(ac);
        x = func(ac, ele);
        ac = x;
        // console.log(x);
        res = x;
    }
    return x;
};
Array.prototype.myforEach = function (func) {
    let narr = [];
    // let a=this
    for (let i = 0; i < this.length; i++) {
        let ele = this[i];
        let x = func(ele);
        //  console.log(x)
        if (x) {
            narr.push(this[i]);
        }
    }
    return narr;
};
Array.prototype.mymap = function (func) {
    let narr = [];
    let a = this;
    for (let i = 0; i < a.length; i++) {
        let ele = a[i];
        let x = func(ele);
        narr.push(x);
    }
    return narr;
};
let arr3 = [1, 2, 3];
let y = arr3.mymap(function (el) {
    return el + 1;
});
Array.prototype.myReduce = function (func) {
    let ac = 0;
    //let res;
    for (let i = 0; i < this.length; i++) {
        let ele = this[i];

        // console.log(ac);
        x = func(ac, ele);
        ac = x;
        // console.log(x);
        res = x;
    }
    return x;
};

let s1 = new constructor(2)
let arr1 = [2, 2, , 5, 4, 6, 7, 9, 12];
let z = arr1.myforEach(function (el) {
    return el
});

console.log(s1);