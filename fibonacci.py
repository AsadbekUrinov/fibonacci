# Fibonacci sonlarini hisoblash (iterativ usul)
def fibonacci(n):
    if n <= 0:
        return []
    elif n == 1:
        return [0]
    elif n == 2:
        return [0, 1]
    else:
        fib_sequence = [0, 1]
        for i in range(2, n):
            next_number = fib_sequence[i - 1] + fib_sequence[i - 2]
            fib_sequence.append(next_number)
        return fib_sequence

n = int(input("Fibonacci sonlari uchun tartib raqamini kiriting: "))
result = fibonacci(n)
print(result)
