/**
 * 
 */
package com.mycompany.finalpart3;

/**
 * @author MaryBeth
 *
 */
public class TeacherImpl extends PersonBaseImpl implements Teacher {

	public String thoughtCourseTitle;
	
	public TeacherImpl(String _name, String _thoughtCourseTitle)
	{
		super(_name);
		thoughtCourseTitle = _thoughtCourseTitle;	
	}
	
	@Override
	public String getDetails() 
	{
		return name;
	}

	
	@Override
	public String teachesFor() 
	{
		return thoughtCourseTitle;
	}

}
