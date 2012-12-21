package mtmk.oodesign.decorator;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

/*
 * 具体组件角色
 */
public class BaseIntQueue implements IntQueue {

	private List<Integer> buff = new ArrayList<Integer>();
	public int get() {
		return buff.remove(0);
	}

	public void put(int x) {
		buff.add(x);
	}

	public static void main(String[] args){
		IntQueue queue = new BaseIntQueue();
		IntQueue mix = new Filtering(new Incrementing(new Doubling(queue)));
		mix.put(-1);
		mix.put(100);		
		out.println(queue.get());
	}
}
