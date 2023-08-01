package org.example;

public final class WashRoom {
    private final String tileColor;
    private final int size;
    private final boolean hasBathtub;

    private WashRoom(Builder builder) {
        this.tileColor = builder.tileColor;
        this.size = builder.size;
        this.hasBathtub = builder.hasBathtub;
    }

    public String getTileColor() {
        return tileColor;
    }

    public int getSize() {
        return size;
    }

    public boolean isHasBathtub() {
        return hasBathtub;
    }

    @Override
    public String toString() {
        return "WashRoom{" +
                "tileColor='" + tileColor + '\'' +
                ", size=" + size +
                ", hasBathtub=" + hasBathtub +
                '}';
    }

    public static class Builder {
        private String tileColor = "Blue";
        private int size = 60;
        private boolean hasBathtub = true;

        public Builder tileColor(String tileColor) {
            this.tileColor = tileColor;
            return this;
        }

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        public Builder hasBathtub(boolean hasBathtub) {
            this.hasBathtub = hasBathtub;
            return this;
        }

        public WashRoom build() {
            return new WashRoom(this);
        }
    }
}