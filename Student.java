public class Student{
	private String name;
	private char studentGroup;
	private static char [] groupName = {'A','B','C'};


	public Student(String name, char studentGroup){
		//this.name = name;
		//this.studentGroup = studentGroup;
		this.setName(name);
		this.setstudentGroup(studentGroup);
	}


	public String getName(){
		return this.name;
	}

	public char getstudentGroup(){
		return this.studentGroup;
	}

	public void setName(String name){ //Koden efter "=" giver altid et stort første bogstav
		this.name = name.substring(0,1).toUpperCase()+name.substring(1); 
	}

	public void setstudentGroup(char studentGroup){
		/*if (studentGroup == groupName){
			this.studentGroup = studentGroup;
		}
		}else{*/
		this.studentGroup = 'X'; 
		for (char c : groupName){
			if(studentGroup == c){
				this.studentGroup = studentGroup;
				}
		}
	} 
	@Override
	public String toString(){
		return "Student: "+name+", Group: "+studentGroup;
	}

}

