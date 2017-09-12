import java.util.Date;
import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup extends Student implements StudentArrayOperation {
    int i;
	private Student[] students;
	LinkedList<Student> ll=new LinkedList<Student>();


	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}



     }
	@Override
	public Student[] getStudents() {
    int j=0;
    Student [] s1=new Student[ll.size()];
		// Add your implementation here
		if(ll.size()==0){
		    Object ob[]=ll.toArray();
                for(Object ob1:ob)
                {
                    s1[j++]=ob1;
                }
		return s1;
		}

		return null;
	}

	@Override
	public void setStudents(Student[] students) {
	 	// Add your implementation here
	 	for(Student s1:students)
     {
         ll.add(s1);

     }
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here

		Student s1=ll.get(index);
		if(s1!=null){
            return s1;
		}
		else
        {
            return null;
        }

	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		ll.set(index,student);

	}

	@Override
	public void addFirst(Student student) {

    // Add your implementation here

    ll.addFirst(student);




	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		ll.addLast(student);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		ll.add(index,student);

	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		ll.remove(index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		ll.remove(student);


	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		for(i=index;i<ll.size();i++)
		ll.remove(i);
	}

	@Override
	public void removeFromElement(Student student) {
	    int index=ll.indexOf(student);
	    for(i=index;i<ll.size();i++)
        {
        ll.remove(i);
        }

		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		for(ii=0;i<index;i++)
        {
		ll.remove(i);
        }
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int index=ll.indexOf(student);
		for(i=0;i<index;i++)
        {
		ll.remove(i);
        }
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	ll.bubbleSort();


	}

	@Override
	public Student[] getByBirthDate(Date date) {

        }
		// Add your implementation here

		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation



	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int index=ll.getIndex(Student);
		if(index!=ll.size()-1)
        {
            return ll.get(index+1);

        }
        else
        {
        return null;
        }

	}
}
