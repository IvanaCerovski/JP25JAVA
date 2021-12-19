
public class Methods {
public static void main(String[] args) {
sayHelloTo("Ivana");
sayHelloWorld();

int x = returnFive();
System.out.println(x);

int result = square(returnFive());
System.out.println(result);


}

static int square(int x) {
	return x * x;
}

static void sayHelloTo(String name) {
	System.out.println("Hello, " + name);
}

static int returnFive() {
	return 5;
}

static void sayHelloWorld() {
	System.out.println("Hello, world!");
}
}
