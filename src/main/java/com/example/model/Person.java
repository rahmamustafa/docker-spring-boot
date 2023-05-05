package com.example.model;


public class Person implements Cloneable{
  
    private String name;
    private int age;

    public Person() {
        // Default constructor required for Externalizable
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private void send(){
        System.out.println("ssssss");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
