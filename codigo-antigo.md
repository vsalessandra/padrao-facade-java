# Código antigo (antes do padrão Facade)
## Projector
```java
public class Projector {

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }
}
```

## SoundSystem
```java
public class SoundSystem {

    public void on() {
        System.out.println("Sound system on");
    }

    public void setVolume(int volume) {
        System.out.println("Volume: " + volume);
    }

    public void off() {
        System.out.println("Sound system off");
    }
}
```

## StreamingPlayer
```java
public class StreamingPlayer {

    public void play(String movie) {
        System.out.println("Playing: " + movie);
    }

    public void stop() {
        System.out.println("Playback stopped");
    }
}
```

## RoomLights
```java
public class RoomLights {

    public void dim() {
        System.out.println("Lights dimmed");
    }

    public void on() {
        System.out.println("Lights on");
    }
}
```

## Main
```java
public class Main {

    public static void main(String[] args) {

        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();
        StreamingPlayer player = new StreamingPlayer();
        RoomLights lights = new RoomLights();

        lights.dim();
        projector.on();
        sound.on();
        sound.setVolume(20);
        player.play("Design Patterns: The Movie");

        player.stop();
        sound.off();
        projector.off();
        lights.on();
    }
}
```

## Problema
O cliente precisa conhecer os quatro equipamentos e a ordem exata das chamadas para iniciar um filme. Isso gera três problemas:

Duplicação: qualquer outra parte do sistema que inicie uma sessão tem que repetir a mesma sequência.
Manutenção difícil: se a preparação da sala mudar, é preciso alterar todos os lugares onde a sequência aparece.
Acoplamento alto: o cliente fica preso aos detalhes dos equipamentos, e é fácil esquecer uma etapa.