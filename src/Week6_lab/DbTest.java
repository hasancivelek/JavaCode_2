package Week6_lab;
//repl it lab question 1
public class DbTest {

	public static void main(String[] args) {

		Db db = new Db();
		//db.insertData("hhh", 345);

		//System.out.println(db.getData());// aaa
		//System.out.println(db.getYint());// 123

		db.setData("zzz");
		db.setYint(200);

		System.out.println(db.getData());// zzz
		System.out.println(db.getYint());// 200
		
		db.setData("hasan");
	db.setYint(43);
	System.out.println(db.getData());
	System.out.println(db.getYint());

	}

}
