/**
 * 
 */
package com.mycompany.finalpart3;

/**
 * @author MaryBeth
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Person p1, p2;
		Teacher t = new TeacherImpl("ilker", "java");
		Student s = new StudentImpl("MaryBeth","java");

		p1 = t;
		p2 = s;
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}

}
