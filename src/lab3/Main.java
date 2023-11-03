package lab3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		problema1();
		problema2();
		problema3();
		problema4();
	}
	
	static void problema1() {
		
		String[] a = {"java", "test", "university"};
		String[] b = {"car", "university", "plane"};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i].equals(b[j])) {
					System.out.println(a[i] + " ");
				}
			}
		}
	}
	
	static void problema2() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Cate numere doriti?");
		int n=scanner.nextInt();
		int i;
		boolean prim;
		int arr[] = new int[n];
		
		System.out.println("Introduceti cele "+n+ " numere");
		for(i=0; i<n; i++) {
			arr[i]=scanner.nextInt();
		}
		
		for(i=0; i<n; i++) {
			prim = true;
			for(int j=2; j<arr[i];j++) {
				if(arr[i]%j==0) {
					prim = false;
					break;
				}
			}
			if(prim) 
				System.out.println(arr[i]);
		}
	}
	
	static void problema3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("N=");
		int N=scanner.nextInt();
		int f1=0,f2=1,fn=0;
		
		System.out.print(f1 + " " + f2 + " ");
		while(fn<N) {
			fn=f1+f2;
			f1=f2;
			f2=fn;
			if(fn<N)
				System.out.print(fn + " ");
		}
	}

	static void problema4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti cuvantul");
		String cuvant = scanner.nextLine();
		boolean palindrom = true;
		int n=cuvant.length();
		
		for(int i=0; i<cuvant.length()/2; i++) {
			Character p=cuvant.charAt(i);
			Character u=cuvant.charAt(n-i-1);
			if(!(p.equals(u))) {
				palindrom=false;
				break;
			}
		}
		if(palindrom) System.out.println("Cuvantul este palindrom");
		else System.out.println("Cuvantul nu este palindrom");
	}
}
