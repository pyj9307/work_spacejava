package ch12_collection_1024;

public class Animal implements Comparable<Member>{

	private int animalId;        //회원 아이디
	private String animalName;   //회원 이름

	public Animal(int animalId, String animalName){ //생성자
		this.animalId = animalId;
		this.animalName = animalName;
	}
	
	public int getAnimalId() {  //
		return animalId;
	}
	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	@Override
	public String toString(){   //toString 메소드 오버로딩
		return animalName + " anumal의 아이디는 " + animalId + "입니다";
	}

	@Override
	public int hashCode() {
		return animalId;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Animal){
			Animal animal = (Animal)obj;
			if( this.animalId == animal.animalId )
				return true;
			else 
				return false;
		}
		return false;
	}

	public int compareTo(Animal animal) {
		
		return (this.animalId - animal.animalId);   //오름차순
		//return (this.animalId - animal.animalId) *  (-1);   //내림 차순
	}

	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return 0;
	}
}



