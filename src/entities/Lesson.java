package entities;

public abstract  class Lesson {

	
	private String title;

	public Lesson(String title) {
		super();
		this.title = title;
	}

	public Lesson() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public  abstract int duration();

	@Override
	public String toString() {
		return "Lesson [title=" + title + ", duration()=" + duration() + "]";
	}
	
}
