package vo;

public class RentVO {
	private int rentNum;
	private String memberId;
	private int bookNum;
	private String memberName;
	private String bookTitle;
	
	public RentVO()
	{
		
	}
	
	public void setRentNum(int rentNum) {
		this.rentNum = rentNum;
	}
	
	public int getRentNum()
	{
		return rentNum;
	}
	
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	
	public int getBookNum()
	{
		return bookNum;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberId()
	{
		return memberId;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMemberName()
	{
		return memberName;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookTitle()
	{
		return bookTitle;
	}
}
