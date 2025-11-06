import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");
        
        System.out.print("Digite a massa inicial (kg): ");
        float massaInicial = scanner.nextFloat();
        
        System.out.print("Digite o volume inicial (m³): ");
        float volumeInicial = scanner.nextFloat();

        float densidadeInicial = (volumeInicial > 0) ? massaInicial / volumeInicial : 0;
        System.out.println("Densidade inicial calculada (kg/m³): " + densidadeInicial);
        
        System.out.print("Digite a altura inicial (m): ");
        float alturaInicial = scanner.nextFloat();

        CorpoHumano c1 = new CorpoHumano(massaInicial, volumeInicial, densidadeInicial, alturaInicial);

        System.out.println("\n=== VALORES INICIAIS ===");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Volume: " + c1.getVolume() + " m³");
        System.out.println("Densidade: " + c1.getDensidade() + " kg/m³");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("IMC: " + c1.calcularIMC());

        System.out.print("\nDigite uma nova massa (kg): ");
        float novaMassa = scanner.nextFloat();
        c1.setMassa(novaMassa);

        System.out.print("Digite uma nova altura (m): ");
        float novaAltura = scanner.nextFloat();
        c1.setAltura(novaAltura);
        
        System.out.println("\nNovos valores:");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("Novo IMC: " + c1.calcularIMC());
        
        scanner.close();
    }
}