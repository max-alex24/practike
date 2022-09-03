package online_tusur.unit_online_tusur;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestFactory;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class testFactoryJUnit {



 Student s1 = new Student();
 
 Student s2 = new Student();
 
   @TestFactory
   
  Stream <DynamicTest> dynamicTest()
    {
	   
Student [] students= {new Student("Ivan","Petrov",21),new Student("Petr","Ivanov",30),new Student("Nikolai","Kozin",45)};
String [] str1= {"Ivan","Petr","Nicolai"};
String [] str2= {"Ivanov","Petrov","Kozin"};
Integer [] age= {21,30,45};

List<DynamicTest> list=new ArrayList<>();

for (int=0; i<students.length; i++) {
	int k=i;
	DynamicTest dFirstname=DynamicTest.dynamicTest("Dynamic TestFirstname=",
			()->{assertEquals(str1[k],students[k].getFirstName());});
	
	DynamicTest dLastname=DynamicTest.dynamicTest("Dynamic age=",
			()->{assertEquals(str2[k],students[k].getLastName());});

	DynamicTest dAge=DynamicTest.dynamicTest("Dynamic TestLastname=",
			()->{assertEquals(age[k],students[k].getAge());});
list.add(dFirstname);
list.add(dLastname);
list.add(dAge);
}
   

return list.stream();

    	
    }
	   
   }
  
   
   
   
   