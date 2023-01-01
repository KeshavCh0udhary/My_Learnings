function Student(n) {
    this.name = n;
    this.batch = "Web-19";
}
let s1 = new Student("Keshav");

Student.prototype.sayName = function () {
    console.log(this);
}

class student {
    constructor(n) {
        this.name = n;
        this.batch = "Web-19";
    }
}

let S11 = new student("S11");
console.log(S11);

s1.sayName();

class Stack {
    constructor() {
        this.length = 0;
        this.stack = [];
    }

    push(...arr) {
        arr.forEach((el) => {
            let i = this.length;
            this.stack[i] = el;
            this.length++;
        });
    }

    remove() {
        let i = this.length - 1;
        delete this.stack[i];
        this.stack.length--;
        this.length--;
    }

    peek() {
        return this.stack[this.length - 1];
    }

    isEmpty() {
        //condition        //if  //else
        let value = this.length === 0 ? true : false;
        return value;
    }
}


let S1 = new Stack();

S1.push(1, 3, 5, 6, 7, 89, 8, 10);
S1.remove();
console.log(S1.isEmpty());
console.log(S1.peek());
console.log(S1);


