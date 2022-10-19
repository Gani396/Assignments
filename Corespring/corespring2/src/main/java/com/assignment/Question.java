package com.assignment;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionsId;
	private String question;
	private List<String> answers;
	private Set<String> setanswer;
	private Map<Integer, String> mapanswer;
	
	
	
	public int getQuestionsId() {
		return questionsId;
	}



	public void setQuestionsId(int questionsId) {
		this.questionsId = questionsId;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public List<String> getAnswers() {
		return answers;
	}



	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}



	public Set<String> getSetanswer() {
		return setanswer;
	}



	public void setSetanswer(Set<String> setanswer) {
		this.setanswer = setanswer;
	}



	public Map<Integer, String> getMapanswer() {
		return mapanswer;
	}



	public void setMapanswer(Map<Integer, String> mapanswer) {
		this.mapanswer = mapanswer;
	}



	public void  displayList(){
		System.out.println("Question Id :"+questionsId);
		System.out.println("Question  :"+ question );
		for(String answer:answers) {
			System.out.println("Answer = "+ answer);
			
		}
	}
	public void  displaySet(){
		System.out.println("Question Id :"+questionsId);
		System.out.println("Question  :"+ question );
		for(String answer: setanswer) {
			System.out.println("Answer = "+ answer);
			
		}
	}
	
	public void  displayMap(){
		System.out.println("Question Id :"+questionsId);
		System.out.println("Question  :"+ question );
		for(Map.Entry<Integer,String> answer: mapanswer.entrySet()) {
			System.out.println("Answer = "+ answer);
			
		}
	}

}
