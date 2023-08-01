package org.example;

public final class Lobby {
    private final String style;
    private final int area;
    private final boolean hasFurniture;

    private Lobby(Builder builder) {
        this.style = builder.style;
        this.area = builder.area;
        this.hasFurniture = builder.hasFurniture;
    }


    public String getStyle() {
        return style;
    }

    public int getArea() {
        return area;
    }

    public boolean isHasFurniture() {
        return hasFurniture;
    }

    @Override
    public String toString() {
        return "Lobby{" +
                "style='" + style + '\'' +
                ", area=" + area +
                ", hasFurniture=" + hasFurniture +
                '}';
    }

    public static class Builder {
        private String style = "Classic";
        private int area = 300;
        private boolean hasFurniture = true;

        public Builder style(String style) {
            this.style = style;
            return this;
        }

        public Builder area(int area) {
            this.area = area;
            return this;
        }

        public Builder hasFurniture(boolean hasFurniture) {
            this.hasFurniture = hasFurniture;
            return this;
        }

        public Lobby build() {
            return new Lobby(this);
        }
    }
}