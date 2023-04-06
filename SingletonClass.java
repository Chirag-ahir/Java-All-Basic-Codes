package A1_Interview;

public class SingletonClass {

	private static SingletonClass get_instance;

	private SingletonClass() {
	}

	public static SingletonClass getName() {
		if (get_instance == null)
			get_instance = new SingletonClass();
		return get_instance;
	}

	public static void main(String[] args) {
		SingletonClass x = SingletonClass.getName();
		SingletonClass y = SingletonClass.getName();
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
	}

}
