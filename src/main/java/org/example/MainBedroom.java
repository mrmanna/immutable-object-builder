package org.example;

public final class MainBedroom {
    private final String wallColor;
    private final String bedType;
    private final boolean hasAirConditioner;

    private MainBedroom(Builder builder) {
        this.wallColor = builder.wallColor;
        this.bedType = builder.bedType;
        this.hasAirConditioner = builder.hasAirConditioner;
    }

    public String getWallColor() {
        return wallColor;
    }

    public String getBedType() {
        return bedType;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    @Override
    public String toString() {
        return "MainBedroom{" +
                "wallColor='" + wallColor + '\'' +
                ", bedType='" + bedType + '\'' +
                ", hasAirConditioner=" + hasAirConditioner +
                '}';
    }

    public static class Builder {
        private String wallColor = "White";
        private String bedType = "Queen Size";
        private boolean hasAirConditioner = true;

        public Builder wallColor(String wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public Builder bedType(String bedType) {
            this.bedType = bedType;
            return this;
        }

        public Builder hasAirConditioner(boolean hasAirConditioner) {
            this.hasAirConditioner = hasAirConditioner;
            return this;
        }

        public MainBedroom build() {
            return new MainBedroom(this);
        }
    }
}
