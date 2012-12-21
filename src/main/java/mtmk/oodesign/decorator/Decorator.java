package mtmk.oodesign.decorator;

public abstract class Decorator implements IntQueue {
	protected IntQueue component;

	public Decorator(IntQueue component) {
		this.component = component;
	}

	public int get() {
		return component.get();
	}
}

class Doubling extends Decorator {

	public Doubling(IntQueue component) {
		super(component);
	}

	@Override
	public void put(int x) {
		component.put(x * 2);
	}

}

class Incrementing extends Decorator {

	public Incrementing(IntQueue component) {
		super(component);
	}

	@Override
	public void put(int x) {
		component.put(x + 1);
	}

}

class Filtering extends Decorator {

	public Filtering(IntQueue component) {
		super(component);
	}

	@Override
	public void put(int x) {
		if (x > 0)
			component.put(x);
	}

}