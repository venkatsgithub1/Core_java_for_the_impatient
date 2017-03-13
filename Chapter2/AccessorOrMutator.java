package com.java.accessorOrMutator;

public class AccessorOrMutator {

	private String name;
	private String department;

	public String getName() {
		return this.name;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String setNameAndStringAsAGift(String name) {
		this.name = name;
		return "Name is set!!!!!!";
	}

	public static void main(String[] args) {
		AccessorOrMutator aom = new AccessorOrMutator();
		System.out.println(aom.setNameAndStringAsAGift("Doe, John"));
    // Accessor will not change access or objects and will have to return something,
    // otherwise there is no point of calling.
    // Mutators may or maynot return anything. But changes the state of the object.
	}

}
