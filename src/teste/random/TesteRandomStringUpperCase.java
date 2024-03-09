package teste.random;

import java.util.Random;

public class TesteRandomStringUpperCase {
	
	public static void main(String[] args) {
		Random random = new Random();
	    random.ints(65, 90).limit(2)
	            .forEach(a -> System.out.println(Character.toString((char) a)));
	    
	    random.ints(97, 122).limit(2)
	            .forEach(a -> System.out.println(Character.toString((char) a)));
	    
		Integer[][] rangeSpecilChar = {{91,96}, {58,64}, {36,46}};
		int index = random.nextInt(rangeSpecilChar.length);
		Integer[] rand = rangeSpecilChar[index];
		
		random.ints(rand[0], rand[1]).limit(3)
        .forEach(a -> System.out.println(Character.toString((char) a)));
	}

}
