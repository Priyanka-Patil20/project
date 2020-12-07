package com.vwits.model;

public class Result {

String name;
int marks;
int totalmarks;
public Result(String name, int marks, int totalmarks) {
	super();
	
	this.name = name;
	this.marks = marks;
	this.totalmarks = totalmarks;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getTotalmarks() {
	return totalmarks;
}
public void setTotalmarks(int totalmarks) {
	this.totalmarks = totalmarks;
}
@Override
public String toString() {
	return "Result [name=" + name + ", marks=" + marks + ", totalmarks=" + totalmarks + "]";
}

}
