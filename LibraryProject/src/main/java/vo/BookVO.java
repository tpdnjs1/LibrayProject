package vo;

public class BookVO {
	private int num;
	String title;
	String author;
	String company;
	int price;
	char rent;
	
	public BookVO()
	{
		super();
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany()
	{
		return company;
	}
	
	public void setRent(char rent) {
		this.rent = rent;
	}
	
	public char getRent()
	{
		return rent;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}
}
