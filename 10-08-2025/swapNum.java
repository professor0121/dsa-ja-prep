void swapNum(int a, int b) {
    System.out.println("before swapping");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("after swapping");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
}

void main() {
    swapNum(3, 6);
}