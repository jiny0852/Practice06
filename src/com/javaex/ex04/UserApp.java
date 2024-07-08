package com.javaex.ex04;

import java.util.Scanner;

public class UserApp {

	public static void main(String[] args) {
		
		
		User[] uArr = new User[3];
		
		User c1 = new Customer("jws", "j1234", "정우성", 1000);
		User c2 = new Customer("yjs", "y2345", "이효리", 2000);
		User e1 = new Employee("master", "m7788", "운영자", 5000000);
		
		
		c1.showInfo();
		c2.showInfo();
		e1.showInfo();
		
		System.out.println("운영자의 월급은 " + ((Employee)e1).getSalary() + "원 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		Scanner sc = new Scanner(System.in);
		
		User[] arr = new User[3];
		for(int i = 0; i < arr.length ; i++) {
			
			User u = new User();
			
			System.out.print("아이디를 입력하세요 : ");
			arr[i].setId(sc.nextLine());
			System.out.print("패스워드를 입력하세요 : ");
			arr[i].setPassword(sc.nextLine());
			System.out.print("이름을 입력하세요 : ");
			arr[i].setName(sc.nextLine());
			
		}
		
		
		
		
		

		sc.close();*/
	}

}
