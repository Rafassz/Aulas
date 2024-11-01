package collection;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {

		HashMap<Long, String> pessoa = new HashMap<>();

		pessoa.put(1345325342L, "Felipe");
		pessoa.put(1345325345L, "Sansão");
		pessoa.put(1345325343L, "Sansão");

		System.out.println(pessoa);

		System.out.println(" " + pessoa.get(1345325343L));

	}

}
