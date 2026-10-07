public class HomeTheaterFacade {

    private static final int DEFAULT_VOLUME = 20;

    private final Projector projector;
    private final SoundSystem sound;
    private final StreamingPlayer player;
    private final RoomLights lights;

    public HomeTheaterFacade(Projector projector, SoundSystem sound,
                             StreamingPlayer player, RoomLights lights) {
        this.projector = projector;
        this.sound = sound;
        this.player = player;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        lights.dim();
        projector.on();
        sound.on();
        sound.setVolume(DEFAULT_VOLUME);
        player.play(movie);
    }

    public void endMovie() {
        player.stop();
        sound.off();
        projector.off();
        lights.on();
    }
}
