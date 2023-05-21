// Fibonacci sonlarini hisoblash (iterativ usul)
function fibonacci(n) {
  if (n <= 0) {
    return [];
  } else if (n === 1) {
    return [0];
  } else if (n === 2) {
    return [0, 1];
  } else {
    var fibSequence = [0, 1];
    for (var i = 2; i < n; i++) {
      var nextNumber = fibSequence[i - 1] + fibSequence[i - 2];
      fibSequence.push(nextNumber);
    }
    return fibSequence;
  }
}

var n = parseInt(prompt("Fibonacci sonlari uchun tartib raqamini kiriting: "));
var result = fibonacci(n);
console.log(result);
