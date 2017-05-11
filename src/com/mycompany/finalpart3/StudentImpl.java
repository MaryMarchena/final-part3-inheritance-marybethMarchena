/**
 * 
 */
package com.mycompany.finalpart3;

/**
 * @author MaryBeth
 *
 */
public class StudentImpl extends PersonBaseImpl implements Student {

	public String takenCourseTitle;
	
	public StudentImpl(String _name, String _takenCourseTitle)
	{
		super(_name);
		takenCourseTitle = _takenCourseTitle;	
	}
	
	@Override
	public String getDetails()
	{
		return name;
	}

	
	@Override
	public String studiesFor()
	{
		return takenCourseTitle;
	}

}
