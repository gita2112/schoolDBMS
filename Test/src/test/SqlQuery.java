package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlQuery  {
	
	public String[] getTables(String str) throws Exception  {
	
		String[] s2=null;
		String[] s1= str.split("from");
		if(s1[1].contains("as"))
		{
			s2=s1[1].split("as");
		}
		return s2;
}
	public String[]  get_Conditions(String str) {
		String[] s1= str.split("where");
		String[] s2=s1[1].split("and|or");
		return s2;
		
	}
	public Map<String, List> getcollums(String str){
		String[] names=null;
		String[] name=str.split("from");
		if(name[1].contains("as"))
		{
			names=name[1].split("as");
		}
		
		String[] col=str.split("select");
		String[] col1=col[1].split("from");
		String[] col2=col1[0].split(",");
		List list= new ArrayList<>();
		for(int i=0;i<col2.length;i++) {
			list.add(col2[i]);	
		}
		String tablename="";
		for(int i=0;i<names.length;i++) {
			tablename=tablename+names[i];
		}
		Map<String,List> map = new HashMap<String, List>();
		map.put(tablename, list);
		return map;
		
	}
	public List<String>   getSubquer(String str){
		String[] s1= str.split("(");
		String[] s2=s1[1].split(")");
		
		List<String> list = new ArrayList<String>();
		for(int i=0;i<s2.length;i++) {
			list.add(s2[i]);
		}
//		list.add(s2[0]);
		return list;
		
	}

	
}