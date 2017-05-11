/**
 * 
 */
package com.mycompany.finalpart3;

/**
 * @author MaryBeth
 *
 */
public abstract class PersonBaseImpl implements Person 
{

	public String name;
	
	public PersonBaseImpl(String _name)
	{
		name= _name;	
	}
	
	@Override
	public String getName() 
	{
		return name;
	}

}
