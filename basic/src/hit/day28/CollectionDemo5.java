package hit.day28;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class CollectionDemo5 {
	public static void main(String[] args) {
		CollectionDemo5 obj=new CollectionDemo5();
		Set<Question> qset=obj.getQuestionSet();
		
		System.out.println(qset);
	}
	
	public Set<Question> getQuestionSet(){
//		Set<Question> questionSet=new TreeSet<>(new MyQuestionComparator());//using Comparator
		Set<Question> questionSet=new TreeSet<>((q1,q2)->{return q2.qid.compareTo(q1.qid);});//using Lambda
//		Set<Question> questionSet=new TreeSet<>(new Comparator<Question>() {//using inner class
//			@Override
//			public int compare(Question o1, Question o2) {
//			
//				return o1.compareTo(o2);
//			}
//		});
		Question q1=new Question("1", "who is cm", "chiefmember", "chiefminister", "chiefmajor", "2");
		Question q2=new Question("2", "who is pm", "primemember", "primeminister", "primemajor", "2");
		Question q3=new Question("3", "who is dm", "districtmember", "districtmajistrate", "districtmajor", "2");
		Question q4=new Question("4", "who is hm", "headmember", "headmaster", "headmajor", "2");
		Question q5=new Question("5", "who is cm", "chiefmember", "chiefminister", "chiefmajor", "2");
		questionSet.add(q1);
		questionSet.add(q2);
		questionSet.add(q3);
		questionSet.add(q4);
		questionSet.add(q5);
		
		return questionSet;
	}
}
class MyQuestionComparator implements Comparator<Question>{
	@Override
	public int compare(Question o1, Question o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}
class Question implements Comparable<Question>{
	String qid,question,option1,option2,option3,answer;
	public Question(String qid, String question, String option1, String option2, String option3, String answer) {
		this.qid = qid;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", answer=" + answer + "]\n";
	}
	@Override
	public int compareTo(Question o) {
		return this.qid.compareTo(o.qid);//Ascending order
//		return o.qid.compareTo(this.qid);//Descending order
	}
}
