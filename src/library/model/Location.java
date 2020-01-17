package library.model;

public class Location {

	private int bookCaseNo, shelfNo;
	
	public Location (int bookCaseNo, int shelfNo) {
		this.bookCaseNo = bookCaseNo;
		this.shelfNo = shelfNo;
	}
	

	@Override
	public String toString() {
		return "Location: Bookcase " + bookCaseNo + ", Shelf " + shelfNo;
	}


	public int getBookcaseNo() {
		return bookCaseNo;
	}
	public void setBookcaseNo(int bookcaseNo) {
		this.bookCaseNo = bookcaseNo;
	}
	public int getShelfNo() {
		return shelfNo;
	}
	public void setShelfNo(int shelfNo) {
		this.shelfNo = shelfNo;
	}

}
