import java.util.Random;

public class RandomSentences
{

	static Random rand = new Random();

	private static String[] article = new String[]
	{ "the", "a", "one", "some", "any" };
	private static String[] noun = new String[]
	{ "boy", "girl", "dog", "town", "car" };
	private static String[] verb = new String[]
	{ "drove", "jumped", "ran", "walked", "skipped" };
	private static String[] preposition = new String[]
	{ "to", "from", "over", "under", "on" };

	public static void main(String[] args)
	{
		for (int i = 0; i < 20; i++)
			System.out.println(createSentence(article, noun, verb, preposition));
	}

	public static String chooseWords(String[] array)
	{
		int r = rand.nextInt(5) + 0;
		return (array[r]);
	}

	
	public static String createSentence(String[] article, String[] noun, String[] verb, String[] preposition)
	{
		StringBuilder sb = new StringBuilder();

		String first = chooseWords(article);
		String capital = first.substring(0, 1).toUpperCase() + first.substring(1);

		sb.append(capital + " ");
		sb.append(chooseWords(noun) + " ");
		sb.append(chooseWords(verb) + " ");
		sb.append(chooseWords(preposition) + " ");
		sb.append(chooseWords(article) + " ");
		sb.append(chooseWords(noun) + ".");
		System.out.println("Here");
		String sentence = sb.toString();
		return sentence;

	}

}
