import java.lang.reflect.*;

public class ReflectionTest {

	public void firstMoveChoice() {
		System.out.println("First Move");
	}

	public void secondMoveChoice() {
		System.out.println("Second Move");
	}

	public void thirdMoveChoice() {
		System.out.println("Third Move");
	}

	public static void main(String[] args)
		throws IllegalAccessException,
			   IllegalArgumentException,
			   InvocationTargetException {
		ReflectionTest rt = new ReflectionTest();
		Method[] method = rt.getClass().getMethods();

		System.out.println("Number of methods: " + method.length);
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i].getName());
		}
		System.out.println("=========================");

		method[1].invoke(rt, (Object[])args);
		method[2].invoke(rt, (Object[])args);
		method[3].invoke(rt, (Object[])args);
	}
}
