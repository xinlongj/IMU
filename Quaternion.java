package com.example.imu;

public class Quaternion {
	public Quaternion(){
		
	}
	
	public Quaternion(double sEq_1, double sEq_2, double sEq_3, double sEq_4){
		SEq_1 = sEq_1;
		SEq_2 = sEq_2;
		SEq_3 = sEq_3;
		SEq_4 = sEq_4;
		
	}
	public String toString(){
		
		SEq_1 = SEq_1;
		SEq_2 = 0 - SEq_2;
		SEq_3 = 0 - SEq_3;
		SEq_4 = SEq_4;
		
		return SEq_1 + " " + SEq_2 + " " + SEq_3 + " " + SEq_4;
	}
	public double SEq_1;
	public double SEq_2;
	public double SEq_3;
	public double SEq_4;
}