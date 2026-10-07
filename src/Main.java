public class Main {

    public static void main(String[] args) {

        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();
        StreamingPlayer player = new StreamingPlayer();
        RoomLights lights = new RoomLights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, sound, player, lights);

        homeTheater.watchMovie("Design Patterns: The Movie");
        homeTheater.endMovie();
    }
}
