package check;

public class Main {
	
	private String firstName;
	private String lastName;
	
	public Main() {
		firstName = "大井";
		lastName = "直生";
	}
	
	private void printName() {
		System.out.println(firstName + lastName);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main m = new Main();
		m.printName(); 
		Pet p = new Pet( "java吉","hoge");
		p.introduce();
		System.out.println(p.getName());
		//p.introduce();
		//System.out.println(p);
		RobotPet r = new RobotPet( "R2D2", "ルーク");
		r.introduce();
		System.out.println(r.getName());
		

	}

}
 