//1/ The code that violates the principle.

public class Notice(){
	private String content;
	private Time date;
	public void __construct(String content, Time date){
		this.content = content;
		this.date = date;
	}
   	public void getContent() {
	    return content;
	}

	public void print(){
		System.out.println(this.content);
	}
}

public static void main(String[] args) {
	Notice notice = new Notice("abc",time);
	notice.print();
}

//2/ The code to fix that violation.

public class Notice(){
	private String content;
	private Time date;
	public void __construct(String content, Time date){
		this.content = content;
		this.date = date;
	}
   	public void getContent() {
	    return content;
	}
}

public class Printer() {
	public void printNotice(Notice notice){
		System.out.println(notice.getContent);
	}
}

public static void main(String[] args) {
	Notice notice = new Notice("abc",time);
	Printer printer = new printer();
	printer.printNotice(notice);
}	