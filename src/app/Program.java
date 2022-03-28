package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Lesson> duration = new ArrayList<>();
		
		int soma = 0;
		System.out.println("Quantas aulas tem o curso");
		int qtd = sc.nextInt();
		for (int i = 0; i < qtd; i++) {
			System.out.println("Dados aula");
			System.out.println("-----------------");
			System.out.println("Conte�do ou tarefa");
			char x = sc.next().charAt(0);
			if (x == 'c') {
				System.out.println("T�tulo:");
				String title = sc.next();
				System.out.println("URL do v�deo:");
				String url = sc.next();
				System.out.println("Dura��o em segundos:");
				int seconds = sc.nextInt();
				Video v = new Video(title, url, seconds);
				duration.add(v);
				soma += v.duration();
			}
			if (x == 't') {
				System.out.println("T�tulo:");
				String title1 = sc.next();
				System.out.println("Descri��o:");
				String descricao = sc.next();
				System.out.println("Quantidade de quest�es:");
				int question = sc.nextInt();

				Task t = new Task(title1, descricao, question);
				duration.add(t);
				soma += t.duration();
			}
			System.out.println("-------------------------------------------");

		}
		
		System.out.println("DURA��O TOTAL DO CURSO :" + soma + " SEGUNDOS");

	}

}
