package Repositories;
import java.util.ArrayList;
import java.util.List;
import Models.Games;

public class GamesRepo {
    public static void Games(){
        List <Games> juegos = new ArrayList<>();

        Games halo = new Games("Halo", 8.99, "Juego de humanos contra aliens", "FPS");
        Games hollow = new Games ("Hollow Knight", 6.20, "Juego muy complicado", "Plataforma");
        Games fornite = new Games ("Fornite", 0.00, "Battle Royale", "shooter");
        Games stardewValley = new Games("Stardew Valley", 14.99, "Simulación", "RPG de Granjas");
        Games celeste = new Games("Celeste", 19.99, "Plataformas", "Aventura");
        Games terraria = new Games("Terraria", 9.99, "Sandbox", "Supervivencia");
        Games geometryDash = new Games("Geometry Dash", 1.99, "Arcade", "Ritmo");
        Games eldenRing = new Games("Elden Ring", 59.99, "Rol de Acción", "Soulslike");
        Games expedition33 = new Games("Clair Obscur: Expedition 33", 49.99, "RPG", "Por turnos");
        Games payday = new Games("PayDay", 39.99, "Shooter", "Atracos");

        juegos.add(halo);
        juegos.add(hollow);
        juegos.add(fornite);
        juegos.add(stardewValley);
        juegos.add(celeste);
        juegos.add(terraria);
        juegos.add(geometryDash);
        juegos.add(eldenRing);
        juegos.add(expedition33);
        juegos.add(payday);
    }
}
