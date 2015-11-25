package com.j2.iterator.dinermerger.after;
import java.util.ArrayList;

public class VegetarianIterator implements Iterator {
    ArrayList iteratorList;
	VegetarianIterator(Iterator pancakeIterator, Iterator DinerMenuIterator) {
		
		iteratorList=new ArrayList();
		iteratorList.add(pancakeIterator);
		iteratorList.add(DinerMenuIterator);

	}
	public void addIterator(Iterator iterator){
		iteratorList.add(iterator);
	}

	public boolean hasNext() {
		for(int i=0;i<iteratorList.size();i++){
			Iterator iterator=(Iterator)iteratorList.get(i);
			if(iterator.hasNext())
				return true;
		}
	return false;		
	}
		
		

	@Override
	public Object Next() {
		for(int i=0;i<iteratorList.size();i++){
			Iterator iterator=(Iterator)iteratorList.get(i);
			if(iterator.hasNext())
				return iterator.Next();
		}
		return null;
	}
	

}
