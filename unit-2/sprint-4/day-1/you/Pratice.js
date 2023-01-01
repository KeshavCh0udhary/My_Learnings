// let arr = [2, 4, 6, 3, 7, 1, 4, 3, 2, 5, 2, 4, 6, 3, 7, 1, 4, 3, 2, 5];

// let K = 5;
// let flag;
// let X = 5;
// let temp = X;
// let count = 0;
// let count1=0;
// for (let i = 0; i < temp; i++) {
//    count1++;
//    flag = false;
//    if (i === N - X) {
//       break;
//    }
//    if (arr[i] > K) {
//       temp = count1 + X
//      // console.log(arr[i], temp)
//    }
//    else if (arr[i] <= K) {
//       flag = true;
//      // console.log(arr[i])
//    }

// }
// if (flag === true) {
//    count = 1;
// }
// console.log(temp)
// if (count === 1) {
//    for (let i = temp; i < N; i++) {
//       if (arr[i] > K) {
//          i = i + X
//       }
//       if(X===1){
//          if (arr[i] <= K) {
//             count++;
//          }
//       }
//       else if (arr[i - X] <= K && arr[i] <= K) {
//          count++;
//       }

//       // console.log(arr[i - X], arr[i]);
//    }
// }


// // else{
// //    for (let i = X; i < N; i++) {
// //       if(arr[i]>K){
// //          i=i+K
// //       }
// //       if (arr[i - X] <= K && arr[i] <= K) {
// //          count++;
// //       }
// //       // console.log(arr[i - X], arr[i]);
// //    }
// // }


// console.log(count);



// Two Pointer technique


// What is two Pointer technique?

//Question- Given an Array find the highest sum of two element of an array.

// let Arr = [1, 4, 7, 9, 2, 4, 5, 8, 10, 12, 29, 12, 11];
// let N = Arr.length;

// Arr.sort(function (a, b) {
//    return a - b;
// });

//  //console.log(Arr);

// let max = -Infinity;
// let copy;
// let sum = 0;



// let left = 0;
// let right = N - 1;

// while (left < right) {
//    sum = Arr[left] + Arr[right];
//    if (sum > max) {
//       max = sum;
//       copy = (Arr[left] + " " + Arr[right]);
//    }
//    if (Arr[left] < Arr[right]) {
//       left++;
//    }
//    else if (Arr[left] > Arr[right]) {
//       right--;
//    }
// }
//  console.log(copy, sum);







