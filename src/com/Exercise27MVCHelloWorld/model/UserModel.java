package com.Exercise27MVCHelloWorld.model;

public class UserModel 
{
	private int edad=0;
	private String nombre="";
	private int id=0;

//constructor sin parametros
	public UserModel()
	{
		
	}
	
	public UserModel(int id, String nombre,int edad )
	{
		this.edad=edad;
		this.nombre=nombre;
		this.id=id;
	}
	
	
	
////////////////GETERS AND SETERS/////////////////////////	
	
//////////////EDAD /////////////////////////	
	public int getEdad()
	{
		
		return edad;
	}
	
	
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	
//////////////NOMBRE /////////////////////////	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
////////////// ID /////////////////////////
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	
	
	
}


