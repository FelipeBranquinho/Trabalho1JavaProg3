package jrfp;
import java.util.*;

public class ComparatorInts implements Comparator<Object>{
	public Map<Object,Object> base;
	
	public ComparatorInts(Map<Object,Object> base){
		this.base = base;
	}
	
	@Override
	public int compare(Object base1, Object base2){
		return ((Integer)base.get(base1)).compareTo((Integer)base.get(base2));
	}
};