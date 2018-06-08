class SwitchAndIfDemo {
	public static void main(String artags[]) {
		String fruit = "pineapple";
		switch(fruit) {
			case "apricot":
				System.out.println("apricot");
				break;
			case "apple":
				System.out.println("apple");
				break;
			case "orange":
				System.out.println("orange");
				break;
			case "kivi":
				System.out.println("kivi");
				break;
			case "pineapple":
				System.out.println("pineapple");
				break;
			default:
				System.out.println("No matches");
				break;
		 	}

			if (fruit == "apricot") {
				System.out.println("apricot");
			} else if (fruit == "apple") {
				System.out.println("apple");
			} else if (fruit == "orange") {
			        System.out.println("orange");
			} else if (fruit == "kivi") {
				System.out.println("kivi");
			} else if (fruit == "pineapple") {
				System.out.println("pineapple");
			} else {
				System.out.println("No matches");
			}
     	  }					
}
