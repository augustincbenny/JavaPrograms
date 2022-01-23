public class stringsort
{
  public static void main(String args[])
  {
	  int words;
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.print("enter the number of words in the list:");
	  words=sc.nextInt();
	  
	  String[] wordList=new String[words];
	  
	  System.out.println("enter the words in the list:");
	  sc.nextLine();
	  for (int i=0;i<words;i++)
	      wordList[i] =sc.nextLine();
	      
	      Arrays.sort(wordList);
	      
	      System.out.print("\nsorted List: ");
	      for (String word :wordList)
	          System.out.print(word + " ");
		  }
	  }
