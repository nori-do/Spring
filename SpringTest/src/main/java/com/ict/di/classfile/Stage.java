package com.ict.di.classfile;

public class Stage {
	
	private Singer singer; // ���뿡 ���� ����
	// ����� ������ �־�� �����Ѵ�.
	
	public  Stage(Singer singer) {
		this.singer = singer; // ���뿡 �� ������ �Է��ؾ� ������ ������ �����ϰ� 
	}
	
	public void perform() {
		System.out.print("���뿡�� ");
		this.singer.sing();
	}
}
