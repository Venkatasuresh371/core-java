package map;

import java.util.HashMap;

public class MergeTwoMaps {
	public static void main(String[] args) {
		HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<String, Integer>();
		subjectToStudentCountMap1.put("Maths", 45);
		subjectToStudentCountMap1.put("Physics", 57);
		subjectToStudentCountMap1.put("Chemistry", 52);
		subjectToStudentCountMap1.put("History", 41);
		
		HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();      
        subjectToStudentCountMap2.put("Economics", 49);
        subjectToStudentCountMap2.put("Maths", 42);
        subjectToStudentCountMap2.put("Biology", 41);
        subjectToStudentCountMap2.put("History", 55);

        
        HashMap<String, Integer> subjectToStudentCountMap3 = new HashMap<String, Integer>(subjectToStudentCountMap1);
        
        subjectToStudentCountMap2.forEach((key, value) -> subjectToStudentCountMap3.merge(key, value, (v1, v2) -> v1+v2));
         
        System.out.println("Map 1 : "+subjectToStudentCountMap1);
        System.out.println("Map 1 : "+subjectToStudentCountMap2);
        System.out.println("Map 1 : "+subjectToStudentCountMap3);
	}

}
