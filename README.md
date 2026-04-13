# StudentAnalyzer – ArrayList FRQ Project

## Student Name
Theo

## Project Description
AP Computer Science A FRQ 3 style project.  
`StudentAnalyzer` manages an `ArrayList<Student>` (name + marks).  
Implements all 7 required methods using proper ArrayList traversal.  
`main` creates 10 students and tests every method.

## Explanation of Algorithms
- **countAbove** – Enhanced for-loop counts students with marks > threshold.  
- **removeFailing** – Backward index loop safely removes students < passMark.  
- **findTopStudent** – Returns first `Student` object with highest marks.  
- **getTopStudents** – New `ArrayList` (original unchanged) with marks >= threshold.  
- **hasDuplicateNames** – Nested loops compare names with `.equals()`.  
- **isSorted** – Adjacent index comparison for non-decreasing marks order.  
- **countImprovingPairs** – Index loop counts where marks > previous student.

## Sample Output
INITIAL LIST (10 students)
Angela - 93
Atticus - 88
Cassian - 55
Dante - 82
Hamlet - 72
Octavia - 94
Ronaldo - 94
Socrates - 90
Theo - 99
Victor - 85
countAbove(90): 4
findTopStudent(): Theo (99)
getTopStudents(90): 5 students
Theo - 99
Socrates - 90
Ronaldo - 94
Octavia - 94
Angela - 93
hasDuplicateNames(): false
isSorted(): false
countImprovingPairs(): 3
removeFailing(70):
Remaining students after removal:
Angela - 93
Atticus - 88
Dante - 82
Hamlet - 72
Octavia - 94
Ronaldo - 94
Socrates - 90
Theo - 99
Victor - 85

## Challenges Faced
- Safe removal without skipping elements (used backward loop).  
- Keeping original list unchanged in `getTopStudents`.  
- Using required nested loops for duplicate detection.  
- Clear `main` output for testing all parts.
