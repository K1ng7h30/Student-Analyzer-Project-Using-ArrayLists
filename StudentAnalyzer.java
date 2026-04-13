import java.util.ArrayList;

public class StudentAnalyzer 
{
    private ArrayList<Student> studentList;

    public  StudentAnalyzer (ArrayList<Student> list)
    {
        studentList = list;
    }

    public  static void main(String [] args)
    {
        ArrayList<Student> classList = new ArrayList<Student>();

        classList.add(new Student("Angela", 93));
        classList.add(new Student("Atticus", 88));
        classList.add(new Student("Cassian", 55));
        classList.add(new Student("Dante", 82));
        classList.add(new Student("Hamlet", 72));
        classList.add(new Student("Octavia", 94));
        classList.add(new Student("Ronaldo", 94));
        classList.add(new Student("Socrates", 90));
        classList.add(new Student("Theo", 99));
        classList.add(new Student("Victor", 85));

        StudentAnalyzer analyzer = new StudentAnalyzer(classList);

        System.out.println("INITIAL LIST (10 students)");
        for (Student s : classList) {
            System.out.println("  " + s.getName() + " - " + s.getMarks());
        }

        // Part (a)
        System.out.println("countAbove(90): " + analyzer.countAbove(90));

        // Part (c)
        Student top = analyzer.findTopStudent();
        System.out.println("findTopStudent(): " + top.getName() + " (" + top.getMarks() + ")");

        // Part (d)
        ArrayList<Student> tops = analyzer.getTopStudents(90);
        System.out.println("getTopStudents(90): " + tops.size() + " students");
        for (Student s : tops) 
        {
            System.out.println("  " + s.getName() + " - " + s.getMarks());
        }

        // Part (e)
        System.out.println("hasDuplicateNames(): " + analyzer.hasDuplicateNames());

        // Part (f)
        System.out.println("isSorted(): " + analyzer.isSorted());

        // Part (g)
        System.out.println("countImprovingPairs(): " + analyzer.countImprovingPairs());

        // Part (b) - removal (done last because it modifies the list)
        System.out.println("removeFailing(70):");
        analyzer.removeFailing(70);
        System.out.println("Remaining students after removal:");
        for (Student s : classList) 
        {
            System.out.println("  " + s.getName() + " - " + s.getMarks());
        }

    }
        
    

    // part a
    public int countAbove(int threshold)
    {
        int count =0;
        for(Student s : studentList)
        {
            if(s.getMarks() > threshold)
            {
                count++;
            }
        }
        return count;
    }

    //part b
    public void removeFailing(int passMark)
    {
        for(int i = studentList.size()-1; i>=0; i--)
        {
            int studentMark = studentList.get(i).getMarks();
            if( studentMark < passMark)
            {
                 studentList.remove(i);
            }
        }
    }

    //part c
    public Student findTopStudent()
    {
        int topMarks = studentList.get(0).getMarks();
        int studentIndex = 0;
        
        for(int i=0; i < studentList.size(); i++)
        {
            if(studentList.get(i).getMarks() > topMarks)
            {
                topMarks = studentList.get(i).getMarks();
                studentIndex = i;
            }
        }
        return studentList.get(studentIndex);
    }

    //part d
    public ArrayList<Student> getTopStudents(int threshold)
    {
        ArrayList<Student> topStudents = new ArrayList<Student>();

        for(int i = studentList.size()-1; i >= 0; i--)
        {
            int studentMark = studentList.get(i).getMarks();
            if(studentMark >= threshold)
            {
                topStudents.add(studentList.get(i));
            }
        }
        return topStudents;
    }

    //part e
    public boolean hasDuplicateNames() 
    {
        for (int i = 0; i < studentList.size(); i++) 
        {
            String name1 = studentList.get(i).getName();
            for (int j = i + 1; j < studentList.size(); j++) 
            {
                String name2 = studentList.get(j).getName();
                if (name1.equals(name2)) 
                    {
                    return true;
                }   
            }
        }
    return false;
    }

    //part f
    public boolean isSorted()
    {
        for(int i = 0; i <studentList.size()-1; i++)
        {
            int mark1 = studentList.get(i).getMarks();
            int mark2 = studentList.get(i+1).getMarks();
            if(mark1 > mark2)
            {
                return false;
            }
        }
        return true;
    }

    //part g
    public int countImprovingPairs()
    {
        int count = 0;

        for(int i = 1; i < studentList.size(); i++)
        {
            int currentMark = studentList.get(i).getMarks();
            int previousMark = studentList.get(i-1).getMarks();
            if(currentMark > previousMark)
            {
                count++;
            }
        }
        return count;
    }
}
