import java.util.Scanner;

public class TempoDeJogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, tempoJogo;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaFinal > horaInicial) {
			tempoJogo = horaFinal - horaInicial;
			System.out.printf("O JOGO DUROU %d HORA(S)", tempoJogo);
		}
		else {
			tempoJogo = (24 - horaInicial) + horaFinal;
			System.out.printf("O JOGO DUROU %d HORA(S)", tempoJogo);
		} 

		sc.close();
	}
}

// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.