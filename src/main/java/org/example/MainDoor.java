package org.example;

public final class MainDoor {
    public String getDoorType() {
        return doorType;
    }

    @Override
    public String toString() {
        return "MainDoor{" +
                "doorType='" + doorType + '\'' +
                ", doorMaterial='" + doorMaterial + '\'' +
                ", doorColor='" + doorColor + '\'' +
                '}';
    }

    public String getDoorMaterial() {
        return doorMaterial;
    }

    public String getDoorColor() {
        return doorColor;
    }

    private  String doorType;
    private final String doorMaterial;
    private final String doorColor;

    private MainDoor(Builder builder) {
        this.doorType = builder.doorType;
        this.doorMaterial = builder.doorMaterial;
        this.doorColor = builder.doorColor;
    }

    // Getters...

    public static class Builder {
        private String doorType = "Wooden Door";
        private String doorMaterial = "Wood";
        private String doorColor = "Brown";

        public Builder doorType(String doorType) {
            this.doorType = doorType;
            return this;
        }

        public Builder doorMaterial(String doorMaterial) {
            this.doorMaterial = doorMaterial;
            return this;
        }

        public Builder doorColor(String doorColor) {
            this.doorColor = doorColor;
            return this;
        }

        public MainDoor build() {
            return new MainDoor(this);
        }
    }
}
