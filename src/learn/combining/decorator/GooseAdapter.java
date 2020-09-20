package learn.combining.decorator;

public class GooseAdapter implements Quackable{
	
	Goose goose;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		this.goose.honk();
	}

}
