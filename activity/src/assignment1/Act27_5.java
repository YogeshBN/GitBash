package assignment1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Bookstore
{
		int bookid;
		String bookname;
		
		public Bookstore(int bookid, String bookname) {
			super();
			this.bookid = bookid;
			this.bookname = bookname;
		}

		

		@Override
		public String toString() {
			return "Bookstore [bookid=" + bookid + ", bookname=" + bookname + "]";
		}
	}
	class id implements Comparator<Bookstore>
	{

	@Override
	public int compare(Bookstore arg0, Bookstore arg1) {
		if(arg0.bookid==arg1.bookid)
		{
			return 0;
		}
		else if (arg0.bookid > arg1.bookid)
		{
			return 1;
		}
		else 
			return -1;
		
	}
		
	}
	class name implements Comparator<Bookstore>{
	@Override
	public int compare(Bookstore o1, Bookstore o2) {
			return o1.bookname.compareTo(o2.bookname);
				
	}
	}
	public class Act27_5
	{
public static void main(String[] args) 
		{
			ArrayList<Bookstore> obj=new ArrayList<>();
			obj.add(new Bookstore(53,"Harry potter"));
			obj.add(new Bookstore(26,"Invisible"));
			obj.add(new Bookstore(87,"Beloved"));
			obj.add(new Bookstore(55,"Lord of the Rings"));
			obj.add(new Bookstore(54,"Iron mam"));

			System.out.println("Before Sorting::");
			for(Bookstore t:obj)
			{
				System.out.println(t);
			}
			System.out.println("Sorting(Based on Book id)::");
			Collections.sort(obj, new id());
				for(Bookstore t:obj)
				{
					System.out.println(t);
				}
			System.out.println("Sorting(Based on Book  name's)::");
		Collections.sort(obj, new name());
			for(Bookstore t:obj)
			{
				System.out.println(t);
			}
			

		}

	}