package com.j2.adapter.caseExtension;

import java.util.*;

public class TestDrive {
public static void main(String ar[]){
	Vector v=new Vector();
	for(int i=0;i<ar.length;i++){
	v.add(ar[i]);
	}
	Iterator iterator=new EnumeratorAdapter(v.elements());
	while (iterator.hasNext()) {
		System.out.println((String)iterator.next());
	
}

}

}
