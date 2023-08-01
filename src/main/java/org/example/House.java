package org.example;

public final class House {
    private final MainDoor mainDoor;
    private final Terrace terrace;
    private final Lobby lobby;
    private final MainBedroom mainBedroom;
    private final GuestRoom guestRoom;

    private House(Builder builder) {
        this.mainDoor = builder.mainDoor;
        this.terrace = builder.terrace;
        this.lobby = builder.lobby;
        this.mainBedroom = builder.mainBedroom;
        this.guestRoom = builder.guestRoom;
    }

    public MainDoor getMainDoor() {
        return mainDoor;
    }

    public Terrace getTerrace() {
        return terrace;
    }

    public Lobby getLobby() {
        return lobby;
    }

    public MainBedroom getMainBedroom() {
        return mainBedroom;
    }

    public GuestRoom getGuestRoom() {
        return guestRoom;
    }

    @Override
    public String toString() {
        return "House{" +
                "mainDoor=" + mainDoor.toString() +
                ", terrace=" + terrace.toString() +
                ", lobby=" + lobby.toString() +
                ", mainBedroom=" + mainBedroom.toString() +
                ", guestRoom=" + guestRoom.toString() +
                '}';
    }

    public static class Builder {
        private MainDoor mainDoor;
        private Terrace terrace;
        private Lobby lobby;
        private MainBedroom mainBedroom;
        private GuestRoom guestRoom;

        public Builder mainDoor(Customizer<MainDoor.Builder> customizer) {
            this.mainDoor = customizer.customize(new MainDoor.Builder()).build();
            return this;
        }

        public Builder terrace(Customizer<Terrace.Builder> customizer) {
            this.terrace = customizer.customize(new Terrace.Builder()).build();
            return this;
        }

        public Builder lobby(Customizer<Lobby.Builder> customizer) {
            this.lobby = customizer.customize(new Lobby.Builder()).build();
            return this;
        }

        public Builder mainBedroom(Customizer<MainBedroom.Builder> customizer) {
            this.mainBedroom = customizer.customize(new MainBedroom.Builder()).build();
            return this;
        }

        public Builder guestRoom(Customizer<GuestRoom.Builder> customizer) {
            this.guestRoom = customizer.customize(new GuestRoom.Builder()).build();
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
