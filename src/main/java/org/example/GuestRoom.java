package org.example;

public final class GuestRoom {
    private final String wallColor;
    private final String bedType;
    private final boolean hasAirConditioner;

    private GuestRoom(Builder builder) {
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
        return "GuestRoom{" +
                "wallColor='" + wallColor + '\'' +
                ", bedType='" + bedType + '\'' +
                ", hasAirConditioner=" + hasAirConditioner +
                '}';
    }

    public static class Builder {
        private String wallColor = "White";
        private String bedType = "Single Bed";
        private boolean hasAirConditioner = false;

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

        public GuestRoom build() {
            return new GuestRoom(this);
        }
    }
}