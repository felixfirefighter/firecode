// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int fib(int n) {
  if(n < 2) return n;
  return fib(n - 2) + fib(n - 1);
}