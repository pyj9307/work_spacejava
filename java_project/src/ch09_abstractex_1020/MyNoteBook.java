package ch09_abstractex_1020;

public class MyNoteBook extends NoteBook{

	@Override
	public void typing() {
		System.out.println("MyNoteBook Typing()");
	}
	
	@Override
	public void display() {
		System.out.println("MyNoteBook Display()");		
	}

}
