package com.ict.di;

import com.ict.di.classfile.Singer;
import com.ict.di.classfile.Stage;

public class DIMainJavaver {

	public static void main(String[] args) {
		// Singer�� �����ؼ� �뷡�ϰ� ��������
		Singer singer = new Singer();
		singer.sing();
		// Stage�� ���� ������ ���Ѻ�����.
		Stage stage = new Stage(singer);
		stage.perform();
	}

}
