//Игра в угадывание букв.
class Guess {
	public static void main(String args [])
	throws java.io.IOException {
	char ch, answer = 'S';
	System.out.println("Зaдyмaнa буква из диапазона A-Z. 11");
	System.out.print("Пoпытaйтecь ее угадать: ");
	ch = (char) 
	System.in.read(); // получить символ с клавиатуры
	if(ch == answer) System.out.println("** Правильно! **");
        }
}
