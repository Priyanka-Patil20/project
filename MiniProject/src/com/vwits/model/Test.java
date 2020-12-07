package com.vwits.model;

public class Test {
	
	int sr_no;
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	String correctans;
	int marks;
	public Test(int sr_no, String question, String option1, String option2, String option3, String option4,
			String correctans,int marks) {
		super();
		this.sr_no = sr_no;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctans = correctans;
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSr_no() {
		return sr_no;
	}
	public void setSr_no(int sr_no) {
		this.sr_no = sr_no;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getCorrectans() {
		return correctans;
	}
	public void setCorrectans(String correctans) {
		this.correctans = correctans;
	}
	@Override
	public String toString() {
		return "Test [sr_no=" + sr_no + ", question=" + question + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 + ", correctans=" + correctans + ", marks=" + marks
				+ "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correctans == null) ? 0 : correctans.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (correctans == null) {
			if (other.correctans != null)
				return false;
		} else if (!correctans.equals(other.correctans))
			return false;
		return true;
	}
}
