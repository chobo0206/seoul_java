class PetHotel {
	String name;
	Dog[] array;
	// here
	PetHotel(String name, Dog[] array) {
		this.name = name;
		this.array = array;
	}
	void printInfo() {
		System.out.print(name);
		int size = array.length;
		for(Dog dog : array){
			System.out.print(dog.name + " ");
		}
		/*
		for(int i = 0; i < size; i++) {
			System.out.println(array[i].name);
		}
		*/
		System.out.println();
		
	}
}
class Dog {
	String name;
	// here
	Dog(String name) {
		this.name = name;
	}
}
public class Seoul {
	public static void main(String[] args) {
		Dog dog1 = new Dog("아치");
		Dog dog2 = new Dog("똥이");
		Dog dog3 = new Dog("캡틴");
		Dog dog4 = new Dog("똘망이");
		Dog dog5 = new Dog("사랑이");
		// here
		// Dog[] array1 = {dog1, dog2, dog3};
		// Dog[] array2 = {dog4, dog5};
		PetHotel hotel1 = new PetHotel("서울펫호텔",new Dog[]{dog1, dog2, dog3});
		hotel1.printInfo();
		PetHotel hotel2 = new PetHotel("부산펫호텔",new Dog[]{dog4, dog5});
		hotel2.printInfo();
	}
}