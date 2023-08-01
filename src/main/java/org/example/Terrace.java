package org.example;

public final class Terrace {
    private final String view;
    private final int size;
    private final boolean hasGarden;

    private Terrace(Builder builder) {
        this.view = builder.view;
        this.size = builder.size;
        this.hasGarden = builder.hasGarden;
    }

    // Getters...

    @Override
    public String toString() {
        return "Terrace{" +
                "view='" + view + '\'' +
                ", size=" + size +
                ", hasGarden=" + hasGarden +
                '}';
    }

    public String getView() {
        return view;
    }

    public int getSize() {
        return size;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public static class Builder {
        private String view = "City View";
        private int size = 200;
        private boolean hasGarden = false;

        public Builder view(String view) {
            this.view = view;
            return this;
        }

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        public Builder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Terrace build() {
            return new Terrace(this);
        }
    }
}
