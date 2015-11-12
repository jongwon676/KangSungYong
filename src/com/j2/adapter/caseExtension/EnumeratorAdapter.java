package com.j2.adapter.caseExtension;
import java.io.*;
import java.util.*;


public class EnumeratorAdapter implements Iterator{
Enumeration enumeration;
public EnumeratorAdapter(Enumeration enumeration){
	this.enumeration=enumeration;
}
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	public Object next() {
	return enumeration.nextElement();
	}
public void remove(){
	throw new UnsupportedOperationException();
}
}
