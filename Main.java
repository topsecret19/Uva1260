import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tests = sc.nextInt();
	while(tests-->0) {
		HashMap<Integer,Integer> sales = new HashMap<Integer,Integer>();
		int total=0;
		int days = sc.nextInt();
		for(int i=0; i<days; i++){
			int current = sc.nextInt();
			sales.put(i, current);
			for(int j=0; j<i; j++) {
				if(sales.get(j)==current||sales.get(j)<current) {
					total+=1;
				}
			}
		}
		System.out.println(total);
	}
}
}
