package chap03;

import java.io.Console;

import chap03.assembler.Assembler;

public class MainForAssembler {

	public static void main(String[] args) {
		Assembler assmbler = new Assembler();
		
		Console console = System.console();
		if (console == null) {
			System.out.println("no console");
			return;
		}
		while(true) {
			String command = console.readLine("명령어 입력: ");
			if (command.equalsIgnoreCase("exit")) {
				break;
			}
			if (command.startsWith("new ")) {
				continue;
			} else if (command.startsWith("change ")) {
				continue;
			}
			System.out.println("사용법:");
			System.out.println("new 이메일 이름 암호 암호확인");
			System.out.println("change 이메일 현재비번 변경비번");
		}
	}
}
