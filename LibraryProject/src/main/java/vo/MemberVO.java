package vo;

public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String address;
	private int Age;
	
	public MemberVO()
	{
		super();
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setPw(String pw)
	{
		this.pw = pw;
	}
	
	public String getPw()
	{
		return pw;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAge(int Age)
	{
		this.Age = Age;
	}
	
	public int getAge()
	{
		return Age;
	}
}
