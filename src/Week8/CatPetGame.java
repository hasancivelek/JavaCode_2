package Week8;

public class CatPetGame {

	private int moodOfCat = 0;
	private int hunger = 10;
	private int sleep = 0;

	void feed() {
		hunger--;
		sleep++;
		moodOfCat++;
	}

	void ignore() {
		moodOfCat--;
		sleep--;
		hunger++;
	}

	void play() {
		hunger++;
		sleep++;
		moodOfCat++;
	}

	void info() {
		System.out.println("Mood: " + moodOfCat);
		System.out.println("Hunger: " + hunger);
		System.out.println("Sleep: " + sleep);
	}
	 void info(int a){
			System.out.println("Mood : " + moodOfCat);
			System.out.println("Hunger : " + hunger);
			System.out.println("Sleep : " + sleep);
		}

}
