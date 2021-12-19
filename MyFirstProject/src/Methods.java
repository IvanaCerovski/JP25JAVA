
public class Methods {
public static void main(String[] args) {
sayHelloTo("Ivana");
sayHelloWorld();

int x = returnFive();
System.out.println(x);

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
