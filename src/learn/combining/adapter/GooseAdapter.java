package learn.combining.adapter;

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
