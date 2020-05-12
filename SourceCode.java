import java.util.*;
public class Solutions {
	public static int mexican(int n, int k, int t) {
		if (t<=k) {
			return t;
		} else if (t>n) {
			return Math.max((k-t+n),0);
		} else {
			return k;
		}
	}

	public static void runMexican() {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String[] s2 = s1.split(" ");
		int n,k,t;
		n = Integer.parseInt(s2[0]);
		k = Integer.parseInt(s2[1]);
		t = Integer.parseInt(s2[2]);
		System.out.println(mexican(n,k,t));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input \"1\" to run the program");
		if (Integer.parseInt(s.nextLine())==1) {
			runMexican();
		}
	}

}