// class queu {
//     constructor() {
//         this.length = 0;
//         this.queu = [];

//     }
//     push(...arr1) {
//         arr1.forEach((el) => {
//             this.queu[this.length] = el;
//             this.length++
//         })

//     }

//     hta() {
//         let newarr = []
//         this.queu[0] == 1
//         console.log(this.queu[0])
//         this.queu.splice(0, 1)

//         console.log(newarr)
//         this.queu.length--
//         for (let i = 0; i < 2; i++) {
//             this.queu[i] = this.queu[i + 1]
//         }
//         this.queu.length--

//     }
//     dequeuThree() {
//         if (this.queu.length == 2) {
//             this.queu.shift();
//             this.queu.shift();
//             this.length = this.length - 2;
//             return this.queu = [];
//         }
//         else if (this.queu.length == 1) {
//             this.queu.shift();
//             this.length = this.length - 1;
//             return this.queu = [];

//         }
//         else if (this.queu.length == 0) {
//             console.log("error");
//             this.length = 0;
//             return this.queu = "error";

//         }
//         else {
//             this.queu.shift();
//             this.queu.shift();
//             this.queu.shift();
//             this.length = this.length - 3;
//         }



//     }
// }



// let s1 = new queu();
// s1.push(10, 20, 30)
// console.log(s1)
// console.log(s1, arr1)
// s1.dequeuThree(10, 20, 30)
// console.log(s1);



class assign {
    constructor() {
        this.length = 0
        this.stack = []
    }
    enqueue(...arr) {
        arr.forEach((el) => {
            let i = this.length
            this.stack[i] = el
            this.length++
        })
    }

    // dequeue(){
    //     let i=0
    //     this.stack.splice(0,3)
    //     // delete this.stack[i];
    //     // delete this.stack[i];
    //     // i--
    //     // this.stack.length--;
    //     this.length--;


    deQueue() {
        let a = [];
        let bag = "";
        let start = 1;
        let end = this.stack.length;
        //   if(m==undefined){
        //     m=this.stack.length;
        //   }
        if (this.stack.length < 3 && this.stack.length != 0) {
            return []
        } else if (this.stack.length == 0) {
            return "error"
        }

        for (let i = start; i < end; i++) {
            bag = bag + this.stack[i];
            a.push(this.stack[i]);
        }
        return a
    }
    deQueueThree() {
        let a = [];
        let bag = "";
        let start = 3;
        let end = this.stack.length;
        //   if(m==undefined){
        //     m=this.stack.length;
        //   }
        if (this.stack.length < 3 && this.stack.length != 0) {
            return []
        } else if (this.stack.length == 0) {
            return "error"
        }

        for (let i = start; i < end; i++) {
            bag = bag + this.stack[i];
            a.push(this.stack[i]);
        }
        return a
    }
    enqueueThree(...arr1) {

        arr1.forEach((el) => {
            let i = this.stack.length
            this.stack[i] = el
            this.length++
        })
    }
}


// myslice(2,);



let s1 = new assign()
s1.enqueue(2, 3, 4, 5)
// console.log(s1)
let t = s1.deQueue()
// s1.dequeue()
// console.log(t)
let s = s1.deQueueThree()
// console.log(s)
// let s2=new assign()
s1.enqueueThree(1, 2, 3)
console.log(s1)


