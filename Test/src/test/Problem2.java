package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem2 {

	public static void main(String[] args) throws Exception {
		SqlQuery obj = new SqlQuery();
		String query1 = "select * from sdetails as details where sid=101 and fname='praveen' or fname='john'";
		String query2 = "select sid,fname,lname,dob,address from sdetails as details";
		String query3 = "Select fname from sdetails WHERE sid in (SELECT sid from sdetails where fname='praveen'and fname='rahul').";
		String query4 = "select * from sdeatils";

		//to get conditions using 1st query
		String[] res = obj.get_Conditions(query1);
		System.out.println(res.toString());
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		//to get columns using 2nd query
		Map<String, List> map1 = new HashMap<String, List>();
		map1 = obj.getcollums(query2);

		for (Map.Entry<String, List> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		//to get subqueries using 3rd query
		List<String> list1 = new ArrayList<String>();
		list1 = obj.getSubquer(query3);
		list1.forEach(System.out::println);
		// to read data from csv files using the 4th wuery
		ReadData obj1 = new ReadData();
		ReadData obj2 = new ReadData();
		obj1.Csv("C:\\Users\\gita.s\\OneDrive - Brillio\\Desktop/Details.txt");
		obj2.Csv("C:\\Users\\gita.s\\OneDrive - Brillio\\Desktop/Smarks.txt");
		List<String> list2 = new ArrayList<String>();
		list2 = obj1.getData(query4);
		list2.forEach(System.out::println);
		
		List<String> list3 = new ArrayList<String>();
		list3 = obj2.getData(query4);
		list3.forEach(System.out::println);
	}

}
