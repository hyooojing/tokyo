package ch4;

public class PersonMain {

	public static void main(String[] args) {
		
		Person[] person = new Person[5];
		for (int i = 0; i < 5; i ++) {
			person[i] = new Person();
		}
		
		person[0].setName("권소령");
		person[0].setAge(25);
		person[1].setName("김세영");
		person[1].setAge(27);
		person[2].setName("장선호");
		person[2].setAge(28);
		person[3].setName("이채연");
		person[3].setAge(26);
		person[4].setName("전수현");
		person[4].setAge(26);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("이름: " + person[i].getName() + ", 나이: " + person[i].getAge());
		}

	}

}
